package dnddiceroller;

import java.util.Random;

/**
 *
 * @author Katrina
 */
public class NumberedDie implements Die{
    
    //fields
    final private int numSides;
    private int value;

/**
 * the constructor,  performs initial roll of the die.
 * @param numSides is the number of sides for this die.
 */
    public NumberedDie(int numSides){
        this.numSides = numSides;
       
}
    //the roll method simulates the rolling of the die.
    @Override
      public void roll(){
        
        //create a Random object.
        Random rand = new Random();

        //get a random value for this die.
        this.value = rand.nextInt(this.numSides) +1;
}
    /**
     * allow value to be accessed by the DiceTower.
     * @return the value of variable value.
     */
    @Override
        public int getValue(){
            return this.value;
        }
}

    

