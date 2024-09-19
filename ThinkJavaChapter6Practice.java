import java.util.*;

public class ThinkJavaChapter6Practice {
    public static void main(String[] args) {
        Scanner in = new Scanner(System.in);
//        System.out.print("Enter the radius of your circle:  ");
        calculateArea(16);
        System.out.println("The area of your circle is:  " + calculateArea(16));
        System.out.println("The absolute value of your number is:  " + absoluteValue(-4));
        System.out.println("The distance between the two points is:  " + distance(1.0, 2.0, 4.0, 6.0));
        System.out.println("The area of your circle is:  " + circleArea(1.0, 2.0, 4.0, 6.0));
        System.out.println("The factorial of your number is:  " + factorial(5));
    }

    public static double calculateArea(double radius) {
        return Math.PI * radius * radius;
    }

    public static double absoluteValue(double x) {
        if (x < 0) {
            return -x;
        } else {
            return x;
        }
    }

    public static double distance(double x1, double y1, double x2, double y2) {
        double dx = x2 - x1;
        double dy = y2 - y1;
        double dsquared = dx * dx + dy * dy;
        double result = Math.sqrt(dsquared);
//        System.out.println("dx is:  " + dx);
//        System.out.println("dy is:  " + dy);
//        System.out.println("dsquared is:  " + dsquared);
        return result;
    }

    public static double circleArea(double xc, double yc, double xp, double yp) {
        return calculateArea(distance(xc, yc, xp, yp));
    }

    public static int factorial(int n) {
        if (n == 0) {
            return 1;
        }
        int recurse = factorial(n - 1);
        int result = n * recurse;
        return result;
    }

    public static int fibonacci(int n) {
        if (n == 0) {
            return 0;
        } else if (n == 1) {
            return 1;
        } else {
            return fibonacci(n - 1) + fibonacci(n - 2);
        }
    }
}
