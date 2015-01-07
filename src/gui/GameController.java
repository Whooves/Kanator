package gui;

import java.util.LinkedHashMap;
import java.util.LinkedHashSet;

import data.Card;
import data.Director;
import data.Game;
import javafx.event.EventHandler;
import javafx.fxml.FXML;
import javafx.scene.control.Button;
import javafx.scene.control.ProgressBar;
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
	private final int MAX_POINTS = 25;
	
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
		game.init();
		textArea.clear();
		textField.clear();
		okButton.setDisable(true);
		for(ToggleButton tb : toggleSet){
			tb.setDisable(false);
		}
		textArea.setFocusTraversable(false);;
		textArea.setEditable(false);
		mapCards();
		refreshGUI();
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
		if(points > 0){
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
		if(selTB != null && textField.getText().equals(toggleToCardMap.get(selTB).getRomanji())){
			points++;
			game.getCards().remove(toggleToCardMap.get(selTB));
		} else {
			if(points > 0){
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
		toggleButton1.setText("W");
		toggleButton2.setText("I");
		toggleButton3.setText("N");
		toggleButton4.setText("\u272a");
		toggleButton5.setText("\u272a");
		okButton.setDisable(true);
	}
	
	public void setGame(Game game){
		this.game = game;
	}
}
