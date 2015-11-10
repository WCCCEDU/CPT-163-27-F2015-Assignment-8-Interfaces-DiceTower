package dnddiceroller;
import java.util.Random;

/**
 *
 * @author Katrina
 */
public class Loaded implements Die{
    
    //fields
    private final int side;
    private int value;
    private final int chance;
    
    /**
     * constructor
     */
    public Loaded(){
        this.side = 6;
        this.value = 0;
        this.chance = 2;
    }
    //accessors
    public int getChance() {
        return this.chance;
    }
    
    @Override
    public int getValue(){
         return this.value;
    }
    
    public int getSide(){
        return this.side;
    }
     //method to randomly g if we roll +1, -1 or return a loaded number
    public int determineRoll(){
            Random rand = new Random();
    int newChance = rand.nextInt(this.getChance());
    return newChance;
    }
           
    @Override
     public void roll(){
        Random rand= new Random();
        this.value = rand.nextInt(this.side) + 1;
}

}