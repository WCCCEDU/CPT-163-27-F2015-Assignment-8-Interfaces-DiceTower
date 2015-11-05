package dnddiceroller;

import java.util.ArrayList;
import java.util.List;

/**
 * @author Steven Plas
 */
public class DiceTower {
  private final int PANEL_COUNT = 3;
  private List<NumberedDie> dice;
  private int dieSum;

  public DiceTower() {
	this.dice = new ArrayList();
        this.dieSum = 0;
  }
  
  public DiceTower(List dice){
	this.dice = dice;
        this.dieSum = 0;
  }
  
  public int getDieSum(){return this.dieSum;}
  
  public void dropDice() {
      int i = 0;
       for  (NumberedDie die : dice){
           dice.stream().forEach((_item) -> {
               die.roll();
           });
           dieSum += dice.get(i).getValue();
           i++;
       }   
   }
}
