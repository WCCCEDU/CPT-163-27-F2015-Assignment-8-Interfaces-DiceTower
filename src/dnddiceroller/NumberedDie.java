package dnddiceroller;

import java.util.Random;

/**
 *
 * @author Katrina
 */
public class NumberedDie implements Die{
    
    //fields
    final private int sides;
    private int value;

/**
 * the constructor,  performs initial roll of the die.
 * @param sides is the number of sides for this die.
 */
    public NumberedDie(int sides){
        this.sides = sides;
       
    }

    @Override
    public int getValue() {
        return this.value;
    }    

    //the roll method simulates the rolling of the die.
 
    @Override
      public void roll(){
        
        //create a Random object.
        Random rand = new Random();

        //get a random value for this die.
        this.value = rand.nextInt(this.sides) +1;

   
        }
}

    

