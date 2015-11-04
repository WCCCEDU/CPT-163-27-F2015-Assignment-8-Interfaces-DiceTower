
package assignment8interfaces;
import java.util.Random;

public class LoadedDie implements Die {
  private final int sides;
  private int value;
  private int targetValue;

  public LoadedDie() {
    this.sides = 6;
    this.value = 1;
    this.targetValue = 6;
  }
  
  //parameterized constructor in case the desired value is different
  public LoadedDie(int targetVal) {
    this.sides = 6;
    this.value = 1;
    this.value = targetVal;
  }

  @Override
  public int getValue() {
    return this.value;
  }
  
  @Override
  public void roll() {
    //roll onces, then if the value is not already the desired value, give  up
    //to 3 more tries to reach it, weighing that outcome more heavily
    this.value = (new Random()).nextInt(this.sides) + 1;
    for(int i = 0; i < 3; i++) {
      if(this.value != this.targetValue) {
        this.value = (new Random()).nextInt(this.sides) + 1;
      }
    }
  } //end roll method
} //end class
