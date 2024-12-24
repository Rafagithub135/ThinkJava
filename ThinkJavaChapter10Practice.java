import java.awt.Point;
import java.awt.Rectangle;

public class ThinkJavaChapter10Practice {
    public static void main(String[] args) {
        Point blank;
        blank = new Point(3, 4);
        thePoint();
        printPoint(blank);
    }

    public static void thePoint() {
        Point blank;
        blank = new Point(3, 4);
        System.out.println(blank.x);
        System.out.println(blank.y);
        System.out.println(blank.x + ", " + blank.y);
        int sum = blank.x * blank.x + blank.y * blank.y;
        System.out.println(sum);
    }

    public static void printPoint(Point p) {
        System.out.println("(" + p.x + ", " + p.y + ")");
    }
}
