/*
 * Abstract 
 * Abstarct class is "Little Similar" to Normal Class because it can Also have Constructor,Methods,Fields,Inheritance
 * Abstract class a have static methods , Non-Static Methods 
 * Abstract class can have only DEFINITION of a Method without Body when Defining abstract Keyword before Method
 * For Abstract class OBJECT Cannot be Create Directly
 * Abstract methods are by default "Public"
 * Abstract class can have CONSTRUCTOR but can ONLY be ACCESSED by Indirectly from CONCREATE class
 * Static keyword CANNOT be used Infront of Abstract method Because "abstarct" itslef is to "OVERRIDE" but Static Methods are Belong to Class itself so Polymorphism's "Override" concept doesn't work 
 * If a Child class does not provide body for the Abstract Methods of Parent Abstract class then the Child class Which EXTENDS becomes Abstract Child class
 * An Child Abstract class can or cannot give Definition of abstract methods of it's Parent Abstract class
 * Concreate Class which extends Abstract class Must Define all abstract methods of Parent Abstract class
 * Inheritance is SAME as normal Class
 */
abstract class A{
    int n;
    A() 
    {
     this.n=10;
    }
    abstract void show();
    abstract int add(int a,int b);
    protected static void greet()
    {
        System.out.println("Hello");
    }
}
class B extends A{

    @Override
    void show() {
        System.out.println("From class B");
               }

    @Override
    int add(int a,int b){
        return a+b;
             }
    
}
public abstract class Abstract {
    public static void main(String[] args) {
        B o = new B();
        System.out.println(o.n);
        o.show();
        System.out.println(o.add(99,8));
        A.greet();
    }
}
