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
class Loaded extends NumberedDie {
    private int loadedValues;
    private Random loaded = new Random();
    public Loaded(int die,int loadedValue ) {
        super();
        roll();
        value();
        this.loadedValues = loadedValues;
    }

    public void setLoadedValues(int loadedValues) {
        this.loadedValues = loadedValues;
    }

    public int getLoadedValues() {
        for (int i = 0; i < 10; i++) {
                loadedValues = loaded.nextInt();
            }
        return loadedValues;
    }

    private void roll() {
        throw new UnsupportedOperationException("Not supported yet."); //To change body of generated methods, choose Tools | Templates.
    }

    private void value() {
        throw new UnsupportedOperationException("Not supported yet."); //To change body of generated methods, choose Tools | Templates.
    }

    @Override
    public NumberedDie <error>(int die) {
        throw new UnsupportedOperationException("Not supported yet."); //To change body of generated methods, choose Tools | Templates.
    }

    @Override
    public int value() {
        throw new UnsupportedOperationException("Not supported yet."); //To change body of generated methods, choose Tools | Templates.
    }
    
}

