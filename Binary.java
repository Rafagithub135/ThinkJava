public class Binary {
    public static void main(String[] args) {
//        binary(23);
        displayBinary(73);
    }

    public static int binary(int n) {
        if (n == 0) {
            System.out.print(0);
        } else {
            int[] answer = new int[1000];
            int num = (n % 2);
            System.out.print(num);
            n = n / 2;
            binary(n);
        }
        return n;
    }

    public static void displayBinary(int value) {
        if (value > 0) {
            displayBinary(value / 2);
            System.out.print(value % 2);
        }
    }
}
