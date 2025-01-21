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

public class Demo extends Z{
public static void main(String[] args) {
    
    B obj = new B();
    Interface.hai();
    obj.greet();

}
}