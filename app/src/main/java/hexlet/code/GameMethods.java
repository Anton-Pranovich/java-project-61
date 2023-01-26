package hexlet.code;

import java.util.Random;
import java.util.Scanner;

public class GameMethods {
    static Scanner sc = new Scanner(System.in);
    static Random random = new Random();
    static String userName;

    public static void greeting() {

        System.out.println("Welcome to the Brain Games!");
        System.out.print("May I have your name? ");
        userName = sc.nextLine();
        System.out.println("Hello, " + userName);
    }

    public static void evenGame() {
        String result;


        System.out.println("Answer 'yes' if the number is even, otherwise answer 'no'.");
        int count = 0;
        while (count < 3) {
            int number = random.nextInt(100);
            System.out.println("Question: " + number);
            if (number % 2 == 0) {
                result = "yes";
            } else {
                result = "no";
            }
            String answer = sc.next();
            System.out.println("Your answer: " + answer);
            if (result.equals(answer)) {
                System.out.println("Correct!");
                count++;
            } else {
                System.out.println("'" + answer + "' is wrong answer ;(. Correct answer was '" + result + "'.\n"
                        + "Let's try again, " + userName);
                System.exit(0);
            }
        }
        System.out.println("Congratulations," + userName);

    }
}
