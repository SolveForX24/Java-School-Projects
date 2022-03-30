/*
    Name: Xander Russell
    Lab: Rational Class Lab
    Date: 3/28/22
    Extra: Allows the user to enter two fractions at the end of the runner code and adds them together.
 */

public class Rational {

    // Variables and constructor
    private int num, den;

    public Rational(int a, int b) {
        num = a;
        den = b;
    }

    // Override print out
    @Override
    public String toString() {
        return num + " / " + den;
    }

    // Change the num and den
    public void setRational(int a, int b){
        num = a;
        den = b;
    }

    // Compare and return if a different rational is bigger or equal to the first.
    public boolean isBigger(Rational rTwo) {
        return (num * rTwo.den) > (den * rTwo.num);
    }
    public boolean equals(Rational rTwo) {
        return (num * rTwo.den) == (den * rTwo.num);
    }

    // Add two rationals together.
    public void add(Rational rTwo) {
        num = (num * rTwo.den) + (rTwo.num * den);
        den = den * rTwo.den;
        reduce();
    }

    // This is taken from stackoverflow: https://ispycode.com/Blog/java/2018-04/Reduce-fractions-to-lowest-terms
    private void reduce() {
        // find the larger of the numerator and denominator
        int n = num, d = den, largest;
        if (num < 0) {
            n = -num;
        }
        if (n > d) {
            largest = n;
        } else {
            largest = d;
        }

        // find the largest number that divide the numerator and
        // denominator evenly
        int gcd = 0;
        for (int i = largest; i >= 2; i--) {
            if (num % i == 0 && den % i == 0) {
                gcd = i;
                break;
            }
        }

        // divide the largest common denominator out of numerator, denominator
        if (gcd != 0) {
            num /= gcd;
            den /= gcd;
        }
    }

}
