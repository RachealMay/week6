package Week6package;

import java.util.ArrayList;
import java.util.List;

public class Player {
	List<Card> hand = new ArrayList<>();
	int score; 
	String name;
	public Player (String name) {
		this.name = name; 
	}
	public int getScore() {
		return score;
	}
	public String describe() {
		StringBuilder playerdescribe = new StringBuilder();
		playerdescribe.append(Player.class.getSimpleName()).append("Name:  " + name).append("; Score: " + score);
		for (Card card : hand) {
			playerdescribe.append(card.describe());
		}
		return playerdescribe.toString(); 
	}
	public Card flip() {
	return hand.remove(0);
	}
	public void draw(Deck deck) {
		hand.add(deck.draw()); 
	}
	public void wins() {
		score ++; 
	}
}
