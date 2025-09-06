import java.util.Random;
import java.util.Scanner;
/**
 * Rock-Paper-Scissors Console Game
 *
 * A simple Java console application where the player competes against
 * the computer in the classic Rock-Paper-Scissors game.
 *
 * Features:
 * - User inputs their move: rock, paper, or scissors.
 * - Validates user input.
 * - Computer randomly selects its move.
 * - Determines and displays the game outcome.
 * - Allows repeated play until user chooses to stop.
 *
 * Author: [Your Name]
 * Date: [Optional]
 */
public class App {
    public static void main(String[] args) {

        String[] choices = {"rock", "paper", "scissors"};
        String playerChoice;
        String computerChoice;
        String playAgain = "yes";

        Scanner scanner = new Scanner(System.in);
        Random random = new Random();

        do {
            System.out.print("Enter your move (rock, paper, scissors): ");
            playerChoice = scanner.nextLine().toLowerCase();

            if (!playerChoice.equals("rock") && !playerChoice.equals("paper") && !playerChoice.equals("scissors")) {
                System.out.println("Invalid Choice");
               continue;
            }

            computerChoice = choices[random.nextInt(3)];
            System.out.println("Computer choice: " + computerChoice);

            if (playerChoice.equals(computerChoice)) {
                System.out.println("It's a tie!");

            } else if ((playerChoice.equals("rock") && computerChoice.equals("scissors")) ||
                    (playerChoice.equals("paper") && computerChoice.equals("rock")) ||
                    (playerChoice.equals("scissors") && computerChoice.equals("paper"))) {

                System.out.println("You win!");
            } else {

                System.out.println("You lose!");
            }

            System.out.println("Play Again (yes/no): ");
            playAgain = scanner.nextLine().toLowerCase();
        } while (playAgain.equals("yes"));

        System.out.println("Thanks for playing!");

        scanner.close();
    }
}
