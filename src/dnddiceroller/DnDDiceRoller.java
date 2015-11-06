package dnddiceroller;

import java.util.ArrayList;
import java.util.List;
import java.util.Random;

/**
 *
 * @author Paul Scarrone
 * @author Sharon R. Tinkey
 * 
 * NOTE: println statements are used for testing feedback and should be removed 
 * when a user interface is added.
 *  
 */
public class DnDDiceRoller {

  /**
   * Try out your dies and dice tower
   * @param args the command line arguments
   */
    public static void main(String[] args) {
	for(int i = 0; i < 1000; i++){
	  // test OneDie class: roll 1 die and test value
          int d6 = test_oneD6();
	  if(d6 != -1){
            System.out.println("Die   Test " + i + " Failed.   d6    = " + d6);
	  } else {
            //System.out.println("Die   Test " + i + " complete. d6    = " + d6);
          }
          
          // test FudgeDie class: roll 1 die and test value
          int f6 = test_onefudgeDieD6();
	  if(f6 != -1){
            System.out.println("Fudge Test " + i + " Failed.   f6    = " + f6);
	  } else {
            //System.out.println("Fudge Test " + i + " complete. f6    = " + f6);
          }
         
          // test LoadedDie class: roll 1 die and test value
          int l6 = test_oneLoadedDieD6();
	  if(l6 != -1){
            System.out.println("Loaded Test " + i + " Failed.   L6    = " + l6);
	  } else {
            //System.out.println("Loaded Test " + i + " complete. L6    = " + l6);
          }
        
        // test DiceTower class: roll 2 regular die typew and test value 
	  int tower1 = test_diceTowerWithTwoD6();
	  if(tower1 != -1){
            System.out.println("Tower1 Test " + i + " Failed.   tower1 = " + tower1);
	  } else {
            //System.out.println("Tower1 Test " + i + " complete. tower1 = " + tower1);
          }
          
        // test DiceTower class: roll 6 random die types and test value 
	  int tower2 = test_diceTowerWithRandomDice();
	  if(tower2 != -1){
            System.out.println("Tower2 Test " + i + " Failed.   tower2 = " + tower2);
	  } else {
            System.out.println("Tower2 Test " + i + " complete. tower2 = " + tower2);
          }
        
        }//if
        System.out.println("\n\nThat's all folks!");   
    }//main
  
 /*****************************************************************************/
    
  /**
   * test_oneD6    roll one die and test that value is correct for a 6-sided
   *               regular die
   * @param        none
   * @return       the result of testing:  -1 -> die value is correct
   */
    public static int test_oneD6(){      
	OneDie die = new OneDie(6);               // create a die object
	die.roll();                         // roll the die
	int dieValue = die.getDieValue();      // get value of the die
	if(dieValue >= 1 && dieValue <= 6){
          //System.out.print("Die   Test value: " + dieValue + "  ");
	  return -1;        // Means the die value is correct for a d6
	}else{
	  return dieValue;
	}
    }//test_oneD6
    
    public static int test_onefudgeDieD6(){
        FudgeDie die = new FudgeDie(6);        // create a die object
	die.roll();                            // roll the die
	int dieValue = die.getDieValue();      // get value of the die
        String errMsg = die.getErrMsg();       // get error msg if exists
        if(errMsg != ""){
            System.out.println(errMsg);
            dieValue = -2;
        }
	if(dieValue >= -1 && dieValue <= 1){
          // System.out.print("Fudge Test value: " + dieValue + "  ");
	  return -1;        // Means the die value is correct for a d6
	}else{
	  return dieValue;
	}
    }//test_fudgeDice
  
    public static int test_oneLoadedDieD6(){
        LoadedDie die = new LoadedDie(6);      // create a die object
        die.setLoadedDie();                    // set the "loaded" value
	die.roll();                            // roll the die
	int dieValue = die.getDieValue();      // get value of the die
	if(dieValue >= 1 && dieValue <= 6){
          //System.out.print("Loaded Test value: " + dieValue + "  ");
	  return -1;        // Means the die value is correct for a d6
	}else{
	  return dieValue;
	}
    }//test_loadedDice
    
    /**
    * test_diceTowerWithTwoD6    roll 2 dice and test that total value of dice
    *                            is correct for two 6-sided regular dice
    * @param                     none
    * @return                    the result of testing: -1 means die value is correct
    */
    public static int test_diceTowerWithTwoD6(){
        // create a die object arraylist
	List<OneDie> dice = new ArrayList();
        // create die objects and add to the dice arraylist
	dice.add(new OneDie(6));           
	dice.add(new OneDie(6));  
        // create dicetower object and put the dice object in it
	DiceTower tower = new DiceTower(dice);            
        tower.dropDice();                       // roll the dice
	int trayValue = tower.trayValue();      // add the value of all dice
	if(trayValue >= 2 && trayValue <= 12){
          //System.out.print("Tower Test value: " + trayValue + "  ");  
	  return -1;       // means the die value is correct for two d6 dice
	}else{
	  return trayValue;
	}
    }//test_diceTowerWithTwoD6
    
    /**
    * test_diceTowerWithRandomDice
    *                           Roll 6 random dice through the dice tower
    *                           Random dice can be regular or loaded and may or
    *                           may not use a fudge die.
    * @param                    none
    * @return                   the result of testing: -1 means die value is correct
    */
    public static int test_diceTowerWithRandomDice(){
        // create die object arraylist
	List<Die> dice = new ArrayList();
        Random randomNumber = new Random();
        // create die objects and add to the dice arraylist
        for (int i = 1; i <=6; i++){            
            int result = randomNumber.nextInt(2);
            if (result == 0){
                dice.add(new OneDie(6));        // create regular die
            } else {
                dice.add(new LoadedDie(6));     // create loaded die
            }          
        }
        // create dicetower object and put the dice object in it
	DiceTower tower = new DiceTower(dice);            
        tower.dropDice();                       // roll the dice
	int trayValue = tower.trayValue();      // add the value of all dice
        System.out.println("trayValue before fudge = " + trayValue);
        
        int result = randomNumber.nextInt(2);   // Use fudge die? 0 = no 1 = yes
        if (result == 1){                          // create fudge die
            FudgeDie die = new FudgeDie(6);        // create a die object
            die.roll();                            // roll the die
            int dieValue = die.getDieValue();      // get value of the die
            System.out.println("Fudge die value = " + dieValue);
            trayValue += dieValue;                 // adjust total by fudge die            
        }
        
        // total with range? 6 dice * #6 on dice + maybe 1 fudge
	if(trayValue >= 2 && trayValue <= 37){
          System.out.println("Tower2 Test value: " + trayValue);  
	  return -1;       // means the die value is correct for 6 d6 dice
	}else{
	  return trayValue;
	}
    }//test_diceTowerWithRandomDice
    
} //class
