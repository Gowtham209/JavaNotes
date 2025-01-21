/*
 INTERFACE
 * Interface is Similar to Abstract class where an OBJECT can be indrectly Created 
 EXAMPLE :
 Interface_variable list = new Class_Variable();
This Class_Variable() implements Interface_variable
 * 3 TYPES of Interfaces
 i)   Normal which have more than one Method Definition in a Interface
 ii)  Functional which can have Only ONE Method definiton Because for Lambda functionallity
 iii) Marker which is a EMPTY Interface (This is used to Save and Resume Software)*
 * Interface is Similar to Abstract class like OBJECT cannot be Created
  for Abstract class and Interface directly 
 * After JAVA 8 Interface are Allowed to have Method Definition for "default" access specifier and "static" named Methods
 * Inside Interface STATIC Method BODY can be Defined
 * Interface's STATIC Method can't be accessed by the Class that Implements the Interface
 * But by Specifing "default" Method ACCESS Modifier Body can be Defined Inside Interface 
 * Interface Cannot Have CONSTRUCTOR 
 * All the Methods inside Interface are "Public Abstract" by Default
 * Variables[Fields] inside Interface are "Static Final" by Default so Values Must Initialised 
 while creating an Variable
 * Interface can ONLY be Inherited from another Interface by using "extends" 
 keyword while Both Abstract class and Normal Class can inherite by using "implements"
 from Interface
* Abstract Class and Normal Class supports multiple "implements" of Interfaces
* Interface can "extends" multiple Interfaces
*/
interface Interface{
    void greet();
    static void p()
    {
        System.out.println("Hello Buddy, Static method can Have Body inside INTERFACE");
    }
    public static void hai()
    {
        System.out.println("Hai");
    }
}
interface I{
    void p();
}
interface A extends Interface,I{
   void show();
}
class B implements A,I
{
    @Override
    public void greet() {
    System.out.println("greet is From Interface which been inherited by B interface"); 
    }
    @Override
    public void p() {
        System.out.println("P is from I interface which been inherited by B interface");
   }
    @Override
    public void show() {
    System.out.println("Show from A interface");
    }
}
