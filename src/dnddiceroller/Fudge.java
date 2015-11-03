/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package dnddiceroller;

import java.util.Random;

/**
 *
 * @author Home pc
 */
class Fudge extends NumberedDie {
    private int fudgeValues;
    private Random fudge = new Random();
    public Fudge(int die,int fudgeValues,int roll,int value) {
        super();
        roll();
        value();
        this.fudgeValues = fudgeValues;
    }

    public int getFudgeValues() {
        int Fudge = 0;
        for (int i = -1; i < 1; i++) {
            fudgeValues = fudge.nextInt();
            
            
        }
        return fudgeValues;
    }

    public void setFudgeValues(int fudgeValues) {
        this.fudgeValues = fudgeValues;
    }

    private void roll() {
        throw new UnsupportedOperationException("Not supported yet."); //To change body of generated methods, choose Tools | Templates.
    }

    private void value() {
        throw new UnsupportedOperationException("Not supported yet."); //To change body of generated methods, choose Tools | Templates.
    }
    
    
}
