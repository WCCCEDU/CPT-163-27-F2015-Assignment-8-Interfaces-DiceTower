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
  final int PANEL_COUNT = 3;
  private List<NumberedDie> numberedDice;
  private List<Load> loadDice;
  private int trayValue;
  private List<Fudge> fudgeDice;
  
  
  //constructor for array list
  public DiceTower() {
	this.numberedDice = new ArrayList();
        this.loadDice=new ArrayList();
        this.fudgeDice=new ArrayList();
        
  }
  
  
  
  //for loop in this
  public void dropDice(){
      for(int i=0; i<this.numberedDice.size();i++){
          this.numberedDice.get(i).roll();
      }
          
  }
  
  //consturctor for variables out of array list function
  public DiceTower(List dice) {
	this.numberedDice = numberedDice;
        this.loadDice=loadDice;
        this.fudgeDice=fudgeDice;
        
  }
  
  
  //this will retunr the value of trayValue
  public int getTrayValue(){
      return trayValue;
  }
  
  
  }
  
  
