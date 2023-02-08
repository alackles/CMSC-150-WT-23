import java.util.Scanner;
class QuizReview {

    public static void main(String[] args) {
        String[] arrStrings = new String[100];
        Scanner in = new Scanner(System.in);
        String a = "hello";
        String b = "hello";
        if (a.equals(b)) {
            System.out.println("Same");
        }
        System.out.println(a.compareTo(b));
    }

}