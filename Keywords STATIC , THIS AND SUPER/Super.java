/*Super keyword
 *Super keyword is used to refer Parent class Variables and Methods from Child class.
 *Super keyword is used to refer Parent class CONSTRUCTOR only from 
 Child class CONSTRUCTOR should have only ONE Super call within Child CONSTRUCTOR(in 1st Line).
 * Super keyword cannot able to ACCESS Private Methods and Variables
 * Super Keyword cannot be used inside STATIC Methods
 IMPORTANT:
 Super keyword in Java is specifically used to refer to the fields and methods of the parent (superclass) class, not the current child (subclass) class.
Even if the Child Class Override the Methods of Parent Still Calls the Parent Methods and Fields
 */
class Parent{
    static public int a;
    private int b;
    public String n;
    Parent(int a,int b)
    {
        this.a=a;
        this.b=b;
    }
    Parent(String n)
    {
        this.n=n;
    }
    void p()
    {
        System.out.println("This is from Parent class");
    }
}
class Child extends Parent{
    Child(int a,int b,String n)
    {
        super(a,b); /*ONLY one Super Per Constructor is ALLOWED*/
        super(n);
        show();
    }
  public void show()
    {
        System.out.println(super.a+" "+super.n);
        super.a=10;
    }
}
public class Super {
    public static void main(String[] args) {
        Child bu=new Child(10, 89, "Vadakan");
        bu.show();
    }
}
