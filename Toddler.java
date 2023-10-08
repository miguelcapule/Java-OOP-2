/**
 *
 * @author Miguel Capule
 */
package Fundamentals;

public class Toddler extends Person{
    
    String favoriteGame;
    
    Toddler(String name, String sex, int age){
    
        super();
        this.favoriteGame = favoriteGame;
    
    }
   
    void drink(){
    
        System.out.println(name + " is Drinking Milk");
    
    }
    
    
    
    void checkStatus() {
        
        System.out.println("Favorite Game : " + favoriteGame); 
        super.checkStatus();

    }
    
}
    
