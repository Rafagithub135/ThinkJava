public class ThinkJavaCapter6Exercises {
    public static void main(String[] args) {
//      6.1  System.out.println("boo!") + 7;
//        The system won't let me run the above code because it is trying to mix a string and an int.
//      6.2
        System.out.println(isDivisible(175, 5));
        System.out.println(isTriangle(3, 4, 5));
        System.out.println(multAdd(1.0, 2.0, 3.0));
        System.out.println(multAdd(Math.sin(Math.PI / 4), 1, Math.cos(Math.PI / 4) / 2));
        System.out.println(multAdd(1, Math.log(10), Math.log(20)));
        System.out.println(expSum(1));
        System.out.println(prod(1, 4));
//        System.out.println(oddSum(5));
    }

    public static Boolean isDivisible(int n, int m) {
        if (n % m == 0) {
            return true;
        } else {
            return false;
        }
    }

    //    6.3
    public static Boolean isTriangle(int a, int b, int c) {
        if (a + b > c && a + c > b && b + c > a) {
            return true;
        } else {
            return false;
        }
    }

//    6.4

    public static double multAdd(double a, double b, double c) {
        return a * b + c;
    }

    public static double expSum(double x) {
        return multAdd(x, Math.exp(-x), Math.sqrt(1 - Math.exp(-x)));
    }

    //    6.5

    //    It is assumed the program works as expected.

    //    6.6

    public static int prod(int m, int n) {
        if (m == n) {
            return n;
        } else {
            int recurse = prod(m, n - 1);
            int result = n * recurse;
            return result;
        }
    }

    //    6.7

//    public static int oddSum(int n) {
//        if (n == 0) {
//            return 0;
//        } else {
//            return n + oddSum(n - 2);
//        }
//    }
//    This throws and exception because the program is trying to add an odd number to an even number.
}
