/*Overriding
 *Overriding Happen only After the Inheritance 
 *Overriding helps Create new Method Functionallity but with Same Method Name
 *STATIC Methods cannot be Overriden. Because STATIC METHODs are CLASS OWN Methods
Which means They are Common to ALL the OBJECTs of That Class so a SINGLE change to a Static Method Affects the ALL the Object's Method too
Binding Time: Overriding relies on dynamic binding (late binding), which happens at runtime. Since static methods are bound at compile time (early binding),
they cannot participate in the overriding mechanism that depends on runtime information. 
 *Overriding means implementing SAME method as Super class but
  it can or cannot have New CHANGES inside the body of the Method 
 *Overriding Methods "MUST" have Same Return type
 *Private Methods from Parent class Cannot be Overriden
 *@Override Annotation helps to check whether the Method is Overriden or Not
 */
class A{
    int p()
    {
        System.out.println("From A");
        return 0;
    }
}
class B extends A{
    @Override
     int p()
    {
        System.out.println("From B");
        return 0.0;
    }

    public int greet() {
        this.p();
        return 69;
    }

    public void show() {
    }
}
public class OverRiding {
    public static void main(String[] args) {
        B o = new B();
        System.out.println(o.greet());
    }
}
