import java.util.Scanner;

/*

  Name: Xander Russell

  Assignment: Lab 9/9 Soda Can Lab

  Date: 9/9/21

  Extra Thing: Used scanner to get variables from user, and calculates the Base Area and Lateral Surface.

*/
class Main {
  public static void main(String[] args) {

    // Getting values
    Scanner sc = new Scanner(System.in);
    double startingHeight;
    double startingDiameter;
    System.out.println("Please enter the height of the soda can: ");
    startingHeight = sc.nextInt();
    System.out.println("Please enter the diameter of the soda can: ");
    startingDiameter = sc.nextInt();

    // Constructing SodaCan object
    SodaCan can = new SodaCan(startingHeight, startingDiameter);

    // Running methods
    System.out.println("Surface Area:");
    System.out.println(can.getSurfaceArea());
    System.out.println("Volume:");
    System.out.println(can.getVolume());
    System.out.println("Base Area:");
    System.out.println(can.getBaseArea());
    System.out.println("Lateral Surface:");
    System.out.println(can.getLateralSurface());
  }
}

