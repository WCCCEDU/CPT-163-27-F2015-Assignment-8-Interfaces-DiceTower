package dnddiceroller;

import java.util.ArrayList;
import java.util.List;

/**
 * @author Rhonda Marshall
 * Nov 1, 2015
 */
public class DnDDiceRoller {
    /**
     * Try out your dies and dice tower
     * @param args the command line arguments
     */
    public static void main(String[] args) {
        final int MAX_RUNS = 1000;
        final int NUM_NUMBERED_DICE = 6;
        final int NUM_FUDGE_DICE = 4;
        final int NUM_LOADED_DICE = 1;
        
        System.out.println("Start Test");
        for (int i = 0; i < MAX_RUNS; i++) {
            int error = testTower(NUM_NUMBERED_DICE, NUM_FUDGE_DICE, NUM_LOADED_DICE);
            if (error != -1) {
                System.out.println("Mixed Dice Test Failed with Value: " + error);
            }    
        }
        System.out.println("End Test");
        
    } // main method
    
   
    /**
     * A method to test the dice tower
     * Method accepts the number of numbered die, the number of fudge die
     * and the number of loaded die
     * 
     * The number of sides on the die is fixed at 6
     * The loaded side of the dice is is fixed at 1 and may be changed to be 
     * a value between 1 and 6
     * 
     * @param num_numbered
     * @param num_fudge
     * @param num_loaded
     * @return 
     */
    public static int testTower(int num_numbered, int num_fudge, int num_loaded) {
        final int NUM_SIDES = 6;
        final int LOADED_SIDE = 1;
       
        List<Die> dice = new ArrayList();
            
        for (int i = 0; i < num_numbered; i++)
            dice.add(new NumberedDie(NUM_SIDES));
        
        for (int i = 0; i < num_fudge; i++)
            dice.add(new Fudge(NUM_SIDES));
            
        for (int i = 0; i < num_loaded; i++)
            dice.add(new Loaded(NUM_SIDES, LOADED_SIDE));
            
        DiceTower tower = new DiceTower(dice);
        tower.dropDice();
            
        int trayValue = tower.getTrayValue();

        int low = 0;
        int high = 0;
        
        /**
         * A numbered die increases the low range by number of numbered die
         * A numbered die increases the high range by the number of sides for
         * each numbered die
         */
        if (num_numbered != 0) {
            low += num_numbered;
            high += (num_numbered * NUM_SIDES);
        }
        
        /**
         * A fudge die reduces the low range and increases the high range by 
         * one for each fudge die
         */
        
        if (num_numbered == 0 && num_loaded == 0) {
            low = num_fudge * -1;
            high = num_fudge;
            }
        else {
            low -=  num_fudge;
            high += num_fudge; 
            }
        
        /**
         * A loaded die increases the low range by number of numbered die
         * A loaded die increases the high range by the number of sides for
         * each loaded die
         */
        if (num_loaded != 0) {
            low += num_loaded;
            high += (num_loaded * NUM_SIDES);
        }
      
        if (trayValue >= low && trayValue <= high) {
            return -1;
            } 
        else {
            return trayValue;
         }
            
    } // testTower method    
}
