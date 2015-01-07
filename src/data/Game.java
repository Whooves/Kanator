package data;

import java.util.LinkedHashSet;

public class Game {

	private LinkedHashSet<Card> cardSet;
	private LinkedHashSet<Card> activeCards;
	public boolean kata = false;
	public boolean hira = true;
	
	public LinkedHashSet<Card> getCards(){
		return cardSet;
	}

	public void addToCards(Card newCard){
		if(newCard != null && !cardSet.contains(newCard)){
			cardSet.add(newCard);
			newCard.setGame(this);
		}
	}
	
	public void removeCard(Card card){
		cardSet.remove(card);
		card.setGame(null);
	}
	
	public LinkedHashSet<Card> getDeck(){
		return activeCards;
	}

	public void init() {
		cardSet = new LinkedHashSet<Card>();
		if(hira){
			System.out.println("adding hiragana");
			cardSet.addAll(Director.initializeHiraCards());			
		}
		if(kata){
			System.out.println("adding katakana");
			cardSet.addAll(Director.initializeKataCards());
		}
		activeCards = Director.selectRandomCards(5, cardSet);
		
	}
	
	public void shuffle(){
		activeCards = Director.selectRandomCards(5, cardSet);
	}

}
