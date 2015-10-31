/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package dnddiceroller;

import java.util.Random;

/**
 *
 * @author Zachary
 */
public class Fudge extends Die {
       private int sideOfDie;
    private int valueOfDie;
    
    
    public int getvaleOfDie(){
        return valueOfDie;
        
    }
    
    public Fudge (int sideOfDie){
        this.sideOfDie=sideOfDie;
    }
    
    public int roll(){
        Random rand1=new Random();
        return this.valueOfDie=rand1.nextInt(this.sideOfDie)-1;
    }
}
