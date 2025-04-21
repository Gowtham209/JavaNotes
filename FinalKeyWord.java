import java.util.*;

/*
        Final Keyword:
            The final keyword in Java used enhancing security, preventing modifications, and enforcing specific constraints in programming.
            "final" Keyword are Been used Before 
                1 Varible 
                2 Method 
                3 Class 
                4 " Method PARAMETER " 


        1. Variable
                Based on Data Type[Primitive / NonPrimitive] the Variable Behave differently when it is declared as "final".
            Primitive: (Eg: int , float , double)
                Once a Value Assigned to Primitive[DataType] Variable VALUE Can't be Changed/Modified
            
            Non Primitive: (Eg: Integer , Long , CustomClass , Collection DataTypes)
                Once a Reference Assigned to NonPrimitive[DataType] Variable , ATTRIBUTE of that Variable can be Modified/Changed
            BUT the Reference Can't be Changed/Modified
            
            IMPORTANT:
                * String is Non-Primitive DataType But Still "final" will throw Error when Modified Because Remember when String variable is Modified JAVA will Give New Reference Each Time
                ##### If we use String BuildIn functions to manipulate "final" Variable's Value ,JAVA won't Throw ERROR at the SAMETIME the Change/Modification won't be REFLECT in the End
                
                * StringBuilder & StringBuffer Behaves Same as a NonPrimitive so Modification Doesn't Create new Reference.
            

        2. Method
            "final" keyword Specified Methods CAN'T be Overridden by SubClasses Basically we are Locking the SuperClass Method Implementation
  
        3. Class
             A class as final, the only restriction is that it cannot be extended (inherited). However, you can still:
                Create objects of the final class and use its methods.
                Calling its static methods and access static variables (modifiable unless they are also marked final).
                Use its instance methods and variables as usual.
            Instanciate it in other classes and work with its functionality.

        4. Method PARAMETER
            When a method parameter is declared final, its value cannot be changed inside THAT Method. This is useful when you want to pass a value to a method, but you don't want its value to be changed by the method.

            Example:

                public void Greet(final String msg)
                {
                    msg = "Hello"; // Error: Cannot assign a value to final variable 'msg'
                    System.out.println(msg); // Output: Hi
                }
                
        The most frequent usage of final is with constants—declaring variables that should never change. In professional Java development, defining constants inside a final class or interfaces is a common pattern.

        Note:
            By default all Variable are Final in Interface

*/
public class FinalKeyWord {
 
    public static void main(String[] args) {
        
    }
}
