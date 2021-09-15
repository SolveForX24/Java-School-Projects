public class SodaCan {

  // Fields

  public double height;
  public double diameter;

  // Constructer
  
  public SodaCan (double startingHeight, double startingDiameter) {
    height = startingHeight;
    diameter = startingDiameter;
  }

  // Methods

  public double getVolume() {
    return 3.14 * diameter * height;
  }

  public double getSurfaceArea() {
    return (2 * 3.14 * (diameter / 2) * height) + (2 * 3.14 * diameter);
  }

  public double getBaseArea() {
    return 3.14 * diameter;
  }

  public double getLateralSurface() {
    return 2 * 3.14 * (diameter / 2) * height;
  }

}