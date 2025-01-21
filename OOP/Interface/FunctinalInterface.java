/*
 * FunctinalInterface
 * FunctinalInterface Must have Only ONE Abstract Method BUT it can also have any Any
Number of Static and Default Methods along with One Abstract Method 
 * FunctinalInterface can have many Global Variables
 * 
 * NOTE:
 *    By creating the Lambda OBJECT for that One Abstract method we can Access All the "default" methods of the Interface too 
 */
@FunctionalInterface
interface A
{
    int n=10;
   void add(int a, int b);
   static void p()
   {
    System.out.println("!!!!!");
   }
   static void g()
   {
    System.out.println("@@@@@");
   }
   default void show()
   {
    System.out.println("This is a Exceptional Method");
   }
   default void greet()
   {
    System.out.println("Does it Work");
   }
}
class FunctinalInterface
{
  public static void main(String[] args)
  {
   A ob =(i,j) ->
   
   {
    {
       System.out.println("This Method used to Add "+i+" and "+j+" "+(i+j));
    };
    };  
   A.g();
   ob.add(67,234); 
   ob.show();
   System.out.println(A.n);
   ob.greet();
   A.p();
  }
}