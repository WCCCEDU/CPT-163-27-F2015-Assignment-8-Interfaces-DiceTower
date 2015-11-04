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
 */
public class DiceTower {
        private final int PANEL_COUNT = 3;
        private List<NumberedDie> numberedDice;
        private List<Fudge> fudgeDice;
        private List<Loaded> loadedDice;
        private int trayValue;

  public DiceTower() {
	this.numberedDice = new ArrayList();
        this.fudgeDice = new ArrayList();
        this.loadedDice = new ArrayList();
        trayValue = 0;
  }
  
  public DiceTower(List dice) {
	this.numberedDice = numberedDice;
        this.fudgeDice = fudgeDice;
        this.loadedDice = loadedDice;
        trayValue = 0;
  }

  public int getTrayValue() {
        return trayValue;
  }
  
  
  /**
   * Utilizes the roll() method per the number of panels in the dice tower.
   */
  public void dropDice() {
        int i = 0;
        for (NumberedDie die : numberedDice){
            for(int x = 0; x < PANEL_COUNT; x++){
                numberedDice.get(i).roll();
            }
            trayValue += numberedDice.get(i).getValue();
            i++;
        }
        
        int v = 0;
        for (Fudge die : fudgeDice){
            for(int x = 0; x < PANEL_COUNT; x++){
                numberedDice.get(v).roll();
            }
            trayValue += numberedDice.get(v).getValue();
            v++;
        }
        
        int z = 0;
        for (Loaded die : loadedDice){
            for(int x = 0; x < PANEL_COUNT; x++){
                numberedDice.get(z).roll();
            }
            trayValue += numberedDice.get(z).getValue();
            z++;
        }
  }
  
  
}
