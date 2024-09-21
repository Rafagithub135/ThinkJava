public class ThinkJavaChapter7Practice {
    public static void main(String[] args) {
        countdown(100);
    }

    public static void countdown(int n) {
        while (n > 0) {
            System.out.println(n);
            n--;
        }
        System.out.println("Blastoff!");
    }
}
