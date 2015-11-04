package dnddiceroller;
import java.util.Random;

/**
 *
 * @author Katrina
 */
public class Loaded implements Die{
    
    //fields
    private final int numSides;
    private int value;
    private final int useLoaded;
    
    /**
     * constructor
     */
    public Loaded(){
        this.numSides = 6;
        this.value = 0;
        this.useLoaded = 2;
    }
    //accessors
    public int getNumSides() {
        return this.numSides;
    }
    
    @Override
    public int getValue(){
         return this.value;
    }
    
    public int getUseLoaded(){
        return this.useLoaded;
    }
     //method to randomly g if we roll +1, -1 or return a loaded number
    public int determineRoll(){
            Random rand = new Random();
    int determine = rand.nextInt(this.useLoaded);
    return determine;
    }
           
    @Override
     public void roll(){
        Random rand= new Random();
        this.value = rand.nextInt(this.numSides) + 1;
}

}