/*
*   Name: Xander Russell
*   Date: 3/18/22
*   Lab: Cookie Jar Lab
*   Extra: Runner code is more user friendly looking.
* */

public class Main
{
    public static void main( String[] args )
    {
        // NOTE: This runner code is taken from the assignment, but modified slightly for the user-friendly output.

        
        CookieJar c = new CookieJar( 3000 ); //sets capacity to 3000
        System.out.println("Cookie jar is full: " + c.isFull( ) + "\n"); //cookiejar is not full
        c.addStuff( 500 ); //add 500 items

        //returns -2500 as space is 2500

        System.out.println("Cookie jar is full: " + c.isFull( ) + "\n"); //cookiejar is not full
        c.addStuff( 2000 ); //add 2000 items

        //returns -500 as space is 500

        System.out.println("Space left: " + c.spaceLeft( ) ); //space left is 500
        System.out.println("Cookie jar is full: " + c.isFull( ) + "\n"); //cookiejar is not full
        c.addStuff( 2000 ); //attempt to add 2000
        //adds 500 and returns 1500
        //1500 was amount left
        //that could not be added
        System.out.println("Space left: " + c.spaceLeft( ) ); //no space left – returns 0
        System.out.println("Cookie jar is full: " + c.isFull( ) ); //cookiejar is not full
    }
}