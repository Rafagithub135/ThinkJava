public class ThinkJavaChapter5Exercises {
    public static void main(String[] args) throws InterruptedException {
        int x = 0;
        if (x > 0 && x < 10) {
            System.out.println("Positive single digit number.");
        } else if (x > 10) {
            System.out.println("Positive double digit number or greater.");
        } else if (x < 0 && x > -10) {
            System.out.println("Negative single digit number.");
        } else if (x < -10) {
            System.out.println("Negative double digit number or lower.");
        } else {
            System.out.println("Zero.");
        }
    }
}