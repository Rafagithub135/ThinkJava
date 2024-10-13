public class ThinkJavaChapter8Practice {
    public static void main(String[] args) {
//    countdown(15);
//    hanoi(5, "A", "C", "B");
        nLines(5);
//        forever("hi");
        factorial(5);
        isSingleDigit(8);
    }

    public static void countdown(int n) {
        if (n == 0) {
            System.out.println("Blastoff!");
        } else {
            System.out.println(n);
            countdown(n - 1);
        }
    }

    public static void hanoi(int n, String start, String end, String temp) {
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

    public static int factorial(int n) {
        if (n == 0) {
            return 1;
        } else {
            int recurse = factorial(n - 1);
            int result = n * recurse;
            return result;
        }
    }

    public static boolean isSingleDigit(int x) {
        return x > -10 && x < 10;
    }



}
