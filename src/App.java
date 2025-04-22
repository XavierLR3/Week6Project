public class App {
    public static void main(String[] args) {
        Deck deck = new Deck();
        deck.shuffle();

        Player player1 = new Player("Player 1");
        Player player2 = new Player("Player 2");

        for (int i = 0; i < 52; i++) {
            if (i % 2 == 0) {
                player1.draw(deck);
            } else {
                player2.draw(deck);
            }
        }

        for (int i = 0; i < 26; i++) {
            System.out.println("Round " + (i + 1));
            Card card1 = player1.flip();
            Card card2 = player2.flip();

            // Show the cards being played
            if (card1 != null && card2 != null) {
                System.out.print("Player 1 plays: ");
                card1.describe();
                System.out.print("Player 2 plays: ");
                card2.describe();

                // Determine the winner of the round
                if (card1.getValue() > card2.getValue()) {
                    player1.incrementScore();
                    System.out.println("Player 1 wins the round.");
                } else if (card2.getValue() > card1.getValue()) {
                    player2.incrementScore();
                    System.out.println("Player 2 wins the round.");
                } else {
                    System.out.println("Round is a tie. No points awarded.");
                }

                // Print updated scores after each round
                System.out.println("Scores: Player 1: " + player1.getScore() + " | Player 2: " + player2.getScore());
                System.out.println();
            } else {
                System.out.println("One of the players has no cards left.");
            }
        }

        // Print final scores and determine the winner
        System.out.println("Final Scores:");
        System.out.println("Player 1: " + player1.getScore());
        System.out.println("Player 2: " + player2.getScore());

        if (player1.getScore() > player2.getScore()) {
            System.out.println("Player 1 wins!");
        } else if (player2.getScore() > player1.getScore()) {
            System.out.println("Player 2 wins!");
        } else {
            System.out.println("It's a draw!");
        }
    }
}