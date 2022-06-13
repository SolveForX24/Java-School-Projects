/*
    Name: Xander Russell
    Date: 6/13/22
    Lab: Balloon Lab
    Extra: User can put in an amount of air at the end.
 */

public class Balloon {

    private double currentAir, radius;

    public Balloon() {
        currentAir = 0;
        radius = 0;
    }

    // Adds air and updates radius.
    public void addAir(double a) {
        currentAir += a;
        //System.out.println("air added. currentAir: " + currentAir + ". Air Added: " + a + "\n");
        radius = ((3) * (currentAir / (4*Math.PI) * (0.33)));
        //System.out.println("radius: " + radius + "\n\n");
    }

    // Some getters
    public double getVolume() {
        return currentAir;
    }
    public double getRadius() {
        return radius;
    }

    // Surface area of balloon: S(r)=4πr2, r being the radius.
    public double getSurfaceArea() {
        return 4 * Math.PI * radius * 2;
    }
}
