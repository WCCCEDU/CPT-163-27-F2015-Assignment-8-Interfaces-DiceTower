
package assignment8interfaces;

import java.util.Random;

public class FudgeDie implements Die {
  private final int sides;
  private int value;

  public FudgeDie() {
    this.sides = 3;
    this.value = 0;
  }

  @Override
  public int getValue() {
    return value;
  }
  
  @Override
  public void roll() {
    //rolls a number from 0 to 2 (3 exclusive), and then offsets by factor of
    //1 to include -1 in the range of randoms
    this.value = (new Random()).nextInt(3) - 1; 
  }
  
}
