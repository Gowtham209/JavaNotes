import java.util.*;
/*
 * 
 * TypeCasting
    UpCasting [Defaultly Works Fine]
    DownCasting [Running Time Error Can Happen If Not Casted Properly]

UpCasting:
    Upcasting is the process of converting a subclass type to a superclass type. It is done implicitly in Java.
    
    Fields and Methods Access: 
        When upcasting, you can only access the fields and methods that are defined in the superclass. 
Any subclass-specific ONLY Methods are accessible unless overridden.FIELDS with SAME variable as Super won't be Accessible   
    Advantages:
        Simplifies code by allowing you to treat objects of different subclasses uniformly.
        Reduces coupling between classes.
    Disadvantages:
        Limits access to subclass-specific features.
        May require downcasting later to access subclass-specific methods.

DownCasting:
    Downcasting is the process of converting a superclass type to a subclass type. 
It requires explicit casting and can lead to runtime exceptions if not done correctly.
    
        Fields and Methods Access: 
        After downcasting, you can access both superclass and subclass-specific fields and methods.
    Advantages:
        Allows access to subclass-specific features.
    Disadvantages:
        Risk of ClassCastException if the object is not actually an instance of the subclass.
        Increases coupling between classes.
 * 
 */


public class TypeCasting {

    public static void main(String[] args) {
        
        // Normal Usage
        Animal anm = new Animal();
        System.out.println("::::ANIMAL::::");
        System.out.println("Below Works as a Normal Object call of its Own Fields and Methods");
        System.out.println("Name:"+anm.name);
        System.out.print("makeSound():");
        anm.makeSound();

         // Normal Usage
         Dog dog = new Dog();
         System.out.println("::::DOG::::");
         System.out.println("Below Works as a Normal Object call of its Own Fields and Methods");
         System.out.println("Name:"+dog);
         System.out.print("makeSound():");
         dog.makeSound();


         // UpCasting
        Animal upCast = new Dog();
        System.out.println( "::::UPCAST::::");
        System.out.println("Below Works as a Upcasted Object call of its Own Fields and Methods");
        System.out.println("Name:"+upCast.name);
        /*  FIELDS of PARENT only be Displayed */
        System.out.print("makeSound():");
        upCast.makeSound();

        // DownCasting
        Dog downCast = (Dog)upCast; // Explicit Casting
        System.out.println("::::DOWNCAST::::");
        System.out.println("Below Works as a Downcasted Object call of its Own Fields and Methods");    
        System.out.println("Name:"+downCast.name);
        System.out.print("makeSound():");
        downCast.makeSound();
        /* ALL the Fields and Methods of the CHILD class are ACCESSIBLE along with Parent Class */
    }
    
}

class Animal
{
    public String name="Nothing";
    
    public void makeSound()
    {
        System.out.println("I am Animal So Now Sound ONLY my Child Class will Give You Sound");
    }
}

class Dog extends Animal{

    public String name="Puppy Boy";

    @Override
    public void makeSound()
    {
        System.out.println("Bark Bark");
    }

}