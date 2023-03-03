import java.util.Random;
import java.util.Arrays;

public class Deck {
    private Card[] cards;
    private Random rand;
    private int size;

    public Deck() {
        this.rand = new Random();
        this.size = 52;
        this.cards = new Card[size];
        int index = 0;
        for (int suit = 0; suit <= 3; suit++) {
            for (int rank = 1; rank <= 13; rank++) {
                this.cards[index] = new Card(rank,suit);
                index++;
            }
        }
    }
    public Deck(int numCards) {
        this.rand = new Random();
        this.cards = new Card[numCards];
        for (int i = 0; i < numCards; i++) {
            this.cards[i] = new Card(); // populates with all Ace of Clubs
        }
    }

    public Card[] getCards() {
        return this.cards;
    }

    public String toString() {
        return Arrays.toString(this.cards);
    }

    public void shuffle() {
        // for each card in the deck:
        //      select a random other card 
        //      swap the position of the card i have and the random other card

    }

    public Card randCard() {
        int randomIndex = this.rand.nextInt(this.size);
        return this.cards[randomIndex];
    }

}
