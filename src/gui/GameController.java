package gui;

import java.util.LinkedHashMap;
import java.util.LinkedHashSet;

import data.Card;
import data.Director;
import data.Game;
import javafx.event.ActionEvent;
import javafx.event.Event;
import javafx.event.EventHandler;
import javafx.fxml.FXML;
import javafx.scene.control.Button;
import javafx.scene.control.CheckMenuItem;
import javafx.scene.control.MenuItem;
import javafx.scene.control.ProgressBar;
import javafx.scene.control.Slider;
import javafx.scene.control.TextArea;
import javafx.scene.control.TextField;
import javafx.scene.control.ToggleButton;
import javafx.scene.input.KeyCode;
import javafx.scene.input.KeyEvent;
import javafx.scene.input.MouseEvent;
import javafx.scene.text.Font;

public class GameController {

	private Game game;
	private LinkedHashSet<ToggleButton> toggleSet = new LinkedHashSet<ToggleButton>();
	private LinkedHashMap<ToggleButton, Card> toggleToCardMap = new LinkedHashMap<ToggleButton, Card>();
	private float points = 0f;
	private boolean kata = false;
	private boolean hira = true;
	private int MAX_POINTS = 74;
	
	@FXML
	public Slider pointReqSlider;
	@FXML
	public CheckMenuItem katakanaCheck;
	@FXML
	public CheckMenuItem hiraganaCheck;
	@FXML
	public MenuItem pointsReqLabel;
	
	@FXML
	public Button okButton;
	@FXML
	public Button restartButton;
	@FXML
	public Button shuffleButton;
	@FXML
	public Button hintButton;

	@FXML
	public ToggleButton toggleButton1;
	@FXML
	public ToggleButton toggleButton2;
	@FXML
	public ToggleButton toggleButton3;
	@FXML
	public ToggleButton toggleButton4;
	@FXML
	public ToggleButton toggleButton5;
	
	@FXML
	public TextField textField;
	@FXML
	public TextArea textArea;
	@FXML
	public ProgressBar progressBar;

	@FXML
	public void initialize(){
		
		toggleSet.add(toggleButton1);
		toggleSet.add(toggleButton2);
		toggleSet.add(toggleButton3);
		toggleSet.add(toggleButton4);
		toggleSet.add(toggleButton5);
		
		for(ToggleButton tb : toggleSet){
			tb.setFont(Font.font("Verdana",40));
			tb.setOnMouseClicked(new EventHandler<MouseEvent>() {
				@Override
				public void handle(MouseEvent event) {
					okButton.setDisable(false);
					for(ToggleButton tmp : toggleSet){
						if(tmp != tb){
							tmp.setSelected(false);
						}
					}
					System.out.println(toggleToCardMap.get(tb).getRomanji());
				}
			});
		}
		
		pointReqSlider.setOnMouseDragged(new EventHandler<Event>() {

			@Override
			public void handle(Event event) {
				pointsReqLabel.setText((int)pointReqSlider.getValue() + " Points");
				
			}
		});
		
		pointReqSlider.setOnMouseReleased(new EventHandler<Event>() {

			@Override
			public void handle(Event event) {
				MAX_POINTS = (int)pointReqSlider.getValue();
				refreshGUI();
			}
		});
		
		katakanaCheck.setOnAction(new EventHandler<ActionEvent>() {
			@Override
			public void handle(ActionEvent event) {
				kata = katakanaCheck.isSelected();
				restart();
			}
		});
		
		hiraganaCheck.setOnAction(new EventHandler<ActionEvent>() {
			@Override
			public void handle(ActionEvent event) {
				hira = hiraganaCheck.isSelected();
				restart();
			}
		});
		
		okButton.setOnMouseClicked(new EventHandler<MouseEvent>() {
			@Override
			public void handle(MouseEvent event) {
				check();
			}
		});
		
		restartButton.setOnMouseClicked(new EventHandler<MouseEvent>() {
			@Override
			public void handle(MouseEvent event) {
				restart();
			}
		});
		
		shuffleButton.setOnMouseClicked(new EventHandler<MouseEvent>() {
			@Override
			public void handle(MouseEvent event) {
				textArea.clear();
				game.shuffle();
				refreshGUI();
			}
		});
		
		hintButton.setOnMouseClicked(new EventHandler<MouseEvent>() {
			@Override
			public void handle(MouseEvent event) {
				hint();
			}
		});
		
		textField.getParent().setOnKeyPressed(new EventHandler<KeyEvent>() {
			@Override
			public void handle(KeyEvent event) {
				if(!okButton.isDisable() && event.getCode() == KeyCode.ENTER){
					check();
					event.consume();
				}
			}
		});
		restart();
	}
	
	public void restart(){
		game = new Game();
		setCards();
		game.init();
		points = 0;
		mapCards();
		
		MAX_POINTS = game.getCards().size();
		pointReqSlider.setDisable(false);
		pointReqSlider.setMax(game.getCards().size());
		pointReqSlider.setMin(1);
		pointReqSlider.setValue(MAX_POINTS);
		pointsReqLabel.setText(MAX_POINTS + " Points");
		textArea.clear();
		textField.clear();		
		progressBar.setProgress(0);
		okButton.setDisable(true);
		for(ToggleButton tb : toggleSet){
			tb.setDisable(false);
		}
		textArea.setFocusTraversable(false);;
		textArea.setEditable(false);
		refreshGUI();
	}
	
	private void setCards() {
		game.hira = hira;
		game.kata = kata;
	}

	private void mapCards() {
		int counter = 0;
		for(ToggleButton tb : toggleSet){
			if(counter < game.getCards().size()){
				toggleToCardMap.put(tb, Director.getCardFromHashset(counter, game.getDeck()));
				counter++;
			} else {
				tb.setDisable(true);
			}
		}
		
		
	}

	public void refreshGUI(){
		int counter = 0;
		mapCards();
		for(ToggleButton tb : toggleSet){
			Card tmp = Director.getCardFromHashset(counter, game.getDeck());
			if(tmp != null){
				tb.setText(tmp.getKana()+"");
			} else {
				tb.setText('\u272F'+"");
			}
			counter++;
		}
		if(points < 0){
			points = 0;
		}
		progressBar.setProgress(points/MAX_POINTS);
	}
	
	public void hint(){
		textArea.clear();
		if(game.getCards().size() >= 2){
			LinkedHashSet<Card> rndCards = Director.selectRandomCards(5, game.getDeck());
			for(Card c : rndCards){
				textArea.appendText(c.getRomanji() + "\n");
			}
		}
		if(points > 0.0){
			points -= 0.5;
		}
		refreshGUI();
	}
	
	public void check(){
		textArea.clear();
		ToggleButton selTB = null;
		for(ToggleButton tb : toggleSet){
			if(tb.isSelected()){
				selTB = tb;
			}
		}
		
		selTB.setSelected(false);
		okButton.setDisable(true);
		if(selTB != null && textField.getText().toLowerCase().equals(toggleToCardMap.get(selTB).getRomanji())){
			points++;
			game.getCards().remove(toggleToCardMap.get(selTB));
			pointReqSlider.setMin(pointReqSlider.getMin()+1);
		} else {
			if(points > 0.0){
				points--;
			}
		}
		game.shuffle();
		refreshGUI();
		textField.setText("");
		System.out.println("Cards left: " + game.getCards().size() + "; Points: " + points);
		if(points >= MAX_POINTS || game.getCards().size() == 0){
			endGame();
		}
	}
	
	public void endGame(){
		for(ToggleButton tb : toggleSet){
			tb.setDisable(true);
		}
		pointReqSlider.setDisable(true);
		toggleButton1.setText("W");
		toggleButton2.setText("I");
		toggleButton3.setText("N");
		toggleButton4.setText("\u272a");
		toggleButton5.setText("\u272a");
		okButton.setDisable(true);
		progressBar.setProgress(-1);
	}
	
	public void setGame(Game game){
		this.game = game;
	}
}
