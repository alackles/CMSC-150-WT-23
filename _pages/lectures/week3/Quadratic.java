import java.util.Scanner;
class Quadratic {

    public static double discriminant(double a, double b, double c) {
        return b*b - 4*a*c;
    }

    public static double quad(double a, double b, double c, int pos) {
        if (pos == 1) {
            return (b + Math.sqrt(discriminant(a, b, c)))/(2*a);
        } else {
            return (b - Math.sqrt(discriminant(a, b, c)))/(2*a);
        }
    }

    public static void main(String[] args) {
        Scanner in = new Scanner(System.in);
        double a = in.nextDouble();
        double b = in.nextDouble();
        double c = in.nextDouble();
        int flag = in.nextInt();
        System.out.printf("root: %.3f\n", quad(a, b, c, flag));
    }
}