/*
 STATIC Keyword
 * Static Keyword Variables and Methods means they are CLASS Level Variables and Methods 
 * Static Variables and Methods can be Accessed with Class Name itself without Object
 * Non-Static Variables and Methods are belongs to Object  
 IMPORTANT:
 Non-Static Methods: Can access both static and non-static members directly or using this or the class name.
 Static Methods: Can only access static members directly or using the class name. To access non-static members, an instance of the class is required.
 */
class A{
/* Below Method and Variable are CLASS Level things any Changes will Have Same 
Affect on ALL other Objects
*/
    static int a=10;
    static void greet()
    {
        System.out.println("Welcome");
    }
/*
Below Method and Variable are OBJECT Level things any Changes will Have NO 
Affect on ALL other Objects
 */    
    int b=100;
    void print()
    {
        System.out.println("Bye");
    }
}
class Static
{
    public static void main(String[] args) {
        A o =new A();
        System.out.println(o.b);
    }
}
