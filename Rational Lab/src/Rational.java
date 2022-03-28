/*
    Name: Xander Russell
    Lab: Rational Class Lab
    Date: 3/28/22
    Extra: TBD
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

    public void setRational(int a, int b){
        num = a;
        den = b;
    }

    public boolean isBigger(Rational rTwo) {
        return (num / den) > (rTwo.num / rTwo.den);
    }

    public void add(Rational rTwo) {
        num = (num * rTwo.den) + (rTwo.num * den);
        den = den * rTwo.den;
    }
}
