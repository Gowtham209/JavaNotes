/*
* Generic
* Generic are used to avoid Code Redundancy which to Write a SINGLE Class,Interface or Method that Accepts Various
Wrapper Data Types like Integer,Double,Float,String etc... and Even Custom_Class
(Important NOTE) Generic works ONLY with Non-Primitive Data type
* Generic provide Data Type SAFETY
* Generic can also used to Restrict certain Data type to Access Specified Data type (BOUNDED)
* "extends" keyword used to inherit certain Data type classes and even Interfaces
* Syntax for extends more than ONE class as well as Interface
Class_Name <T extends Number & Comparable & Sample_CLass> 
 */
//Generic Class (Unbounded)
/*
 * NOTE::::
 '''Type inference''' in Java helps to reduce boilerplate code by allowing the omission of explicit type 
 declarations in certain situations. It improves code readability and reduces the verbosity of code 
 while maintaining strong static type checking at compile-time.
 */
import java.net.SocketPermission;

class CustomClass <T>
{
    T x;
    public void set(T x)
    {
        this.x=x;
    }
    public T get()
    {
        return x;
    }
}
//Generic Class(Bounded)
class Bounded <T extends Number & Comparable >
{
    T x;
    public void set(T x)
    {
        this.x=x;
    }
    public T get()
    {
        return x;
    }
}
//Generic with Interface
interface Int<T>
{
    public void set(T n);
    public T get();  
}
class B <T>implements Int <T>{

    T n;
    @Override
    public void set(T n) {
        this.n=(T)n;
    }

    @Override
    public T get() {
        return n;
    } 
}
class Generic<T>{
    //Generic Method (Unbounded)
    public <T> void print(T a)
    {
        System.out.println(a+" in GENERIC Method");
    }
    //Generic Method (bounded)
    public <T extends Number> void pp(T a)
    {
        System.out.println(a+" in GENERIC Method");
    }
    public static void main(String[] args) {
        /**********************************/
        CustomClass list1 = new CustomClass();
        CustomClass list2 = new CustomClass();
        CustomClass list3 = new CustomClass();
        CustomClass list4 = new CustomClass();
        CustomClass list5 = new CustomClass();
        list1.set(1);
        list2.set(true);
        list3.set(99.999);
        list4.set("Word");
        list5.set('c');
        /* */
        System.out.println(list1.get()+" "+list2.get()+" "+list3.get()+" "+list4.get()+" "+list5.get());
        /* */
        CustomClass arr[]=new CustomClass[5];
        arr[0]=list1;
        arr[1]=list2;
        arr[2]=list3;
        arr[3]=list4;
        arr[4]=list5;
        for(CustomClass x: arr)
        {
         // System.out.println(x.get());
        }
        B oj = new B();
        oj.set("Truck*");
        //System.out.println(oj.get());
        Generic ob=new Generic();
        ob.print(1);
        ob.print(19.09);
        ob.print('c');
        ob.print("Hai");
    }
}
