package Week6package;

public class App {

	public static void main(String[] args) {
		Deck deck = new Deck(); 
		Player Racheal = new Player("Racheal");
		Player Jesse = new Player("Jesse"); 
		deck.shuffle();
		for (int i = 0; i < 52; i++) {
			if (i % 2 ==0) {
				Racheal.draw(deck);
			}
			else { 
				Jesse.draw(deck);
			}
		}
		System.out.println(Racheal.describe()); 
		System.out.println(Jesse.describe());
		System.out.println(" ");
		for (int i = 0; i < 26; i++) {
			Card rachealCard = Racheal.flip();
			Card jesseCard = Jesse.flip(); 
			if (rachealCard.getValue() > jesseCard.getValue()) {
				Racheal.wins();
				System.out.println("Racheal wins this round");  
			}
			else if (jesseCard.getValue() > rachealCard.getValue()) {
				Jesse.wins(); 
				System.out.println("Jesse wins this round."); 
			}
				else {
					System.out.println("It's a tie"); 
				}
		}
			System.out.println(" ");
			if (Racheal.getScore() > Jesse.getScore()) {
				System.out.println("Racheal wins the game with a score of " + Racheal.getScore()); 
			}
			else if (Jesse.getScore() > Racheal.getScore()) {
				System.out.println("Jesse wins the game with a score of " + Jesse.getScore()); 
			}
			else {
				System.out.println("They tie with a score of " + Racheal.getScore()); 
			}
			
			}
		}
	


