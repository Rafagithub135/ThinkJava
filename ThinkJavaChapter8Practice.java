public class ThinkJavaChapter8Practice {
    public static void main(String[] args) {
//        countdown(10);
//        hanoi(3, "A", "B", "C");
//        nLines(5);
//        forever("hi");
//        factorial(5);
//        isSingleDigit(8);
//        fibonacci(8);
//        countup(3);
        binary(23);
    }

    public static void countdown(int n) {
        if (n == 0) {
            System.out.println("Blastoff!");
        } else {
            System.out.println(n);
            countdown(n - 1);
        }
    }

    public static void hanoi(int n, String start, String temp, String end) {
        if (n == 1) {
            System.out.println(start + " -> " + end);
        } else {
            hanoi(n - 1, start, temp, end);
            hanoi(1, start, end, temp);
            hanoi(n - 1, temp, end, start);
        }
    }

    public static void newLine() {
        System.out.println();
    }

    public static void threeLine() {
        newLine();
        newLine();
        newLine();
    }

    public static void nLines(int n) {
        if (n > 0) {
            System.out.println();
            nLines(n - 1);
        }
    }

    public static void forever(String s) {
        System.out.println(s);
        forever(s);
    }

//    public static int factorial(int n) {
//        if (n == 0) {
//            return 1;
//        }
//        return n * factorial(n - 1);
//    }

//    public static boolean isSingleDigit(int x) {
//        return x > -10 && x < 10;
//    }

    public static int fibonacci(int n) {
        if (n == 1 || n == 2) {
            return 1;
        }
        return fibonacci(n - 1) + fibonacci(n - 2);
    }

public static void countup(int n) {
        if (n == 0) {
            System.out.println("Blastoff!");
        } else {
            countup(n - 1);
            System.out.println(n);
        }
    }

    public static int binary(int n) {
        if (n == 0) {
            return 0;
        }
        return n % 2 + 10 * binary(n / 2);
    }

}
