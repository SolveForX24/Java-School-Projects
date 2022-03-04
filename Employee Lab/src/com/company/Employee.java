package com.company;

/*
    Purpose of this class is to model an employee.
    Xander Russell 9/22/21
 */

public class Employee {

    // Name will remain constant.
    private String employeeName;

    // The salary can change.
    private double currentSalary;

    // Initializing variables
    public Employee (String n, double s) {
        employeeName = n;
        currentSalary = s;
    }

    // Accessor Methods
    public String getName() {
        return employeeName;
    }

    public double getSalary() {
        return currentSalary;
    }

    // Mutator Method

    // Raise salary by a percent.
    public void raiseSalary(double byPercent) {
        currentSalary *= 1 + (byPercent / 100);
    }


}