package dnddiceroller;

import java.util.ArrayList;
import java.util.List;


/**
 * Dice Tower.
 * A Dice Tower is a tool used by serious gamers use to roll many dice at once.
 * It looks like this https://www.miniaturescenery.com/Images/PortableDiceTowerLarge.jpg
 * An instance of a dice tower is defined by the number panels it contains to help
 * provide a more regular distribution of die values. The die bounce from panel to
 * panel until they exit the dice tower at the bottom tray.
 * A dice tower will accept a collection of dice and reports their results when
 * they reach the tray at the bottom
 * @author Paul Scarrone
 * @author Katrina Siffrinn
 */
public class DiceTower {
       
  //fields
  final int PANEL_COUNT = 3;
  private List<NumberedDie> numberedDice;
  private List <Fudge> fudgeDice;
  private List <Loaded> loadedDice;
  private int trayValue = 0;

 
   //constructors accept values for fields. 
    public DiceTower() {
        this.numberedDice = new ArrayList();
        this.fudgeDice = new ArrayList();
        this.loadedDice = new ArrayList();
      }
  
    /**
     * 
     * @param Dice 
     */
  public DiceTower(List Dice) {
        this.numberedDice = numberedDice;
        this.fudgeDice = fudgeDice; 
        this.loadedDice = loadedDice;
      
  }
  /**
   * accessors return values to fields.
   * @return the value of trayValue.
   */
  
  public int getTrayValue(){
      return trayValue;
  }
  
  //dropDice method simulates die being dropped into a dice tower.
  public void dropDice(){
      int i = 0;
      for(NumberedDie die : numberedDice){
             for(int num = 0; num < PANEL_COUNT; num++){
             numberedDice.get(i).roll();
         } 
    //get value of dice in dice tower tray at exit
         trayValue += numberedDice.get(i).getValue();
            i++;
      }
      int x = 0;
      for(Fudge die : fudgeDice){
             for(int num = 0; num< PANEL_COUNT; num++){
             fudgeDice.get(x).roll();
         } 
    //get value of dice in dice tower tray at exit
         trayValue += fudgeDice.get(x).getValue();
            x++;
  }
    int z = 0;
      for(Loaded die : loadedDice){
             for(int num = 0; num < PANEL_COUNT; num++){
             loadedDice.get(z).roll();
         } 
    //get value of dice in dice tower tray at exit
         trayValue += loadedDice.get(z).getValue();
            z++;
      }
  }
}
