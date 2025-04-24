import java.util.ArrayList;
import java.util.Collections;
import java.util.List;

public class Deck {

	private List<Card> cards = new ArrayList<>();

    //Initializes the deck with 52 Card objects, covering all combinations of suits and ranks.
	
	public Deck() {
        String[] suits = {"Hearts", "Diamonds", "Clubs", "Spades"};
        String[] ranks = {"Two", "Three", "Four", "Five", "Six", "Seven", "Eight", "Nine", "Ten", "Jack", "Queen", "King", "Ace"};
        for (String suit : suits) {
            for (int i = 0; i < ranks.length; i++) {
                cards.add(new Card(i + 2, ranks[i] + " of " + suit)); // Ace to King are 11 to 14
            }
        }
    }

	//Randomizes the order of the cards in the deck
	
    public void shuffle() {
        Collections.shuffle(cards);
    }

    //Removes and returns the top card from the deck
    
    public Card draw() {
        return cards.remove(0);
    }
}