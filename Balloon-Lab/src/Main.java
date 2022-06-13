// Note: Header in Balloon.java

import java.util.Scanner;
import java.text.DecimalFormat;

public class Main {
    public static void main(String[] args) {
        // Test code.
        Scanner sc = new Scanner(System.in);
        DecimalFormat dec = new DecimalFormat("#0.00");
        Balloon test = new Balloon();

        test.addAir(100);
        System.out.println("Current Air: " + dec.format(test.getVolume()) + " cm cubed.\nCurrent Radius: " + dec.format(test.getRadius())  + " cm. \nCurrent Surface Area: " + dec.format(test.getSurfaceArea())  + " cm cubed.\n\n");

        test.addAir(100);
        System.out.println("Current Air: " + dec.format(test.getVolume()) + " cm cubed.\nCurrent Radius: " + dec.format(test.getRadius())  + " cm. \nCurrent Surface Area: " + dec.format(test.getSurfaceArea())  + " cm cubed.\n\n");

        // Gets air from user.
        System.out.println("\n\nHow much air do you want to put inside in cm? ");
        test.addAir(sc.nextDouble());
        System.out.println("Current Air: " + dec.format(test.getVolume()) + " cm cubed.\nCurrent Radius: " + dec.format(test.getRadius())  + " cm. \nCurrent Surface Area: " + dec.format(test.getSurfaceArea())  + " cm cubed.\n\n");

    }
}
