package hexlet.code;

import java.util.Random;
import java.util.Scanner;

public class Cli {
    static Scanner sc = new Scanner(System.in);
    static Random random = new Random();
    static String userName;

    public static void greeting() {

        System.out.println("Welcome to the Brain Games!");
        System.out.print("May I have your name? ");
        userName = sc.nextLine();
        System.out.println("Hello, " + userName);
    }
}
