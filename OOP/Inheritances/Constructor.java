/*
 * Constructor:
 *  Constructor are Nothing But a Methods[Special one] With NO Return Type and This Methods is Named as SAME as Class Name itself
 *  Constructor can be Declared [OverLoading]Multiple Times with Different Parameters
 *  Constructor are used to Initialize certain fields[Global Fields] the state of an object, meaning they set the values of the instance variables (fields).
 *
 * Note:
 *  When a OBJECT is created the First Method that Gets Triggered is Constructor only to Initialize the fields of that OBJECT[a.k.a INSTANCE]

IMPORTANT:
         If a Constructor has "private" as a Modifier then that Constructor Object CAN'T be Created to that Specific Constructor Arguments
 
 */


 public class Constructor
 {
    int a;
    Constructor()
    {

    }

    Constructor(int a)
    {
        this.a=a;
    }

    public void Greet()
    {
        System.out.println("Hi Welcome to Constructor class");
    }
 }
