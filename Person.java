/**
 *
 * @author Miguel Capule
 */
package Fundamentals;

public class Person {
    
    String name, sex;
    int age;
    
    
    void checkStatus(){
    
        System.out.println("Name : " + name);
        System.out.println("Sex  : " + sex);
        System.out.println("Age  : " + age);
    
    }

    void drink() {
        throw new UnsupportedOperationException("Not supported yet."); // Generated from nbfs://nbhost/SystemFileSystem/Templates/Classes/Code/GeneratedMethodBody
    }
        
}
