package Chapter10MutableObjects;

import java.awt.Point;
import java.util.Scanner;

public class PointObjects {
    public static void main(String[] args) {
        getPoint(new Point(3, 4));
    }

    public static void getPoint(Point p1) {
        Scanner input = new Scanner(System.in);
        System.out.println("Please enter a point in the format (x, y) where x is the x-coordinate and y is the y-coordinate.");
        String point1 = input.nextLine();
        Point p2 = new Point(5, 2);
        System.out.println("(" + p2.x + ", " + p2.y + ")");
        int sum = p2.x * p2.x + p2.y * p2.y;
        System.out.println("sum of squares: " + sum);
    }
}
