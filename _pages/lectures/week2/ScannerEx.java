import java.util.Scanner;

class ScannerEx {
    public static void main(String[] args) {
        System.out.println(System.out);
        System.out.println(System.in);
        Scanner input = new Scanner(System.in);
        int number;
        System.out.print("Enter a number: ");
        number = input.nextInt();
        System.out.println(number);
        double number2;
        number2 = input.nextDouble();
        System.out.println("Your second number is " + number2);
        
    }
}
