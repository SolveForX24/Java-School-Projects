//  Dice.java

/**
 * Implements a Dice object (a die)
 *
 * @author andrianoff
 * @version June 25, 2014
 */
public class Dice
{

    private int sides;
    /**
     * Constructs a die
     */
    public Dice(int s)
    {
        sides = s;
    }

    /**
     * Rolls a die - generates a random number in the range 1 .. 6
     * @return the face value of the die
     */
    public int roll()
    {
        return (int) (Math.random()*sides) + 1;
    }

    public String toString(){
        return "sides = " + sides;
    }

}