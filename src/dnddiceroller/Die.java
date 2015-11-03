package dnddiceroller;

import java.util.Random;

/**
 * A Die is a many sided object that when rolled provides a random value from
 * 1 through the number of sides on the object. Some dice are 6 sided and have
 * the numbers 1-6 on them. Some dice are 20 sided with the numbers 1-20 on them.
 * Others are called fudge dice and have the values of -1 0 or +1
 * @author Paul Scarrone
 */
public class Die {
    private int die;
    private int value;
    private Random dieSide = new Random();
   
    public Die(int die) {
       this.die = die;
       
}

    public void roll() {
        value = dieSide.nextInt(die) + 1;// dieSide is equal to 0 thri (die -1).
        //System.out.println(value);
    }

    public int value() {
        return this.value;
    }
}