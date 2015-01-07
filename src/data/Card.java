package data;

public class Card {

	private Game game;
	private char kana;
	private String romanji;
	
	public Game getGame(){
		return game;
	}
	
	public void setGame(Game newGame){
		if(newGame != null && newGame != game){
			game = newGame;
			newGame.addToCards(this);
		}
	}
	
	public void setKana(char kana){
		this.kana = kana;
	}

	public char getKana(){
		return kana;
	}
	
	public Card withKana(char kana){
		this.setKana(kana);
		return this;
	}
	
	public void setRomanji(String romanji){
		this.romanji = romanji;
	}
	
	public String getRomanji(){
		return romanji;
	}
	
	public Card withRomanji(String romanji){
		this.setRomanji(romanji);
		return this;
	}
}
