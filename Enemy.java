/**
 *
 * @author Miguel Capule
 */
package Fundamentals;

public class Enemy {
    
    String name;
    int hp;
    
    void dialog(){
    
        System.out.println("Please Override me.");
    
    }
    
    void showStats(){
    
        System.out.println("name : " + name);
        System.out.println("HP : " + hp);
    
    }
}
