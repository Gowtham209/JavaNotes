import java.util.*;
//oops
/*
 * Inheritance
 */
class Aq
{
    public static int n=10;
    int k=19;
    public static void p()
    {
      System.out.println(n);
    }
    public void show()
    {
        System.out.println("From Aq");
    }
}
/*
 * Polymorphism
 */
class Bq extends Aq
{
    @Override
    public void show()
    {
        System.out.println("From Bq");
    }
    //overload
    public void show(int n)
    {
        System.out.println("From Aq "+n);
    }
}
/*
 * Abstract
 */
abstract class Cq{
    int o=13;
    private String g;
    static int lp=0;
    Cq(String g)
    {
        this.g=g;
    }
    void greet()
    {
        System.out.println("Welcome");
    }
    abstract void wel();
}
abstract class Dq extends Cq{
        private int n=0;
        Dq(String g,int n)
        {
            super(g);
            this.n=n;
        }
}
class eq extends Cq{

    eq(String g) {
        super(g);
    }

    @Override
    void wel() {
        System.out.println("Welcome");
    }
}
/*
 * Encapsulation
 */
class Fq{
    private int n;
    private String name;
    public void set(String name,int n)
    {
        this.name=name;
        this.n=n;
    }
    public String get()
    {
        String g=name+","+n;
        return g;
    }
}
/*
* Interface 
*/ 
interface Intn{
    int N=10;
    void add(int n, int m);
}
interface Jp extends Intn{

}
class Gq implements Intn{
    public void add(int n,int m)
    {
        System.out.println("From Gq "+(n+m));
    }
}
class Test{
    public static void main(String[] args) 
    {
        Fq ob1= new Fq();
        ob1.set("Boy",29);
        System.out.println(ob1.get());
           Scanner sc = new Scanner(System.in);
           Aq ob = new Bq();
    }
}