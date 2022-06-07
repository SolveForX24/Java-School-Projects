/*

    Name: Xander Russell
    Date: 6/7/22
    Lab: Car Class Lab
    Extra: If the
 */

public class Car {

    // Variables and constructor.
    private final double efficiency;
    private double currentGas;

    public Car(double a) {
        efficiency = a;
        currentGas = 0.0;
    }

    // Function to add to gas
    public void addGas(double a) {
        currentGas += a;
    }

    // Calculates the loss of gas in a simulated drive, then makes sure there's enough gas. If so, decrease the amount of gas. Else, print that it failed and move on.
    public void drive(int a) {
        double potentialLoss = a/efficiency;
        System.out.println("Potential loss: " + potentialLoss + "\nCurrent Gas: " + currentGas + "\n\n");
        if (potentialLoss > currentGas) {
            System.out.println("Sorry, you don't have enough gas for that long of a drive!\n");
        } else {
            currentGas -= potentialLoss;
            System.out.println("Drive successful!\n");
        }
    }

    // Gas Getter
    public double getGasInTank() {
        return currentGas;
    }
}
