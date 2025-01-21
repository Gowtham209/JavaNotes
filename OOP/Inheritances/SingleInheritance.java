
class Parent
  {
       Parent()
           {
           }
   
       public void Greet()
       {
           System.out.println("Helo I am Parent Class");
       }
  } 
  
  class Child extends Parent
  {
           Child()
           {
           }
  }
 
 public class SingleInheritance
  {
    public static void main(String[] args) {
        Child obj = new Child();
        obj.Greet();   
    }
  }
/*Single Inheritance:
 * 
 *  In Single Inheritance There is Only ONE PARENT class and Only ONE CHILD class
 * 
 *  With Child object we are able to Access the Parent class Greet() method without need to RE-TYPE Greet() method
 * in Child Like this we have Eliminated Code Re-Type and thus we resued
 */
