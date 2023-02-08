import java.awt.*;
public class Mutable {
    
    public static void movePoint(Point p, int x, int y) {
        p.x = x;
        p.y = y;
    }
    public static void main(String[] args) {
        Point coord = new Point(0, 0);
        movePoint(coord, 1, 1);
        System.out.println(coord);

    }
}
