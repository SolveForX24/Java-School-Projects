//(c) A+ Computer Science
//www.apluscompsci.com
//Name -

import static java.lang.System.*;
import java.util.Scanner;
public class Main
{
    public static void main( String args[] )
    {

        // Create scanner.
        Scanner sc = new Scanner(System.in);

        // NOTE: This runner code was almost entirely from the lab sheet's given.
        Rational rOne = new Rational(1,2);
        Rational rTwo = new Rational(2,3);

        out.println("\n\nrOne = "+rOne);
        out.println("rTwo = "+rTwo);

        out.println( "1/2 > 2/3 == " + rOne.isBigger(rTwo) );

        rOne.add(rTwo);
        out.println("\n\nrOne.add(rTwo) = "+ rOne);


        rOne.setRational(1,2);
        rTwo.setRational(1,3);

        out.println( "1/2 > 1/3 == " + rOne.isBigger(rTwo) );
        rOne.add(rTwo);
        out.println("\n\n1/2.add(1/3) = "+ rOne);

        rOne.setRational(4,10);
        rTwo.setRational(3,5);
        rOne.add(rTwo);
        out.println("\n\n4/10.add(3/5) = "+ rOne);

        rOne.setRational(2,10);
        rTwo.setRational(3,6);
        rOne.add(rTwo);
        out.println("\n\n2/10.add(3/6) = "+ rOne);

        //1/4 + 2/8 = 1/2
        rOne.setRational(1,4);
        rTwo.setRational(2,8);
        rOne.add(rTwo);
        out.println("\n\n1/4.add(2/8) = "+ rOne);

        //1/6 + 2/8 = 5/12
        rOne.setRational(1,6);
        rTwo.setRational(2,8);
        out.println( "1/6 > 2/8 == " + rOne.isBigger(rTwo) );
        rOne.add(rTwo);
        out.println("\n\n1/6.add(2/8) = "+ rOne);

        //1/2 == 2/4
        rOne.setRational(1,2);
        rTwo.setRational(2,4);
        out.println( "\n\n1/2 == 2/4 is " + rOne.equals(rTwo) );

        // Get num and den of both radicals, then add.
        out.println("What do you want the numerator of the first radical to be? ");
        int numOne = sc.nextInt();
        out.println("What do you want the denominator of the first radical to be? ");
        int denOne = sc.nextInt();
        out.println("What do you want the numerator of the second radical to be? ");
        int numTwo = sc.nextInt();
        out.println("What do you want the numerator of the second radical to be? ");
        int denTwo = sc.nextInt();
        rOne.setRational(numOne, denOne);
        rTwo.setRational(numTwo, denTwo);
        rOne.add(rTwo);
        out.println("Result of adding them together: " + rOne);

    }
}
