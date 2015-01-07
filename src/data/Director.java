package data;

import java.util.LinkedHashSet;

public class Director {
	
	public static LinkedHashSet<Card> initializeCards(){
		LinkedHashSet<Card> cards = new LinkedHashSet<Card>();
		cards.add(new Card().withKana('\u3042').withRomanji("a"));
		cards.add(new Card().withKana('\u3044').withRomanji("i"));
		cards.add(new Card().withKana('\u3046').withRomanji("u"));
		cards.add(new Card().withKana('\u3048').withRomanji("e"));
		cards.add(new Card().withKana('\u304A').withRomanji("o"));
		cards.add(new Card().withKana('\u304B').withRomanji("ka"));
		cards.add(new Card().withKana('\u304C').withRomanji("ga"));
		cards.add(new Card().withKana('\u304D').withRomanji("ki"));
		cards.add(new Card().withKana('\u304E').withRomanji("gi"));
		cards.add(new Card().withKana('\u304F').withRomanji("ku"));
		cards.add(new Card().withKana('\u3050').withRomanji("gu"));
		cards.add(new Card().withKana('\u3051').withRomanji("ke"));
		cards.add(new Card().withKana('\u3052').withRomanji("ge"));
		cards.add(new Card().withKana('\u3053').withRomanji("ko"));
		cards.add(new Card().withKana('\u3054').withRomanji("go"));
		cards.add(new Card().withKana('\u3055').withRomanji("sa"));
		cards.add(new Card().withKana('\u3056').withRomanji("za"));
		cards.add(new Card().withKana('\u3057').withRomanji("si"));
		cards.add(new Card().withKana('\u3058').withRomanji("zi"));
		cards.add(new Card().withKana('\u3059').withRomanji("su"));
		cards.add(new Card().withKana('\u305a').withRomanji("zu"));
		cards.add(new Card().withKana('\u305b').withRomanji("se"));
		cards.add(new Card().withKana('\u305c').withRomanji("ze"));
		cards.add(new Card().withKana('\u305d').withRomanji("so"));
		cards.add(new Card().withKana('\u305e').withRomanji("zo"));
		cards.add(new Card().withKana('\u305f').withRomanji("ta"));
		cards.add(new Card().withKana('\u3060').withRomanji("da"));
		cards.add(new Card().withKana('\u3061').withRomanji("ti"));
		cards.add(new Card().withKana('\u3062').withRomanji("di"));
		cards.add(new Card().withKana('\u3064').withRomanji("tu"));
		cards.add(new Card().withKana('\u3065').withRomanji("du"));
		cards.add(new Card().withKana('\u3066').withRomanji("te"));
		cards.add(new Card().withKana('\u3067').withRomanji("de"));
		cards.add(new Card().withKana('\u3068').withRomanji("to"));
		cards.add(new Card().withKana('\u3069').withRomanji("do"));
		cards.add(new Card().withKana('\u306a').withRomanji("na"));
		cards.add(new Card().withKana('\u306b').withRomanji("ni"));
		cards.add(new Card().withKana('\u306c').withRomanji("nu"));
		cards.add(new Card().withKana('\u306d').withRomanji("ne"));
		cards.add(new Card().withKana('\u306e').withRomanji("no"));
		cards.add(new Card().withKana('\u306f').withRomanji("ha"));
		cards.add(new Card().withKana('\u3070').withRomanji("ba"));
		cards.add(new Card().withKana('\u3071').withRomanji("pa"));
		cards.add(new Card().withKana('\u3072').withRomanji("hi"));
		cards.add(new Card().withKana('\u3073').withRomanji("bi"));
		cards.add(new Card().withKana('\u3074').withRomanji("pi"));
		cards.add(new Card().withKana('\u3075').withRomanji("hu"));
		cards.add(new Card().withKana('\u3076').withRomanji("bu"));
		cards.add(new Card().withKana('\u3077').withRomanji("pu"));
		cards.add(new Card().withKana('\u3078').withRomanji("he"));
		cards.add(new Card().withKana('\u3079').withRomanji("be"));
		cards.add(new Card().withKana('\u307a').withRomanji("pe"));
		cards.add(new Card().withKana('\u307b').withRomanji("ho"));
		cards.add(new Card().withKana('\u307c').withRomanji("bo"));
		cards.add(new Card().withKana('\u307d').withRomanji("po"));
		cards.add(new Card().withKana('\u307e').withRomanji("ma"));
		cards.add(new Card().withKana('\u307f').withRomanji("mi"));
		cards.add(new Card().withKana('\u3080').withRomanji("mu"));
		cards.add(new Card().withKana('\u3081').withRomanji("me"));
		cards.add(new Card().withKana('\u3082').withRomanji("mo"));
		cards.add(new Card().withKana('\u3084').withRomanji("ya"));
		cards.add(new Card().withKana('\u3086').withRomanji("yu"));
		cards.add(new Card().withKana('\u3087').withRomanji("yo"));
		cards.add(new Card().withKana('\u3089').withRomanji("ra"));
		cards.add(new Card().withKana('\u308a').withRomanji("ri"));
		cards.add(new Card().withKana('\u308b').withRomanji("ru"));
		cards.add(new Card().withKana('\u308c').withRomanji("re"));
		cards.add(new Card().withKana('\u308d').withRomanji("ro"));
		cards.add(new Card().withKana('\u308e').withRomanji("wa"));
		cards.add(new Card().withKana('\u3090').withRomanji("wi"));
		cards.add(new Card().withKana('\u3091').withRomanji("we"));
		cards.add(new Card().withKana('\u3092').withRomanji("wo"));
		cards.add(new Card().withKana('\u3093').withRomanji("n"));
		cards.add(new Card().withKana('\u3094').withRomanji("vu"));
//		//=============================
//		cards.add(new Card().withKana('\u30A2').withRomanji("a"));
//		cards.add(new Card().withKana('\u30A4').withRomanji("i"));
//		cards.add(new Card().withKana('\u30A6').withRomanji("u"));
//		cards.add(new Card().withKana('\u30A8').withRomanji("e"));
//		cards.add(new Card().withKana('\u30AA').withRomanji("o"));
//		cards.add(new Card().withKana('\u30AB').withRomanji("ka"));
//		cards.add(new Card().withKana('\u30AC').withRomanji("ga"));
//		cards.add(new Card().withKana('\u30AD').withRomanji("ki"));
//		cards.add(new Card().withKana('\u30AE').withRomanji("gi"));
//		cards.add(new Card().withKana('\u30AF').withRomanji("ku"));
//		cards.add(new Card().withKana('\u30B0').withRomanji("gu"));
//		cards.add(new Card().withKana('\u30B1').withRomanji("ke"));
//		cards.add(new Card().withKana('\u30B2').withRomanji("ge"));
//		cards.add(new Card().withKana('\u30B3').withRomanji("ko"));
//		cards.add(new Card().withKana('\u30B4').withRomanji("go"));
//		cards.add(new Card().withKana('\u30B5').withRomanji("sa"));
//		cards.add(new Card().withKana('\u30B6').withRomanji("za"));
//		cards.add(new Card().withKana('\u30B7').withRomanji("si"));
//		cards.add(new Card().withKana('\u30B8').withRomanji("zi"));
//		cards.add(new Card().withKana('\u30B9').withRomanji("su"));
//		cards.add(new Card().withKana('\u30Ba').withRomanji("zu"));
//		cards.add(new Card().withKana('\u30Bb').withRomanji("se"));
//		cards.add(new Card().withKana('\u30Bc').withRomanji("ze"));
//		cards.add(new Card().withKana('\u30Bd').withRomanji("so"));
//		cards.add(new Card().withKana('\u30Be').withRomanji("zo"));
//		cards.add(new Card().withKana('\u30Bf').withRomanji("ta"));
//		cards.add(new Card().withKana('\u30c0').withRomanji("da"));
//		cards.add(new Card().withKana('\u30c1').withRomanji("ti"));
//		cards.add(new Card().withKana('\u30c2').withRomanji("di"));
//		cards.add(new Card().withKana('\u30c4').withRomanji("tu"));
//		cards.add(new Card().withKana('\u30c5').withRomanji("du"));
//		cards.add(new Card().withKana('\u30c6').withRomanji("te"));
//		cards.add(new Card().withKana('\u30c7').withRomanji("de"));
//		cards.add(new Card().withKana('\u30c8').withRomanji("to"));
//		cards.add(new Card().withKana('\u30c9').withRomanji("do"));
//		cards.add(new Card().withKana('\u30Ca').withRomanji("na"));
//		cards.add(new Card().withKana('\u30Cb').withRomanji("ni"));
//		cards.add(new Card().withKana('\u30Cc').withRomanji("nu"));
//		cards.add(new Card().withKana('\u30Cd').withRomanji("ne"));
//		cards.add(new Card().withKana('\u30Ce').withRomanji("no"));
//		cards.add(new Card().withKana('\u30Cf').withRomanji("ha"));
//		cards.add(new Card().withKana('\u30d0').withRomanji("ba"));
//		cards.add(new Card().withKana('\u30d1').withRomanji("pa"));
//		cards.add(new Card().withKana('\u30d2').withRomanji("hi"));
//		cards.add(new Card().withKana('\u30d3').withRomanji("bi"));
//		cards.add(new Card().withKana('\u30d4').withRomanji("pi"));
//		cards.add(new Card().withKana('\u30d5').withRomanji("hu"));
//		cards.add(new Card().withKana('\u30d6').withRomanji("bu"));
//		cards.add(new Card().withKana('\u30d7').withRomanji("pu"));
//		cards.add(new Card().withKana('\u30d8').withRomanji("he"));
//		cards.add(new Card().withKana('\u30d9').withRomanji("be"));
//		cards.add(new Card().withKana('\u30Da').withRomanji("pe"));
//		cards.add(new Card().withKana('\u30Db').withRomanji("ho"));
//		cards.add(new Card().withKana('\u30Dc').withRomanji("bo"));
//		cards.add(new Card().withKana('\u30Dd').withRomanji("po"));
//		cards.add(new Card().withKana('\u30De').withRomanji("ma"));
//		cards.add(new Card().withKana('\u30Df').withRomanji("mi"));
//		cards.add(new Card().withKana('\u30e0').withRomanji("mu"));
//		cards.add(new Card().withKana('\u30e1').withRomanji("me"));
//		cards.add(new Card().withKana('\u30e2').withRomanji("mo"));
//		cards.add(new Card().withKana('\u30e4').withRomanji("ya"));
//		cards.add(new Card().withKana('\u30e6').withRomanji("yu"));
//		cards.add(new Card().withKana('\u30e8').withRomanji("yo"));
//		cards.add(new Card().withKana('\u30e9').withRomanji("ra"));
//		cards.add(new Card().withKana('\u30ea').withRomanji("ri"));
//		cards.add(new Card().withKana('\u30eb').withRomanji("ru"));
//		cards.add(new Card().withKana('\u30ec').withRomanji("re"));
//		cards.add(new Card().withKana('\u30Ed').withRomanji("ro"));
//		cards.add(new Card().withKana('\u30Ef').withRomanji("wa"));
//		cards.add(new Card().withKana('\u30f0').withRomanji("wi"));
//		cards.add(new Card().withKana('\u30f1').withRomanji("we"));
//		cards.add(new Card().withKana('\u30f2').withRomanji("wo"));
//		cards.add(new Card().withKana('\u30f3').withRomanji("n"));
//		cards.add(new Card().withKana('\u30f4').withRomanji("vu"));
		return cards;
	}
	
	public static LinkedHashSet<Card> selectRandomCards(int amount, LinkedHashSet<Card> sourceCards){
		
		LinkedHashSet<Card> tempCards = new LinkedHashSet<Card>();
		LinkedHashSet<Card> outputCards = new LinkedHashSet<Card>();
		
		tempCards.addAll(sourceCards);
		if(amount > sourceCards.size()){
			amount = sourceCards.size();
		}
		while(outputCards.size() < amount){
			int rnd = (int) (Math.random() * (tempCards.size()));
			Card card = getCardFromHashset(rnd, tempCards);
			outputCards.add(card);
			tempCards.remove(card);
		}
		return outputCards;
	}
	
	public static Card getCardFromHashset(int index, LinkedHashSet<Card> cards){
		int counter = 0;
		for(Card card : cards){
			if(counter == index){
				return card;
			}
			counter++;
		}
		return null;
	}
}
