/**
 *
 * @author Miguel Capule
 */
package Fundamentals;

public class WeakEnemy extends Enemy{
    
    WeakEnemy(){
    
        name = "Weak Enemy";
        hp = 100;
    
    }
    
    void dialog(){
    
        System.out.println(name + " : I am weak.");
    
    }
    
}
