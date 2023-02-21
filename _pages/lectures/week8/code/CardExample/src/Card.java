public class Card {
    public static final String[] RANKS = {null, "Ace", "2", "3", "4", "5",
                            "6", "7", "8", "9", "10",
                            "Jack", "Queen", "King"};
    public static final String[] SUITS = {"Clubs", "Diamonds", "Hearts", "Spades"};

    private final int rank;
    private final int suit;

    public Card(int rank, int suit) {
        this.rank = rank;
        this.suit = suit;
    }

    public int getRank() {
        return this.rank;
    }

    public int getSuit() {
        return this.suit;
    }

    public String toString() {
        String s =  RANKS[this.rank] + " of " + SUITS[this.suit];
        return s;
    }

    public boolean equals(Card that) {
        return this.rank == that.rank &&
                this.suit == that.suit;
    }

    public int compareRank(Card that) {
        return this.rank - that.rank;
    }

    public int compareTo(Card that) {
        if (this.rank < that.rank) {
            return -1;
        } else if (this.rank > that.rank) {
            return 1;
        } else if (this.suit < that.suit) {
            return -1;
        } else if (this.suit > that.suit) {
            return 1;
        } else {
            return 0;
        }
    }

}