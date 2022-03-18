/*
 *   Name: Xander Russell
 *   Date: 3/18/22
 *   Lab: Cookie Jar Lab (CookieJar Class)
 *   Extra: Runner code is more user friendly looking.
 * */

public class CookieJar
{

    // Class variables
    private int capacity;
    private int current = 0;

    // Constructor
    public CookieJar(int c)
    {
        capacity = c;
        System.out.println("Cookie Jar Created\nCapacity: " + capacity + "\n");
    }

    // This method can add to current variable.
    public void addStuff(int s)
    {
        // Get variables for printout.
        int potentialOverflow = 0;
        int initCurrent = current;

        // Add cookies
        System.out.println("Attempting to add " + s + " cookies to the jar...");
        current += s;

        // If the amount of cookies added leads to a current stock greater than the capacity, print as such, and
        // calculate how many cookies there are in excess and how many their actually need to be to reach max.
        // Also sets current to capacity, so the variables are correct.
        if (current > capacity) {
            System.out.println("More cookies added then capacity can hold. Removing excess cookies.");
            potentialOverflow = Math.abs(capacity - current);
            System.out.println(potentialOverflow + " excess cookies removed.");
            s = capacity - initCurrent;
            current = capacity;
        }

        System.out.println(s + " cookies were added to the jar.\n");
    }

    // Returns if the current cookie count is equal to the capacity.
    public boolean isFull(){
        return current == capacity;
    }

    // Returns how many cookies the class can have before it's full.
    public int spaceLeft(){
        return capacity - current;
    }

}