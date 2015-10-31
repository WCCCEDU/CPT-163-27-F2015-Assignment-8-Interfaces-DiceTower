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
public class NumberedDie implements Die{
    private int valueOfDie;
    private int sideOfDie;
    

//con to get the # of sides oof the value
public NumberedDie(int sideOfDie){
    this.sideOfDie=sideOfDie;

}
//access
public int getvalueOfDie(){
    return valueOfDie;
}

public int roll(){
    Random rand1=new Random();
    return this.valueOfDie=rand1.nextInt(this.sideOfDie)+1;
    
}
}