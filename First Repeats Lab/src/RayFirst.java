//(c) A+ Computer Science
//www.apluscompsci.com
//Name - Xander Russell
//Date - 3/16/22

public class RayFirst
{
    public static boolean go(int[] ray)
    {
        // Save the initial value.
        int initial = ray[0];

        // Loop through the rest of the array.
        for(int i = 1; i < ray.length; i++) {
            // If the value in the array is equal to the initial value, print as such and return true.
            if(ray[i] == initial) {
                System.out.println("Initial value found again at index " + i + ".");
                return true;
            }
        }

        // If the initial value was not found again, print as such and return false.
        System.out.println("Initial value not found again.");
        return false;
    }
}