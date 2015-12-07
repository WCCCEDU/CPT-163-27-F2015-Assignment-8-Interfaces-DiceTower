/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package ordodicetower;

import java.util.ArrayList;
import java.util.List;

/**
 *
 * @author zacharyzordo
 */
public class Ordo_DiceTower {

    /**
     * @param args the command line arguments
     */
    
    public static void main(String[] args) {
        boolean d6Pass = true;
        boolean fudgePass = true;
        boolean loadedPass = true;
        boolean towerPass = true;
	for(int i = 0; i< 1000; i++){
            int d6 = test_regD6();
            int fudged = test_fudgeDie();
            int loaded = test_loadedD6();
            if(d6 != -1){
		System.out.println("Die Test Failed with Value: " + d6);
                d6Pass = false;
            }
            if(fudged != -1){
                System.out.println("Fudge Die Test Failed with Value: " + fudged);
                fudgePass = false;
            }
            if(loaded != -1){
                System.out.println("Loaded Die Test Failed with Value: " + loaded);
                loadedPass = false;
            }
            int tower = test_diceTowerWithTwoD6();
            if(tower != -1){
                System.out.println("Tower Test Failed with Value: " + tower);
                towerPass = false;
            }   
        }
        if(d6Pass){
            System.out.println("Die Test Passed");
        }
        if(fudgePass){
            System.out.println("Fudge Die Test Passed");
        }
        if(loadedPass){
            System.out.println("Loaded Die Test Passed");
        }
        if(towerPass){
            System.out.println("Tower Test Passed");
        }
    }
  
    public static int test_regD6(){
	RegularDie die = new RegularDie(6);
	die.roll();
	int dieValue = die.getDieValue();
	if(dieValue >= 1 && dieValue <= 6){
            return -1; // Means the die value is inside its bounds for a d6
	}else{
            return dieValue;
	}
    }
    
    public static int test_fudgeDie(){
        Fudge die = new Fudge();
        die.roll();
        int dieValue = die.getDieValue();
        if(dieValue >= -1 && dieValue <= 1){
            return -1; // Means the die value is inside its bounds for a Fudge die.
        }else{
            return dieValue;
        }
    }
    
    public static int test_loadedD6(){
        Loaded die = new Loaded();
	die.roll();
	int dieValue = die.getDieValue();
	if(dieValue >= 1 && dieValue <= 6){
            return -1; // Means the die value is inside its bounds for a d6
	}else{
            return dieValue;
	}
    }
  
    public static int test_diceTowerWithTwoD6(){
	List<RegularDie> dice = new ArrayList();
	dice.add(new RegularDie(6));
	dice.add(new RegularDie(6));
	DiceTower tower = new DiceTower(dice);
	tower.whatAreTheDiceValues();
	int trayValue = tower.trayValue();
	if(trayValue >= 2 && trayValue <= 12){
            return -1; // means the die value is outside the bounds of 2 d6
	}else{
            return trayValue;
	}
    }
}