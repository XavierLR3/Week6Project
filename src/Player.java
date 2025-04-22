import java.util.ArrayList;
import java.util.List;

public class Player {
    private List<Card> hand = new ArrayList<>();
    private int score;
    private String name;

    public Player(String name) {
        this.name = name;
        this.score = 0;
    }

    public void describe() {
        System.out.println("Player: " + name);
        for (Card card : hand) {
            card.describe();
        }
    }

    public Card flip() {
        if (!hand.isEmpty()) {
            return hand.remove(0);
        }
        return null;
    }

    public void draw(Deck deck) {
        hand.add(deck.draw());
    }

    public void incrementScore() {
        score++;
    }

    public int getScore() {
        return score;
    }

    public String getName() {
        return name;
    }
}