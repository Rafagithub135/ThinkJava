public class ThinkJavaChapter7Practice {
    public static void main(String[] args) {
        countdown(10);
        sequence(17);
        logTable(9.75);
        logTable2(9.75);
        printRow(2);
        printRow(3);
        printRow(4);
        printRow(1);
    }

    // 7.1

    public static void countdown(int n) {
        while (n > 0) {
            System.out.println(n);
            n--;
        }
        System.out.println("Blastoff!");
    }
    public static void sequence(int n) {
        while (n != 1) {
            System.out.println(n);
            if (n % 2 == 0) {
                n = n / 2;
            } else {
                n = n * 3 + 1;
            }
        }
    }

    // 7.2


    public static void logTable(double n) {
        int i = 1;
        while (i < 10) {
            double x = i;
            System.out.println(x + "     " + Math.log(x));
            System.out.println(x + "     " + Math.log(x) / Math.log(2));
            i++;
        }
    }

    public static void logTable2(double n) {
        final double LOG2 = Math.log(2);    // This stores Math.log(2) in a variable.
        int i = 1;
        while (i < 100) {
            double x = i;
            System.out.println(x + "      " + Math.log(x) / LOG2);
            i = i * 2;
        }
    }

    // 7.3

    public static void printRow(int n) {     // This line along with line 62 encapsulates the code to multiply by 2.  Then, by adding the parameter n inside the parentheses, it makes the method gereralized.
        int i = 1;
        while (i <= 10) {
           System.out.printf("%4d", n * i);   //   When the parameter is added, this line gets changed to n * i to replace the hard-coded multiple with the variable.
//            printRow(i);
            i++;
        }
    }
}