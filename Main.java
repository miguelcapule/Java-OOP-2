/**
 *
 * @author Miguel Capule
 */
package Fundamentals;

import java.util.Scanner;

public class Main {


    public static void main(String[] args) {
        
        Employee e = new Employee("Miguel", "Capule", "Software Engineer", "Pluto", "Male", 22);
        Employee e1 = new Employee("Kobe", "Bryant", "Proffesional Basketball player");
        Employee e2 = new Employee();
        
        System.out.println("e2.firstname");
        
        Person p = new Person();
        Toddler t = new Toddler("Migs", "Male", 22);
        Kid k = new Kid("Migs", "Male", 22);
        
        p.name = "Fajardovic";
        p.sex = "Male";
        p.age = 50;
        
        t.name = "Kai Satoru";
        t.sex = "Male";
        t.age = 99;
        
        p.checkStatus();
        t.checkStatus();
        
        p.drink();
        t.drink();
        
        Dog d = new Dog();
        Cat c = new Cat();
        
        d.makeSound();
        c.makeSound();
        
        Animal a = new Dog();
        Animal b = new Cat();
        
        a.makeSound();
        b.makeSound();
        
        Enemy we = new WeakEnemy();
        Enemy se = new StrongEnemy();
        
        we.dialog();
        se.dialog();
        
        we.showStats();
        se.showStats();
        
    }
    
}
