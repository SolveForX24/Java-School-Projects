// Note: header in Student.java

import java.util.Scanner;
import java.text.DecimalFormat;

public class Main {
    public static void main(String[] args) {
        // Scanner and decimal format
        Scanner sc = new Scanner(System.in);
        DecimalFormat dec = new DecimalFormat("#0.00");

        // Gets name and creates student
        System.out.println("Please enter the name of the student: ");
        String name = sc.next();
        Student test = new Student(name);

        // Gets initial test quiz score to add.
        System.out.println("\nWhat is " + test.getName() + "'s first quiz score? ");
        int testScore = sc.nextInt();
        test.addQuiz(testScore);
        System.out.println("\nTotal Score: " + test.getTotalScore() + "\nAverage Score: " + dec.format(test.getAverage()) + "%\n");

        // Gets second test quiz score to add.
        System.out.println("What is " + test.getName() + "'s second quiz score? ");
        testScore = sc.nextInt();
        test.addQuiz(testScore);
        System.out.println("\nTotal Score: " + test.getTotalScore() + "\nAverage Score: " + dec.format(test.getAverage()) + "%\n");

        // Gets third test quiz score to add.
        System.out.println("What is " + test.getName() + "'s third quiz score? ");
        testScore = sc.nextInt();
        test.addQuiz(testScore);
        System.out.println("\nTotal Score: " + test.getTotalScore() + "\nAverage Score: " + dec.format(test.getAverage()) + "%\n");
    }
}
