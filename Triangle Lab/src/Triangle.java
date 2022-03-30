/*
* Name: Xander Russell
* Date: 3/30/22
* Lab: Triangle Lab
* Extra: The getting side lengths and calculating area processes in main will loop until the user wants to stop.
* */

import java.util.Scanner;
import java.lang.Math.*;

public class Triangle
{

    // Variables and constructor.
    private int sideA, sideB, sideC;
    private double perimeter;

    public Triangle(int a, int b, int c)
    {
        sideA = a;
        sideB = b;
        sideC = c;
    }

    public void calcPerimeter( )
    {
        perimeter = sideA + sideB + sideC;
    }

    public double getArea( )
    {
        double s = perimeter/2;
        return Math.sqrt(s * ((s - sideA) * (s - sideB) * (s - sideC)));
    }
}