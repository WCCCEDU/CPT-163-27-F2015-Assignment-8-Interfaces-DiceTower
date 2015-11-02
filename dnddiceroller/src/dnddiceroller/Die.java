package dnddiceroller;

/**
 * @author Rhonda Marshall
 * Nov 1, 2015
 * 
 * Die interface
 * 
 * An interface specifies behavior of the class
 * An interface cannot be instantiated
 * All methods that are specified in an interface have no bodies
 * All methods listed in an interface must be written elsewhere
 *      a class that implements an interface is agreeing to provide
 *      all the methods that are specified by the interface with
 *      the exact signatures and with the same return 
 * No access specifier is used with method headers because all methods
 * specified by an interface are public
 * 
 * Die is an interface reference variable
 * Die can reference any object that implements this interface, regardless
 * of its class type.  This would be an example of polymorphism, i think
 *  
 */

public interface Die {
   void roll();
   int getValue();
}
