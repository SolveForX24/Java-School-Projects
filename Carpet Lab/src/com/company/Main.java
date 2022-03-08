/*
 *  Name: Xander Russell
 *  Lab: Carpet Lab
 *  Date: 3/8/22
 *  Extra: The program will not let the user input a width, length or cost less than or equal to 0.
*/

package com.company;
import java.util.Scanner;
import java.text.DecimalFormat;

public class Main {

    public static void main(String[] args) {
        // Establish scanner and decimal format.
        Scanner sc = new Scanner(System.in);
        DecimalFormat dec = new DecimalFormat("$#0.00");

        System.out.println("We will determine the cost of your carpet now. " +
                "I will ask for the width and length of the carpet, and then the cost per square foot.\n");
        // Setting up width and length.
        int width;
        do {
            System.out.println("What is the width of the carpet in feet? ");
            width = sc.nextInt();
        } while (width <= 0);
        int length;
        do {
            System.out.println("What is the length of the carpet in feet? ");
            length = sc.nextInt();
        } while (length <= 0);

        // Creating dimension object with width, length and method to calculate area.
        RoomDimension dimension = new RoomDimension(width, length);

        // Getting cost.
        double cost;
        do {
            System.out.println("What is the cost of the carpet per square feet (decimal points allowed)? ");
            cost = sc.nextDouble();
        } while (cost <= 0);

        // Creating final carpet object that takes the dimension object and cost.
        RoomCarpet carpet = new RoomCarpet(dimension, cost);

        // Final print out, with call to the carpet objects calculate cost method.
        System.out.println("The cost of your carpet comes out to " + dec.format(carpet.getTotalCost()) + ".");


    }
}
