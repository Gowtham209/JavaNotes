

/*
 * This Keyword
 * this keyword is used to refer constructors of same class
 * this keyword is used to refer Variables and Methods of same class
 * this keyword should not be specified inside STATIC Methods
 */
class A{
    int a;
    int b;
    String n;
    A(int a,String n)
    {
        this.a=a;
        this.n=n;
    }
    void set(int b)
    {
        this.b=b;
        this.print();//print();
    }
    void print()
    {
        System.out.println("This is called using this keyword= "+this.a+" "+this.b+" "+this.n);
    }
}
public class This {
    public void main(String[] args) {
        A ob = new A(12,"Buddy");
        ob.set(89);

    }
}
