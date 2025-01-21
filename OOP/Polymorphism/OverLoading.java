/*
Method OverLoading 
* Method OverLoading means methods which are created with same method NAME but 
with different SIGNATURE(Parameters)
* SIGNATURE does not Include Return type and Access modifiers
* This means the new Methods should always be unique with different Parameters
*/
class A{
    public int add(int a,int b)
    {
        return a+b;
    }
    public void add(int a,int b,float c)
    {
        System.out.println(a+b+c);
    }
}
public class OverLoading {
    public static void main(String[] args) {
        A ob = new A();
        System.out.println(ob.add(91,28));
        ob.add(12,34,6.0f);
        System.out.println("Bye");
    }
}
