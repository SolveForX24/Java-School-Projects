import java.util.Scanner;

/*

    Name: Xander Russell
    Date: 9/22/21
    Assignment: Television Lab
    Extra Thing: Prints the power status of each TV before manipulating the portable TV.

 */
public class Main {
    public static void main(String[] args) {

        // This is all pulled from the resources, except for the Task 5 area


        //create a Scanner object to read from the keyboard
        Scanner keyboard = new Scanner (System.in);
        //declare variables
        int station; //the user’s channel choice
        //declare and instantiate a television object
        Television bigScreen = new Television("Toshiba", 55);
        //turn the power on
        bigScreen.changePower();
        //display the state of the television
        System.out.println("A " + bigScreen.getScreenSize() + bigScreen.getManufactor() +
                " has been turned on.");
        //prompt the user for input and store into station
        System.out.print("What channel do you want? ");
        station = keyboard.nextInt();
        //change the channel on the television
        bigScreen.setChannel(station);
        //increase the volume of the television
        bigScreen.increaseVolume();
        //display the the current channel and volume of the television
        System.out.println("Channel: " + bigScreen.getChannel() + " Volume: " + bigScreen.getVolume());
        System.out.println("Too loud!! I am lowering the volume.");
        //decrease the volume of the television
        bigScreen.decreaseVolume();
        bigScreen.decreaseVolume();
        bigScreen.decreaseVolume();
        bigScreen.decreaseVolume();
        bigScreen.decreaseVolume();
        bigScreen.decreaseVolume();
        //display the current channel and volume of the television
        System.out.println("Channel: " + bigScreen.getChannel() + " Volume: " + bigScreen.getVolume());
        System.out.println(); //for a blank line

        // Task 5
        Television portable = new Television("Sharp", 19);
        portable.changePower();
        System.out.println("The new TV is a portable " + portable.getManufactor() + " "
                + portable.getScreenSize() + " inch.");

        // Printing if the bigscreen is on
        if(bigScreen.getPower()) {
            System.out.println("The " + bigScreen.getManufactor() + " is on.");
        } else {
            System.out.println("The " + bigScreen.getManufactor() + " is off.");
        }

        // Printing if the portable is on
        if(portable.getPower()) {
            System.out.println("The " + portable.getManufactor() + " is on.");
        } else {
            System.out.println("The " + portable.getManufactor() + " is off.");
        }

        System.out.println("What channel do you want the portable TV on? ");
        portable.setChannel(keyboard.nextInt());

        System.out.println("Lowering volume");
        portable.decreaseVolume();
        portable.decreaseVolume();

        System.out.println("Portable's channel: " + portable.getChannel() + "\nPortable's Volume: " + portable.getVolume());

    }
}
