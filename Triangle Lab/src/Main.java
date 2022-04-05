//(c) A+ Computer Science
//www.apluscompsci.com
//Name - Xander Russell

// Normal header in Triangle.java

import java.util.Objects;
import java.util.Scanner;
import java.lang.String;
import java.text.DecimalFormat;

public class Main  //this class is used to test Triangle
{
    public static void main( String[] args )
    {
        // Scanner, decimal format and variables
        Scanner keyboard = new Scanner(System.in);
        DecimalFormat dec = new DecimalFormat("#0.00000");
        String runningPrompt;
        String dummy;
        int a;
        int b;
        int c;

        do {
            // Runner code from lab docs
            //ask for user input
            System.out.print("Enter side A :  ");
            a = keyboard.nextInt();

            System.out.print("Enter side B :  ");
            b = keyboard.nextInt();

            System.out.print("Enter side C :  ");
            c = keyboard.nextInt();

            Triangle test = new Triangle(a, b, c);
            System.out.println("Area = " + dec.format(test.getArea()));

            // See if user wants to run again.
            System.out.println("\nWould you like to run again? (y / anything else) ");
            dummy = keyboard.nextLine();
            runningPrompt = keyboard.nextLine();

        } while (runningPrompt.equalsIgnoreCase( "y"));
        System.out.println("Thank you!");
    }
}

/*

Sample Data :
3 3 3
7 8 9
10 9 11

Sample Output : 
Enter side A ::  3
Enter side B ::  3
Enter side C ::  3

3 3 3
Area == 3.89711




Enter side A ::  7
Enter side B ::  8
Enter side C ::  9

7 8 9
Area == 26.83282





Enter side A ::  10
Enter side B ::  9
Enter side C ::  11

10 9 11
Area == 42.42641

*/
