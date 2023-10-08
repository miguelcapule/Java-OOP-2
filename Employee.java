/**
 *
 * @author Miguel Capule
 */
package Fundamentals;



public class Employee {
    
    private String firstname,lastname;
    private String title, address, sex;
    
    private int age;
    
    Employee(){
    
        this.firstname = firstname;
        this.lastname = lastname;
        this.title = title;
        address = "N/A";
        sex = "N/A";
        age = 0;
    
    }
    
    Employee(String firstname, String lastname, String title){
    
        firstname = "N/A";
        lastname = "N/A";
        title = "N/A";
        address = "N/A";
        sex = "N/A";
        age = 0;
    
    }
    
    Employee(String firstname, 
            String lastname, 
            String title, 
            String address, 
            String sex, 
            int age)
        
    {
        this.firstname = firstname;
        this.lastname = lastname;
        this.title = title;
        this.address = address;
        this.sex = sex;
        this.age = age;
    }
    
}
