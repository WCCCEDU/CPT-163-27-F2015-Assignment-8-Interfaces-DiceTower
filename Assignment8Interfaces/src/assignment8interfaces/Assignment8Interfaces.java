/**
 * A new version of the Dice Tower assignment, this program uses a dice interface
 * and implements two types of die objects from the interface.
 */
package assignment8interfaces;

import java.util.ArrayList;
import java.util.List;

/**
 *
 * @author Samantha Shurie
 */
public class Assignment8Interfaces {

  public static void main(String[] args) {
    for(int i = 0; i< 1000; i++){
	  int d6 = test_oneD6();
	  if(d6 != -1){
		System.out.println("Die Test Failed with Value: " + d6);
	  }
	  int tower = test_diceTowerWithTwoD6();
	  if(tower != -1){
		System.out.println("Tower Test Failed with Value: " + tower);
	  }
          //test fudge die using similar format to test method 1
          int fudge = test_fudgeDie();
          if(fudge != -1){
		System.out.println("Fudge Test Failed with Value: " + fudge);
	  }
          test_LoadedDie();
	}
    }   // end of main method
    
    //tests the dice class
    public static int test_oneD6(){
	NumberedDie die = new NumberedDie(6);
	die.roll();
	int dieValue = die.getValue();
	if(dieValue >= 1 && dieValue <= 6){
	  return -1; // Means the die value is inside its bounds for a d6
	}else{
	  return dieValue;
	}
    }   // end of test one method
    
    //tests the dice tower class
    public static int test_diceTowerWithTwoD6(){
	List<NumberedDie> dice = new ArrayList();
	dice.add(new NumberedDie(6));
	dice.add(new NumberedDie(6));
	DiceTower tower = new DiceTower(dice);
	tower.dropDice();
	int trayValue = tower.getTrayValue();
	if(trayValue >= 2 && trayValue <= 12){
	  return -1; // means the die value is inside the bounds of 2 d6
	}else{
	  return trayValue;
	}
    }   //end of test 2 method
    
    /**
     * Test method created using first test method as a starting point to test
     * fudge die class
     * @return integer value: -1 or value of die if outside of desired bounds 
     */
    public static int test_fudgeDie() {
      FudgeDie fudged = new FudgeDie();
      fudged.roll();
      int value = fudged.getValue();
      if(value >= -1 && value <= 1) {
        return -1; //die value is within correct range
      } else {
        return value; //die value is within the correct range
      }
    }//end of fudge test method
    
    /**
     * Slightly modified test method used to test for incorrect values rolled and
     * also to compare standard die with loaded die outcomes.
     */
    public static void test_LoadedDie() {
      LoadedDie loaded = new LoadedDie();
      NumberedDie numbered = new NumberedDie(6);
      int numberedHit = 0;
      int loadedHit = 0;
      
      for(int i = 0; i < 100; i++) {
        numbered.roll();
        loaded.roll();
        int numberedValue = numbered.getValue();
        int loadedValue = loaded.getValue();
        if(numberedValue == 6) {
          numberedHit += 1;
        }
        if(loadedValue == 6) {
          loadedHit += 1;
        }
      }
      int difference = loadedHit = numberedHit;
      System.out.println("Loaded die hit target value (6) " + difference +
              " more times than numbered die");
    }
    
}   //end of class

