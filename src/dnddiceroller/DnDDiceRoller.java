package dnddiceroller;

import java.util.ArrayList;
import java.util.List;

/**
 *
 * @author Paul Scarrone
 */
public class DnDDiceRoller {

  /**
   * Try out your dies and dice tower
   * @param args the command line arguments
   */
  public static void main(String[] args) {
	for(int i = 0; i< 1000; i++){
	  int d6 = test_oneD6();
          //System.out.println("d6: " + d6);
          
	  if(d6 != -1){
		System.out.println("Die Test Succeeded with Value: " + d6);
	  }
          else
               System.out.println("Die Test failed!");
	  int tower = test_diceTowerWithTwoD6();
          //System.out.println("tower: " + tower);
          
	  if(tower != -1){
		System.out.println("Tower Test Succeeded with Value: " + tower);
	  }
          else
               System.out.println("Tower Test failed!");
	}
  }
  
  public static int test_oneD6(){
	Die die = new Die(6);
	die.roll();
	int dieValue = die.value();
	if(dieValue < 1 || dieValue > 6){
	  return -1; // Means the die value is outside its bounds for a d6
	}else{
	  return dieValue;
	}
  }
  
  public static int test_diceTowerWithTwoD6(){
	List<Die> dice = new ArrayList();
	dice.add(new Die(6));
	dice.add(new Die(6));
	DiceTower tower = new DiceTower(dice);
	tower.dropDice();
	int trayValue = tower.trayValue();
        //System.out.println("TrayValue: " + trayValue);
        
	if(trayValue < 2 || trayValue > 12){
	  return -1; // means the die value is outside the bounds of 2 d6
	}else{
	  return trayValue;
	}
  }

//    private static DiceTower DiceTower(List<Die> dice) {
//        throw new UnsupportedOperationException("Not supported yet."); //To change body of generated methods, choose Tools | Templates.
//    }
  
}
