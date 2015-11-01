/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package dnddiceroller;

/**
 *
 * @author Home pc
 */
public class Die extends NumberedDie{
   
    public Die(int die) {
        super(die);
        Fudge fudge = new Fudge(die,die,die, die);
        Loaded loaded = new Loaded(die,die);
    }


    
    
}

