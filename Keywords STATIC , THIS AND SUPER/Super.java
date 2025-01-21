/*Super keyword
 *Super keyword is used to refere Parent class Variables and Methods from Child class.
 * Super keyword is used to refer Parent class CONSTRUCTOR only from 
 Child class CONSTRUCTOR should have only ONE Super call within Child CONSTRUCTOR(in 1st Line).
 * Super keyword cannot able to ACCESS Private Methods and Variables
 * Super Keyword cannot be used inside STATIC Methods
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
        super(a,b);
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
