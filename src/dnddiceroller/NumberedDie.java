/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package dnddiceroller;

import java.util.Random;


public class NumberedDie{
    private int die;
    private int value;
    private Random dieSide = new Random();
   
    public NumberedDie(int die) {
       this.die = die;
       
}

    public void roll() {
        value = dieSide.nextInt(die) + 1;// dieSide is equal to 0 thri (die -1).
        //System.out.println(value);
    }

    public int value() {
        return this.value;
    }
}

