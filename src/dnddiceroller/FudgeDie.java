package dnddiceroller;

import java.util.Random;

/**
 *
 * @author Steven
 */
public class FudgeDie implements Die{
    
    private int sides;
    private int value;
    
    public FudgeDie(){
        this.value = 3;
        this.sides = 0;
    }
    
    public int getValue(){return this.value;}
    
    public void roll(){
        this.value = (new Random()).nextInt(3) - 1;
    }
}
