public class Gradebook {

    // Fields
    private String courseName;
    private String instructorName;

    // Constructor
    public Gradebook (String startingCourse, String startingInstructor) {
        courseName = startingCourse;
        instructorName = startingInstructor;
    }

    // Methods

    public void setCourseName (String newCourse) {
        courseName = newCourse;
    }

    public String getCourseName () {
        return courseName;
    }

    public void setInstructorName (String newInstructor) {
        instructorName = newInstructor;
    }

    public String getInstructorName () {
        return instructorName;
    }

    public void displayMessage () {
        System.out.println("Welcome to the gradebook for " + getCourseName() + ". This course is taught by " + getInstructorName() + ".");
    }


}
