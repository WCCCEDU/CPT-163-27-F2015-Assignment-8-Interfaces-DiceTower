package dnddiceroller;

import java.util.ArrayList;
import java.util.List;

/**
 * @author Paul Scarrone
 * @author Gary A. Newsome
 */
public class DnDDiceRoller {

  /**
   * Try out your dies and dice tower
   *
   * @param args the command line arguments
   */
  public static void main(String[] args) {
    for (int i = 0; i < 1000; i++) {
      int d6 = test_oneD6();
      if (d6 != -1) {
        System.out.println("Die Test Failed with Value: " + d6);
      }
      int tower = test_diceTowerWithTwoD6();
      if (tower != -1) {
        System.out.println("Tower Test Failed with Value: " + tower);
      }
      int tower33 = test_diceTower33();
      if (tower33 != -1) {
        System.out.println("Tower Test Failed with Value: " + tower33);
      }
    }
    test_Loaded();
    test_Fudge();
  }

  public static int test_oneD6() {
    NumberedDie die = new NumberedDie(6);
    die.roll();
    int dieValue = die.getValue();
    if (dieValue >= 1 && dieValue <= 6) {
      return -1; // Means the die value is INSIDE its bounds for a d6
    } else {
      return dieValue;
    }
  }

  public static int test_diceTowerWithTwoD6() {
    List<NumberedDie> dice = new ArrayList();
    dice.add(new NumberedDie(6));
    dice.add(new NumberedDie(6));
    DiceTower tower = new DiceTower(dice);
    tower.dropDice();
    int trayValue = tower.getTrayValue();
    if (trayValue >= 2 && trayValue <= 12) {
      return -1; // means the die value is INSIDE the bounds of 2 d6
    } else {
      return trayValue;
    }
  }

  public static int test_diceTower33() { // just for fun
    List<NumberedDie> dice = new ArrayList();
    dice.add(new NumberedDie(5));
    dice.add(new NumberedDie(8));
    dice.add(new NumberedDie(20));
    DiceTower35 tower = new DiceTower35(dice);
    tower.dropDice35();
    int trayValue = tower.getTrayValue();
    if (trayValue >= 3 && trayValue <= 33) {
      return -1; // means the die value is INSIDE the bounds of 2 d6
    } else {
      return trayValue;
    }
  }

  public static void test_Loaded() {
    Loaded loaded = new Loaded();
    int test = loaded.determineRoll();
    println("Loaded die is set to 5.");
    print("Your roll: ");
    if (test != 1) {
      System.out.println(5);
      println(";-)");
    } else {
      loaded.roll();
      System.out.println(loaded.getValue());
      if (loaded.getValue() != 5) {
        println("Better luck next time.");
      } else {
        println(";-p Got my number anyway!");
      }
    }
  }
  
  public static void test_Fudge(){
    Fudge fudge = new Fudge();
    fudge.roll();
    int fudgeTest = fudge.getValue();
    System.out.println("\nFudge die result: " + fudgeTest);
    
  }

  public static void println(String message) {
    System.out.println(message);
  }

  public static void print(String message) {
    System.out.print(message);
  }
}
