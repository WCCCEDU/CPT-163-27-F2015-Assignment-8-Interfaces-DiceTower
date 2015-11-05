package dnddiceroller;

import java.util.Random;

/**
 *
 * @author Steven
 */
public class LoadedDie implements Die{
    
    private int numSide = 6;
    private int value = 0;
    private int chance = 2;
    
    public int getChance(){return this.chance;}
    
    public int getValue(){return this.value;}
    
    public int getNumSide(){return this.numSide;}
    
    
    public int evalRoll(){
        Random rand = new Random();
        int newChance = rand.nextInt(this.getChance());
        return  newChance;
    }
    
    public void roll(){
        Random rand = new Random();
        this.value = rand.nextInt(this.numSide) + 1;
    }
}
    

