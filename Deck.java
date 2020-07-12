package Week6package;

import java.util.List; 
import java.util.ArrayList;
import java.util.List;
import java.util.Random;

public class Deck {
	private List<Card> cards = new ArrayList<>(); 
	
	private static final String[] suits = { "Clubs", "Hearts", "Spades", "Diamonds" }; 
	
	private static final String[] names = { "Ace", "Two" , "Three", "Four", "Five", "Six", "Seven", "Eight", "Nine", "Ten", "Jack", "Queen", "King" }; 
	
	public Deck() { 
		for (String suit : suits) {
			for(int i = 0; i < names.length; i++) {
				String name = names[i];
				String cardName = name + " of " + suit; 
				int cardValue = i + 2; 
				Card card = new Card(cardName, cardValue);
				cards.add(card); 
			}
		}
	}
	 public void shuffle() {
		 Random random = new Random(); 
		 List<Card> shuffleList = new ArrayList<>();
		 while (cards.size() > 0) {
		 int position = random.nextInt(cards.size()); 
		 Card card = cards.remove(position);
		 shuffleList.add(card); 
	 }
	 cards = shuffleList; 
	 }
	 public Card draw() {
		 return cards.remove(0); 
	 }
	}
