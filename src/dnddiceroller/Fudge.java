/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package dnddiceroller;

import java.util.Random;

/**
 *
 * @author Gary
 */
public class Fudge implements Die{
    // fields/declarations
  private int numberSides;    // holds the number of sides the die has
  private int value;          // holds the value of the current roll
  /**
   * constructor
   *
   * @param numberSides
   * @param value
   */
  public Fudge(){
    this.numberSides = 6;
    this.value = 0;
  }

  public int getNumberSides() {
    return this.numberSides;
  }

  public int getValue() {
    return this.value;
  }

  /**
   * roll method determines the Fudge dice outcome
   */
  public void roll() {
    Random randomNumbers = new Random();
    this.value = randomNumbers.nextInt(this.numberSides/2) - 1;
  } // end roll method

} // end Fudge.java
  

