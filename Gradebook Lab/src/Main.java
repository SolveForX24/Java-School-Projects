import java.util.Locale;
import java.util.Scanner;

/*

  Name: Xander Russell

  Assignment: Lab 9/15 Gradebook Lab

  Date: 9/15/21

  Extra Thing: Asks the user first if they want to change the course and instructor name.

*/

public class Main {
    public static void main(String[] args) {

        // Scanner and initial Name variables
        Scanner sc = new Scanner(System.in);
        System.out.println("Please enter a course name: ");
        String courseName = sc.nextLine();
        System.out.println("Please enter an instructor name: ");
        String instructorName = sc.nextLine();

        // Gradebook object and first message display
        Gradebook gb = new Gradebook(courseName, instructorName);
        gb.displayMessage();

        // Checks if you want to change course name. Uses .compareToIgnoreCase to compare a string to "y".
        // If returns 0, asks for new course name and then applies it.
        System.out.println("Would you like to change the course name? y/n ");
        String change = sc.nextLine();
        String yes = "y";
        if(change.compareToIgnoreCase(yes) == 0) {
            System.out.println("Please enter a course name: ");
            courseName = sc.nextLine();
            gb.setCourseName(courseName);
        } else {
            System.out.println("Course name stays");
        }

        // Same as above, but manipulates the instructor name.
        System.out.println("Would you like to change the instructor name? y/n ");
        change = sc.nextLine();
        if(change.compareToIgnoreCase(yes) == 0) {
            System.out.println("Please enter an instructor name: ");
            instructorName = sc.nextLine();
            gb.setInstructorName(instructorName);
        } else {
            System.out.println("Instructor name stays");
        }

        // Final message display
        gb.displayMessage();
    }
}
