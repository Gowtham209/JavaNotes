import java.util.*;
/* Comparable VS Comparator
 * These two are Used for "Sorting Purpose only" and Both of FunctionalInterface
 
 * Comparable
 NOTE:
 interface Comparable
 {
    public int compareTo(T that)
    {
        return this.num==that.num;                      
    }
 }
 * Comparable -> compareTo(T thatObject)
 *  Implemented by the UserClass that we might "Sort" with Collections !!! without Sending a Comparator lambda method along with list
 *  Single Type Sorting that to Implemented by the UserClass  
*/


/* Comparator
NOTE:
interface Comparator
    { 
        public int compare(T a,T b);    =>(Abstract Method)
    }
      
*  Since Comparator is FunctionalInterface we can use it like LAMBDA function  
*  Comparator is a Interface (FunctionalInterface) which means a Interface with Only one Abstract Method
but it can have Multiple Default(Access Specifier) defined Methods and Static Methods
*  The Abstract Method is compare() => with GENERIC Two Argumented Method with Int return type
*  This Comparator's compare method can be CUSTOM Lambda method Unlike we use DEFAULT compare method that the implemented
WRAPPER Class like Interger,Character,Double,.. 
 *  Multiple Kind of way to sort a Same Class's Object
example: Laptop Class with Price,Name
you want to sort someTimes with Laptop's Name in another Time with Laptop's Price in these situation
you can't use Comparable interface because Comparable for Single Type
 *  
 */

 class Person implements Comparable<Person>
 {
    public String name;
    public int age;

    // Constructor
    public Person(String name, int age) {
        this.name = name;
        this.age = age;
    }
    @Override
    public int compareTo(Person that)
    {
        // With our OWN compareTo we takes the help of String(Wrapper) compareTo also THIS is Because STRING ONLY has compareTo() Method

        return this.name.compareTo(that.name);
    }
}
public class Main {

    public static void main(String[] args) {

       
        // Integer
         int ai[]={2,4,67,89};
         List<Integer> arr1 = new LinkedList<>();
         for(int x:ai)
        	arr1.add(x);

        //Using Integer(Wrapper) compare(Lambda function of COMPARATOR) method 
//          Collections.sort(arr,(x,y)->Integer.compare(y,x));

        //Using Comparator Interface's compare function
         Collections.sort(arr1,(x,y) ->x-y);
         for(int x:arr1)
          System.out.print(x+" ");
    	
    	//Double
   	   double ad[]={2.22,4.34,67.78,89.99};
       List<Double> arr2 = new LinkedList<>();
       for(double x:ad)
       arr2.add(x);
       //Using Double(Wrapper class) Comparator's compare method 
       Collections.sort(arr2,(x,y)->Double.compare(y,x));
       for(Double p:arr2)
       System.out.print(p+" ");


    	// String
        String as[]={"alex","euban","dumar","balu","casmin"};
        List<String> arr3 = new LinkedList<>();
        for(String x:as)
        arr3.add(x);
        //Using Comparator along with String(Wrapper Class) "Comparable Interface's" compareTo() method
        Collections.sort(arr3,(x,y)->y.compareTo(x));
        for(String p:arr3)
        System.out.print(p+" ");


    	

    	
    	//UserDefined Data Type
   	List<Person> arr4=Arrays.asList(
               new Person("Alice", 30),
               new Person("Aabe", 30),
               new Person("Bob", 25),
               new Person("Charlie", 25),
               new Person("David", 35)
       );
//      Sort By Age
        // This will Work Beacuse we Implemented "Comparable Interface" to Person class
        Collections.sort(arr4);
        // Using Comparator's compare method
    	//Collections.sort(arr4,(a,b)->b.age-a.age);

    	// Using CUSTOM Defined compare method of Comparator interface
   	Collections.sort(arr4,(a,b)->{
   		return a.age==b.age?a.name.compareTo(b.name):b.age-a.age;
   		});
   	
   	for(Person x:arr4)
   	{
   		System.err.println(x.age+",Name:"+x.name);
   	}
    }
}