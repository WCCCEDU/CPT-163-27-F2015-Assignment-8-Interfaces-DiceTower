/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package assignment8interfaces;

import java.util.ArrayList;
import java.util.List;

/**
 *
 * @author Samantha
 */
public class DiceTower {
   final int PANEL_COUNT = 3;
    List<NumberedDie> diceList;
    int trayValue;

    public DiceTower() {
        this.diceList = new ArrayList();
        trayValue = 0;
    }
  
    public DiceTower(List diceList) {
	this.diceList = diceList;
        trayValue = 0;
    }
    
    public int getTrayValue() {
        return trayValue;
    }
  
    public void dropDice() {
        int i = 0;
        for (NumberedDie die : diceList){
            
            for(int n = 0; n < PANEL_COUNT; n++) {
                diceList.get(i).roll();
                
            }
            trayValue += diceList.get(i).getValue();
            i++;
        }   
    } 
}
