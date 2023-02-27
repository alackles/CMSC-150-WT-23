import java.util.Arrays;

public class CardDeckClient {

    public static Card[] makeDeck() {
        Card[] cards = new Card[52];
        int index = 0;
        for (int suit = 0; suit <= 3; suit++) {
            for (int rank = 1; rank <= 13; rank++) {
                cards[index] = new Card(rank,suit);
                index++;
            }
        }
        return cards;
    }
    public static void main(String[] args) {
        int[] intArr = new int[20];
        intArr[5] = 9;
        System.out.println(Arrays.toString(intArr));

        Card[] cards = makeDeck();
        System.out.println(Arrays.toString(cards));
        Card card = new Card(0, 1);
    }
}
