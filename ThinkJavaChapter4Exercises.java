    public class ThinkJavaChapter4Exercises {
        // Exercise 4.1
        // Number 1. What is the output of the following program?  Be precise about where there are spaces and where there are newlines.

        /** The output is the statement, "No, I wug.  You wugga wug.  I wug.".  The first method is main.  Even though zoop is listed first, main is executed first.  So, main displays the statement, "No, I " and then invokes zoop which first invokes baffle.  Baffle displays "wug" and then invokes ping which displays "." and a new line.  The program then returns to zoop and displays "You wugga " and then invokes baffle again.  Baffle, once again displays "wug" and then goes to ping to display the ".".  Since zoop is now completed, the program returns to main and displays "I " and once again displays baffle.  Baffle, once again displays "wug" and invokes ping which displays the "." again.  At that point, the program is completed and finishes with exit code 0.  */

        //Number 2. The instructions state to draw a stack diagram that shows the state of the program the first time ping is invoked.  The stack diagram is shown below.  As I can't do this on the computer, I skipped this step.

        // Number 3.
        //If you invoke baffle(); at the end of the ping method, the program goes into, what appears to be an infinite loop and then finishes with an exit code of 1.

        public static void zoop() {
            baffle();
            System.out.print("You wugga ");
            baffle();
        }

        public static void main(String[] args) {
            System.out.print("No, I ");
            zoop();
            System.out.print("I ");
            baffle();
            printAmerican("Thursday", 28, "September", 2023);
            printEuropean("Thursday", 28, "September", 2023);
        }

        public static void baffle() {
            System.out.print("wug");
            ping();
        }

        public static void ping() {
            System.out.println(".");
            zool(11, "Buddy", "Jersey");
        }

        // Exercise 4.2
        // Number 1. Write the first line of a method named zool that takes three parameters:  an int and two Strings.
        // Number 2. Write a line of code that calls zool, passing as arguments the value 11, the name of your first pet, and the name of the street you grew up on.
        public static void zool(int a, String b, String c) {

        }

        // Exercise 4.3
        // Number 1. Write a method named printAmerican that takes the day, date, month and year as parameters and that displays them in American format.

        public static void printAmerican(String day, int date, String month, int year) {
            System.out.println(day + ", " + month + " " + date + ", " + year);
        }

        // Number 2. Test your method by invoking it from main and passing appropriate arguments.  The output should look something like this (except that the date might be different):
        // See the main method above.

        // Number 3.  Once you have debugged printAmerican, write another method named printEuropean that displays the date in European format.
        // See the main method above.
        public static void printEuropean(String day, int date, String month, int year) {
            System.out.println(day + " " + date + " " + month + " " + year);
        }
    }