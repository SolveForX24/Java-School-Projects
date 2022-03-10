//(c) A+ Computer Science
//www.apluscompsci.com
//Name -
//Date -

package com.company;

public class RayFirst
{
    public static boolean go(int[] ray)
    {

        if (ray == null) {
            System.out.println("Array is empty.");
            return false;
        }

        int first = ray[0];

        for (int i = 1; i <= ray.length; i++) {
            if (first == ray[i]) {
                System.out.println("First variable has been found again at index " + i + ".");
                return true;
            }
        }

        System.out.println("First variable not found again.");
        return false;
    }
}