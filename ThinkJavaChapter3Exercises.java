import java.util.Random;
import java.util.Scanner;

public class ThinkJavaChapter3Exercises {
    public static void main(String[] args) {
        Scanner in = new Scanner(System.in);
        // Exercise 3.1
        // When you use printf, the Java compiler does not check your format string. See what happens if you try to display a value with type int using %f. And what happens if you display a double using %d? What if you use two format specifiers, but then only provide one value?
//        System.out.print("What is your name?");
//        String name = in.nextLine();
//        System.out.print("What is your age?");
//        int age = in.nextInt();
//        System.out.printf("Hello %s, age %d", name, age);
        // If you try to enter a value with type int using %f and/or a value with type double using %d, Java will print an error message.  The types are mismatched.  If you use two format specifiers, but then only provide one value, Java will print an error message.  The number of format specifiers and the number of values must match.

        // Exercise 3.2 - I changed it to convert Fahrenheit to Celsius because that is more likely the way I will be using it.
        //Write a program that converts a temperature from Celsius to Fahrenheit. It should (1) prompt the user for input, (2) read a double value from the keyboard, (3) calculate the result, and (4) format the output to one decimal place. For example, it should display "24.0 C = 75.2 F".
//        System.out.println("What is the current temperature in Fahrenheit?");
//        double fahrenheit = in.nextDouble();
//        double celsius = (fahrenheit -32) * 5 / 9;
//        System.out.printf("%.1f C = %.1f F", fahrenheit, celsius);

        // Exercise 3.3
        // Write a program that converts a total number of seconds to hours, minutes, and seconds. It should (1) prompt the user for input, (2) read an integer from the keyboard, (3) calculate the result, and (4) use printf to display the output. For example, "5000 seconds = 1 hours, 23 minutes, and 20 seconds".
//        System.out.println("How many seconds would you like to convert?");
//        int seconds = in.nextInt();
//        int hours = seconds / 3600;
//        int minutes = (seconds % 3600) / 60;
//        int remainingSeconds = seconds % 60;
//        System.out.printf("%d seconds = %d hour(s), %d minute(s), and %d second(s)", seconds, hours, minutes, remainingSeconds);

        // Exercise 3.4
        // The goal of this exercise is to program a "Guess My Number" game. When it's finished, it will work like this: I'm thinking of a number between 1 and 100 (including both). Can you guess what it is?
        //Type a number: 45
        //Your guess is: 45
        //The number I was thinking of is: 14
        //You were off by: 31

        Random randomNumber = new Random();
        int number = randomNumber.nextInt(100) + 1;
        System.out.println("I'm thinking of a number between 1 and 100 (inclusive).  Can you guess what it is?");
        System.out.println("type a number:  ");
        int guess = in.nextInt();
        System.out.println("Your guess is:  " + guess);
        System.out.print("The number I was thinking of is:  " + number);
        System.out.println(" ");
        if (guess == number) {
            System.out.println("GREAT JOB!!!  YOU GUESSED MY NUMBER!!!");
        } else if (guess > number) {
            System.out.println("Your number was higher than mine by " + (guess - number));
        } else {
            System.out.println("Your number was lower than mine by " + (number - guess));
        }
    }
}
