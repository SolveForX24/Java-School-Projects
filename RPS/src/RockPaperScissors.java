import java.util.Random;
import static java.lang.System.*;

public class RockPaperScissors {

    // Variables, Random Class and Constructor
    private int compChoice, playerChoiceInt;

    Random rand = new Random();

    public RockPaperScissors() {

    }

    // 1: Rock
    // 2: Paper
    // 3: Scissors

    // Gameplay functions
    public void game(String playerChoice) {

        // Setting up both player and computer choices.
        compChoice = rand.nextInt(2);
        compChoice++;

        if (playerChoice.equalsIgnoreCase("r")) {
            playerChoiceInt = 1;
            out.println("\nYou have chosen ROCK");
        } else if (playerChoice.equalsIgnoreCase("p")) {
            playerChoiceInt = 2;
            out.println("\nYou have chosen PAPER");
        } else {
            playerChoiceInt = 3;
            out.println("\nYou have chosen SCISSORS");
        }

        if (compChoice == 1) {
            out.println("The computer chose ROCK\n");
        } else if (compChoice == 2) {
            out.println("The computer chose PAPER\n");
        } else {
            out.println("The computer chose SCISSORS\n");
        }

        // Comparisons
        if (compChoice == 1 && playerChoiceInt == 3) {
            out.println("Computer Wins! Rock breaks Scissors!\n\n");
        } else if (compChoice == 1 && playerChoiceInt == 2) {
            out.println("Player Wins! Paper covers Rock!\n\n");
        } else if (compChoice == 2 && playerChoiceInt == 1) {
            out.println("Computer Wins! Paper covers Rock!\n\n");
        } else if (compChoice == 2 && playerChoiceInt == 3) {
            out.println("Player Wins! Scissors cuts Paper\n\n");
        } else if (compChoice == 3 && playerChoiceInt == 2) {
            out.println("Computer Wins! Scissors cuts paper!\n\n");
        } else if (compChoice == 3 && playerChoiceInt == 1) {
            out.println("Player Wins! Rock breaks Scissors!\n\n");
        } else {
            out.println("Draw!\n\n");
        }

    }

}
