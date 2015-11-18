/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package assignment8;

import java.util.Random;

/**
 *
 * @author mkavic
 */
public class Loaded implements Die 
{
private int sides = 0;
int value =0;
int loadedValue;


public Loaded (int sides)
{
    this.sides = 6;
}
@Override
public void roll()
{
  Random die = new Random();
       loadedValue = die.nextInt(this.sides) + 1;  
}
@Override

public int value()
{
    Random loaded = new Random();

     if(loadedValue  > 1)
        
         value = loaded.nextInt(this.sides) + 1;
    
    else 
       value = loadedValue;
    return value; 
}

}


