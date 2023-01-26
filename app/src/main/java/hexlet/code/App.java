package hexlet.code;

import java.util.Scanner;

public class App {

    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        System.out.println("Please enter the game number and press Enter.\n"
                + "1 - Greet\n"
                + "2 - Even\n"
                + "0 - Exit");
        String choice;
        choice = scanner.nextLine();
        System.out.println("Your choice: " + choice);
        switch (choice) {
            case "0":
                System.exit(0);
                break;
            case "1":
                GameMethods.greeting();
                break;
            case "2":
                GameMethods.greeting();
                GameMethods.evenGame();
            default:
                System.exit(0);
                break;
        }
    }
}
