package dnddiceroller;
import java.util.Random;
/**
 *
 * @author Katrina
 */

public class Fudge implements Die{
    
    // fields
  private final int numSides;    
  private int value;      
   
    //constructor
     public Fudge(){
    this.numSides = 0;
    this.value = 0;
  }
     //accessors
  public int getNumSides() {
    return this.numSides;
  }
   @Override
  public int getValue() {
    return this.value;
  }
    //roll method 
  @Override
  public void roll() {
    Random rand = new Random();
    this.value = rand.nextInt(this.numSides/3);
  } 

} 
 

