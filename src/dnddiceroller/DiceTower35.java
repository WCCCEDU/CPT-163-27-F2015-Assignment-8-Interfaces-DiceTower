package dnddiceroller;

import java.util.ArrayList;
import java.util.List;

/**
 * Dice Tower. A Dice Tower is a tool used by serious gamers use to roll many
 * dice at once. It looks like this
 * https://www.miniaturescenery.com/Images/PortableDiceTowerLarge.jpg An
 * instance of a dice tower is defined by the number panels it contains to help
 * provide a more regular distribution of die values. The die bounce from panel
 * to panel until they exit the dice tower at the bottom tray. A dice tower will
 * accept a collection of dice and reports their results when they reach the
 * tray at the bottom
 *
 * @author Paul Scarrone
 */
public class DiceTower35 { // copypasta!

    private final int PANEL_COUNT = 5;    // holds the number of panels in the dice tower
    private List<NumberedDie> dice;               //
    private int trayValue;

    public DiceTower35() {
        this.dice = new ArrayList(); // 
        this.trayValue = 0;
    }

    public DiceTower35(List dice) {
        this.dice = dice; // 
        this.trayValue = 0;
    }

    public int getTrayValue() {
        return this.trayValue;
    }

    public void dropDice35() {
        // call roll method from Die.java class
        // roll dice three times to simulate 3 paneled dice tower
        for (int panels = 0; panels < PANEL_COUNT; panels++) {
            this.dice.stream().forEach((die) -> {
                die.roll();
            });
        } // end panels for loop
        
        // get the value of the dice
        this.dice.stream().forEach((die) -> {
            this.trayValue += die.getValue();
        });

    } // end dropDice35

} // end DiceTower35.java

