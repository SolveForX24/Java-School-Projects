// DiceMain.java

import java.util.Scanner;

/**
 * Class to test Dice
 *
 * Simulates the rolling of two dice ten times,
 *    printing the sum each time.
 *
 * @author andrianoff
 * @version June 25, 2014
 *
 * Name: Xander Russell
 *
 * Assignment: Dice Lab
 *
 * Date: 9/13/21
 *
 * Extra Thing: Gives the user the chance to decide the side counts on the dice.
 *
 * NOTE: The idea to use an array to store the sum count values was inspired by 
 * Matthew W.'s code, but I wrote my own code to use this style and modified it
 * to work with above extra thing.
 */
public class Main
{
    public static void main(String[] args)
    {

        // Scanner and important variables
        Scanner sc = new Scanner(System.in);

        System.out.println("Please enter the number of sides for your first die: ");
        int sidesOne = sc.nextInt();
        System.out.println("Please enter the number of sides for your first die: ");
        int sidesTwo = sc.nextInt();
        System.out.println("Please enter the amount of rolls to roll: ");
        int rolls = sc.nextInt();
        int maxSum = sidesOne + sidesTwo;

        // Dice objects 
        Dice d = new Dice(sidesOne);
        Dice d2 = new Dice(sidesTwo);
        
        // More variables
        int sum;
        int r1;
        int r2;
        int doublerolls = 0;

        // Array to store counts of sums
        int rollcounts [] = new int[maxSum-1];

        // For loop that runs code to roll each die, calculate the sum, iterate the proper sum spot in the sum holder array, checks for doubles then prints the results of the roll in that loop.
        for(int i = 0; i <= rolls - 1; i++) {
            r1 = d.roll();
            r2 = d2.roll();
            sum = r1 + r2;

            rollcounts[sum-2]++;

            if (r1 == r2) {
                doublerolls++;
            }

            System.out.println("First Roll in loop " + rolls + ": " + r1);
            System.out.println("Second Roll in loop " + rolls + ": " + r2);
            System.out.println("Sum of Both Dice Rolls in loop " + rolls + ": " + sum);
            System.out.println("\n");
        }

        // Final readout: total rolls, total doubles, and amount of each possible sum.
        System.out.println("Total rolls: " + rolls);

        System.out.println("Total doubles rolled: " + doublerolls);

        for (int i = 0; i <= (maxSum - 2); i++) {
            System.out.println("Amount of " + (i + 2) + " rolls: " + rollcounts[i]);
        }
        System.out.println(d);
        System.out.println(d2);
    }
}
