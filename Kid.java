/**
 *
 * @author Miguel Capule
 */
package Fundamentals;

public class Kid extends Toddler{
    
    int gradeLevel;
    
    public Kid(String name, String sex, int age) {
        super(name, sex, age);
        this.gradeLevel = gradeLevel;
    }
    
    void sayGradeLevel() {
    
        System.out.println("I'am Grade " + gradeLevel);
    
    }
    
}
    

