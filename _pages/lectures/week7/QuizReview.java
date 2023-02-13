import java.awt.*;

class QuizReview {
    public static void movePointA(Point p, int a, int b) {
        Point newPoint = new Point(p.x, p.y);
        newPoint.x = a;
        newPoint.y = b;
    }
    public static void movePointB(int px, int py, int x, int y) {
        px = x;
        py = y;
    }
    public static void main(String[] args) {
        Point coord = new Point(0, 0);
        movePointA(coord, 1, 1);
        movePointB(coord.x, coord.y, 7, 7);
        movePointB(2, 2, 2, 2);
        System.out.println(coord);
    }
    
}
