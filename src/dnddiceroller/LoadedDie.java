package dnddiceroller;

/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */

import java.util.Random;

/**
 *
 * @author Jacob
 */
public class LoadedDie implements Die {

    //requried fields
  private int dieSize; //number of sides the dice has
  private int result; //result rolled
  private int loadedProbability; //the die result that is "
  
  public LoadedDie(int dieSize) {
    this.dieSize = dieSize;
    this.result = 0;
  }
  
  public void loadedProbability(){
    Random randomProbability = new Random();
    this.loadedProbability = randomProbability.nextInt(3);
    if(loadedProbability == 1){ 
      result = 6;
    } else {
      roll();
    }
  }
  
  @Override
  public void roll() {
    Random randomRoll = new Random();
    this.result = randomRoll.nextInt(this.dieSize) + 1;
  }  
  
  public int getDieSize(){
    return dieSize;
  }
  
  @Override
  public int getResult(){
    return result;
  }
  
  public int getLoadedProbablity(){
    return loadedProbability;
  }
}
