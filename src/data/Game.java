package data;

import java.util.LinkedHashSet;

public class Game {

	private LinkedHashSet<Card> cardSet;
	private LinkedHashSet<Card> activeCards;
	
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
		cardSet = Director.initializeCards();
		activeCards = Director.selectRandomCards(5, cardSet);
		
	}
	
	public void shuffle(){
		activeCards = Director.selectRandomCards(5, cardSet);
	}

}
