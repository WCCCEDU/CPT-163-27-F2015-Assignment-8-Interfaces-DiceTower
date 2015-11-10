package dnddiceroller;
import java.util.Random;
/**
 *
 * @author Katrina
 */

public class Fudge implements Die{
    
    // fields
  private final int sides;    
  private int value;      
   
    //constructor
    public Fudge(){
      this.sides = 0;
      this.value = 3;
  }
     

    /**
     * accessor
     * @return
     */
      @Override
  public int getValue() {
    return this.value;
  }
   
    //roll method 
  @Override
  public void roll() {
    Random rand = new Random();
    this.value = rand.nextInt(3) - 1;
  } 

} 
 

