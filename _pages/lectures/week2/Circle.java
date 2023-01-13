import java.util.Scanner;

public class Circle {

        public static double diameter(double radius) {
            double diameter = radius*2;
            return diameter;

        }

        public static double circumf(double d) {
            double c = d*Math.PI;
            System.out.println("Circumference calculated.");
            return c;
        }
        public static void main(String[] args) {
            Scanner in = new Scanner(System.in);
            double r = in.nextDouble();
            System.out.println("Radius: " + r);
            double d = diameter(r);
            System.out.println("Diameter: " + d);
            double c = circumf(d);
            System.out.printf("Circumference: %.3f\n", c);
            // Alternative: Compose the methods
            //double c2 = circumf(diameter(r));

        }
}
