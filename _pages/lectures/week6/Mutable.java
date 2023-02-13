import java.awt.*;
public class Mutable {
    
    public static void coordDemo() {
        int[] coordinate = {1, 2};
        int xcoord = coordinate[0];
        int ycoord = coordinate[1];

        Point coord = new Point(1, 2);
        int x = coord.x;
        int y = coord.y;
        coord.x = 20;
        System.out.println(coord);
    }

    public static void objects() {
        Point coord = new Point(3,4);
        int x = coord.x;
        System.out.println(coord.x);
    }

    // Objects are passed by reference
    public static void moveX(Point p) {
        p.x = 20;
    }

    public static Point findCenter(Rectangle box) {
        int x = box.x + (box.width/2);
        int y = box.y + (box.height/2);
        return new Point(x,y);
    }

    public static void main(String[] args) {
        objects();

        // passing by ref
        Point p = new Point(0, 0);
        moveX(p);
        System.out.println(p);

        // find rectangle center
        Rectangle box = new Rectangle(0, 0, 100, 100);
        Point center_a = findCenter(box);
        Point center_b = findCenter(box);
        center_b.x = 7;
        System.out.println(center_a);
        System.out.println(center_b);
    
    }
}

