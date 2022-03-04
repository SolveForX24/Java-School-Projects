/*

    Name: Xander Russell
    Lab: Employee Lab
    Date: 3/4/22
    Extra: The user can choose if the employee has earned a raise or not.

 */

package com.company;
import java.util.Scanner;
import java.text.DecimalFormat;

public class Main {

    public static void main(String[] args) {
        // Establish scanner and decimal format.
        Scanner sc = new Scanner(System.in);
        DecimalFormat dec = new DecimalFormat("#0.00");

        // Setting up name of employee.
        System.out.println("What is the name of the employee? ");
        String name = sc.nextLine();

        // Setting up initial salary of the employee.
        System.out.println("What is the salary of the employee? ");
        double initSalary = sc.nextDouble();

        // Create employee class
        Employee employee = new Employee(name, initSalary);

        // Print out current details
        System.out.println("Employee details: \nName: " + employee.getName() + "\nSalary: $" + dec.format(employee.getSalary()) + "\n");

        // Ask if employee has earned a raise.
        String filler = sc.nextLine();
        String raisePrompt;
        // This is in a do while loop to prevent the user from preceding before they entered a y or n.
        do {
            System.out.println("Has " + employee.getName() + " earned a raise? (y/n) ");
            raisePrompt = sc.nextLine();
        } while (!(raisePrompt.equalsIgnoreCase("y")) && !(raisePrompt.equalsIgnoreCase("n")));

        // If the employee has earned a raise, get percent to raise salary by and call raise salary method.
        if (raisePrompt.equals("y")) {
            System.out.println("What is the percent raise of " + employee.getName() + "? %");
            double salaryRaise = sc.nextDouble();
            employee.raiseSalary(salaryRaise);
            System.out.println("New salary: $" + dec.format(employee.getSalary()) + ".");
        }

    }

}
