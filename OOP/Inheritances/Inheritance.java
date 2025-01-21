/*
 * Inheritance
 * 
 *  Inheritance is a Concept that used to Resue the code and Eliminate the Redudant codes from Another class
 * With inheritance we can able to Reuse the Code of the PARENT class[a.k.a Main class] from CHILD class[a.k.a Sub Class] 
 * 
 * The Child Class can access all its OWN fields and methods of it class But Can also Access its Parent class
 * Fields and Methods
 * 
 * Parent Class ONLY know its OWN fields and methods but does not KNOW about its Child
 * 
 * Note:
 *      The Child Class can Still have its OWN Methods and Fields Appart from its Inherited Methods and Fields
 * 
 * Types of Inheritance:
 * Single Inheritance
 * Multi-Level Inheritance
 * Hierarchical Inheritance
 * Multiple Inheritance
 * Hybrid Inheritance
 * 
 * Multiple Inheritance:
 *  Java Does not Support Multiple Inheritance "Directly" because to reduce the Complexity and  Simplify the Language
 * But Simple Example:
 *          Class A        Class B
 *              |             |
 *              ---------------
 *                      | 
 *              Class C inherits A,B
 * 
 * Here Class C Inherits from both of its Parent A,B which is Possible in Python
 * Multiple Inheritance can be ACHIEVED by using Interface and Class together Instead of TWO Parent Classes , ONE Class & ONE Interface 
 * We can Achieve this 
 *  Class C extends A implements B
 * 
 * Hybrid Inheritance:
 * 
 *  Java Does not Support Hybrid Inheritance "Directly"
 * Hybrid inheritance is a combination of two or more types of inheritance, such as combining single, multilevel, and hierarchical inheritance.
 * 
 * Simple Example
 * 
 *          Class A                  Class B
 *              |                       |
 *              |                       |
 *        Class C inherit A        Class D inherit B
 *              |                       |
 *               ------------------------
 *                             |
 *                    Class E inherit C and D
 * 
 * Here we can see There are Multiple types of inheritance used to Form a Hybrid Inheritance like Single,
 *  Multi-Level & Multiple 
 * Hybrid Inheritance can be ACHIEVED by using Interface and Class together Instead of ONLY Classes
 */


class A{

    void print()
    {
        System.out.println("It's A class");
    }
 
    int add(int n,int m)
    {
        return n+m;
    }
}
class B extends A{

    void print()
    {
        System.out.println("It's B class");
    }
    int sub(int n,int m)
    {
        return n-m;
    }
}
class C extends B{
    @Override
    void print()
    {
        System.out.println("It's C class");
    }
    int mul(int n,int m)
    {
        return m*n;
    }
}
public class Inheritance
{
    public static void main(String[] args) {
     C ob = new C();
     System.out.println(ob.add(4,6));   
    }
}