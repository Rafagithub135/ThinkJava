import java.util.Scanner;

public class ThinkJavaChapter7Exercises {
    public static void main(String[] args) {
        loop(10075);
    }

    public static void loop(int n) {
        int i = n;
        while (i > 1) {
            System.out.printf("%6d", n);
            System.out.printf("%6d", i);
            System.out.println("");
            if (i % 2 == 0) {
                i = i / 2;
            } else {
                i++;
            }
        }
    }
}
