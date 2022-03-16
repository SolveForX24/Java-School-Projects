/*

    Name: Xander Russell
    Lab: First Repeats Lab
    Date: 3/16/22
    Extra: Shows where the initial value was found again in the array.

 */

public class Main {

    public static void main(String[] args) {
        // Sets up a test array.
	    int testArray[] = new int[4];
        testArray[0] = 7;
        testArray[1] = 8;
        testArray[2] = 8;
        testArray[3] = 7;

        // Create our RayFirst object
        RayFirst arrayTester = new RayFirst();

        // Calls the array testing method from our RayFirst object.
        arrayTester.go(testArray);
    }
}
