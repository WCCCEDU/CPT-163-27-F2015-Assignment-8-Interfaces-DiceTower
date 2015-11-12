/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package dnddiceroller;

import java.util.Random;

/**
 *
 * @author Adam
 */
public class LoadedDie implements Die{
    private int sides;
    private int value;
    private int loadedSide;
    
    public LoadedDie(){
        this.sides = 6;
    }
    
    public int loadedSide(){
        loadedSide = new Random().nextInt(2)-1;
       return loadedSide; 
    }
    
    @Override
    public int getValue(){
        return value;
    }

    @Override
    public void roll() {
        this.value = (new Random().nextInt(this.sides)+1);
    }
}
