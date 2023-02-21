import java.util.Scanner;

public class CardClient {

    public static void makeCard() {
        Scanner in = new Scanner(System.in);
        System.out.println("Choose a number: ");
        int rank = Integer.valueOf(in.nextLine());
        System.out.println("Choose a suit (0 = clubs, 1 = diamonds, 2 = hearts, 3 = spades): ");
        int suit = in.nextInt();
        Card myCard = new Card(rank, suit);
        System.out.println(myCard);
    }
   public static void main(String[] args) {
        Card fourOfClubs = new Card(4, 0);
        Card fiveOfDiamonds = new Card(5, 1);
        System.out.println(fourOfClubs);
        System.out.println(fiveOfDiamonds);
        if (fourOfClubs.compareRank(fiveOfDiamonds) < 0) {
            System.out.println(fourOfClubs + " is a lower card than " + fiveOfDiamonds);
        }
        if (fourOfClubs.compareRank(fiveOfDiamonds) < 0) {
            System.out.println("You lose");
        }
        Card fourOfSpades = new Card(4, 3);
        System.out.println(fourOfClubs.compareTo(fourOfSpades));
        System.out.println(fourOfClubs.getSuit());

       
   } 
}
