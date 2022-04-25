/*
  Name: Xander Russell
  Date: 4/25/22
  Lab: Rock Paper Scissors
  Extra: All user inputs are error trapped.
*/

import static java.lang.System.*;
import java.util.Scanner;

public class main {
    public static void main(String args[]) {

        // Variables and Classes
        Scanner sc = new Scanner(System.in);
        RockPaperScissors rps = new RockPaperScissors();

        String playerChoice, continuePrompt;
        boolean running = true;

        // Main loop
        do {
            // Get player choice
            do {
                out.println("Please enter your choice: (R)ock, (P)aper or (S)cissors: ");
                playerChoice = sc.nextLine();
            } while (!playerChoice.equalsIgnoreCase("r") && !playerChoice.equalsIgnoreCase("p") && !playerChoice.equalsIgnoreCase("s"));

            // Play game
            rps.game(playerChoice);

            // Get if user wants to continue or not.
            do {
                out.println("Would you like to continue? (Y/N) ");
                continuePrompt = sc.nextLine();
                //out.println("continuePrompt: " + continuePrompt);
            } while (!continuePrompt.equalsIgnoreCase("y") && !continuePrompt.equalsIgnoreCase("n"));

            if (continuePrompt.equalsIgnoreCase("n")) {
                out.println("Thank you!");
                running = false;
            };

        } while (running);
    }
}