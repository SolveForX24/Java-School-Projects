// Main header in Car.java

import java.util.Objects;
import java.lang.String;
import java.util.*;

public class Main {
    public static void main(String[] args) {
        // Scanner
        Scanner sc = new Scanner(System.in);
        // Create car object and simulates driving.
        Car myHybrid = new Car(50); // 50 miles per gallon
        myHybrid.addGas(20); // Tank 20 gallons
        myHybrid.drive(100); // Drive 100 miles
        double gasLeft = myHybrid.getGasInTank(); // Get gas remaining in tank
        System.out.println("\nGas left: " + gasLeft + " gallons!\n\nHow many miles would you like to drive?\n"); // Print gas left, get miles to drive.
        int milesToDrive = sc.nextInt();
        myHybrid.drive(milesToDrive); // Drive user's miles
        gasLeft = myHybrid.getGasInTank(); // Get gas remaining in tank
        System.out.println("\nGas left: " + gasLeft + " gallons!");

    }
}
