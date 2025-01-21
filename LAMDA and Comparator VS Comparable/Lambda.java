/*
 * Lambda Expression
 * Lambda Expression will work only with @FunctionalInterface  
 * Lambda Symbol is "->" 
 * Lambda Expression reduce the typing of Anonymous Method Declaration
 * In Lambda Expression no need to declare Data Type to call a Method it is similar 
 to normal Parameterised Method call but instead of value Variable is Declared
 * If Method has only one Parameter then the Lambda Expression can be typed as
     Sample: A ob = i -> System.out.print("This is a Single Value "+i); 
 * If Lambda Expression Method going return a Value then no need to specify "return"
 keyword ONLY if the Method going to return the value else if the Method more than Single line code we 
 need to use {} and along with "return"
     Sample: A ob = (i,j) -> i+j;
     A ob = (x,y)->{
     String a1=x+y;
     String a2=y+x;
     return a1.compareTo(a2);
     }
 */

 //  WithOut Argument
@FunctionalInterface 
interface B {
    String currentYear="2024";
    public void greet();
    // Then we need to Frame the Lambda as
    // B obj = ()-> {}   => {} optional if the Method going to have More than One Line
}  
// With Argument
@FunctionalInterface
interface A
   {
int add(int i, int j);
   }


public class Lambda
{

    static int year=2002;
    public static void main(String[] args) {
        // Single Line Lambda Method
        A obj = (int i,int j)->i*j; // ==> we Just created Custom LAMBDA Method not have been Called
//                  or
//      A obj = (i,j) -> i*j;  

        System.out.println("{}"+obj.add(3, 7));
        // Multi Line Lambda Method
        A ob = (i,j) -> {
            System.out.println("This is a addition");
            return i+j;
        };
        System.out.println(ob.add(9,10));


                // Variable Capture
//          TYPE -1 => Final variable
        final String msg = "Bonjo";
        B object = ()->System.out.println(msg+" Hi guys ");
        object.greet();

//          TYPE -2 => Global Static variable
        B object2 = ()->System.out.println("I was Born on "+year);
        object2.greet();

//          TYPE -3 => Global Object variable
            Lambda lbd = new Lambda();
            lbd.type_3();        
    }
    // Global Object Variable
    String carThatILove="Porsche 911 Turbo S";
    public void type_3()
    {
        B object = ()-> System.out.println("My Dream Car is "+carThatILove);
        object.greet();
    }

}