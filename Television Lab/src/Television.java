/*
    Purpose of this class is to model a television.
    Xander Russell 9/22/21
 */

public class Television {

    // Manufactor will remain constant.
    private String manufactor;

    // Screen size will remain constant.
    private int screenSize;

    // Determines if the television is on.
    private boolean powerOn;

    // Determines what channel is on.
    private int channel;

    // Determines how loud the TV is.
    private int volume;

    // Initializing variables
    public Television (String m, int s) {
        manufactor = m;
        screenSize = s;
        powerOn = false;
        channel = 2;
        volume = 20;
    }

    // Accessor Methods
    public String getManufactor() {
        return manufactor;
    }

    public int getScreenSize() {
        return screenSize;
    }

    public int getVolume() {
        return volume;
    }

    public int getChannel() {
        return volume;
    }

    public boolean getPower() {
        return powerOn;
    }

    // Mutator Methods

    // Changes Channel
    public void setChannel(int c) {
        channel = c;
    }

    // Changes the power state
    public void changePower() {
        powerOn = !powerOn;
    }

    // Increases the volume by 1
    public void increaseVolume() {
        volume++;
    }

    // Decreases the volume by 1
    public void decreaseVolume() {
        volume--;
    }

}
