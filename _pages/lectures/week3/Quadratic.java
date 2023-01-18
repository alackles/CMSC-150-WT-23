import java.util.Scanner;
class Quadratic {

    public static double discriminant(double a, double b, double c) {
        return b*b - 4*a*c;
    }

    public static double quad(double a, double b, double c, boolean ) {
        if (discriminant(a, b, c) < 0) {
            return Double.NaN;
        } else {
            return (b + Math.sqrt(discriminant(a, b, c)))/(2*a);
        }

    }

    public static double quad2(double a, double b, double c) {

        if (discriminant(a, b, c) < 0) {
            return Double.NaN;
        } else {
            return (b - Math.sqrt(discriminant(a, b, c)))/(2*a);
        }
    }

    public static void main(String[] args) {
        Scanner in = new Scanner(System.in);
        double a = in.nextDouble();
        double b = in.nextDouble();
        double c = in.nextDouble();
        System.out.printf("positive root: %.3f\n", pos(a, b, c));
        System.out.printf("negative root: %.3f\n", neg(a, b, c));
    }
}