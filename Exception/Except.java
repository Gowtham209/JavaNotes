/*
 !!!!Throwable class is the Main Parent for Exception & Error

Exception:
    Most of the Exception occurs at the Running time of the Code.
    Exception cause the Application to STOP
!!Exception are there because we can Run the Application even after the Exception so that the Application Doesn't STOP.
    Exceptions can be Recoverable
 Exception Types:
    1)Checked Exception
    2)UnChacke Exception

Checked Exception:
    This Exceptions are found in JDK Level itself which indeed means in Java Checked Exceptions are 
already defined whenever we use File related , SQL related , Class not found etc.. which Exception may Happen while 
working with these.So, Java ProActively Compules the Developer to use Try and Catch along with Checked Exception

UnChecked Exception:
    This Exceptions are happen while the Program runs which means these can be found by JVM. 
Examples RunTimeException's Child Exceptions like ArithMathicException,NullPointerException,InputMisMatchException etc...
These exceptions are CAN't be Found at Compile Time so Java doesn't suggest to Try and Catch
BUT Developer Should ProActively to use Try and Catch in cases of Some unknown Exception may Happen



Error:
    Errors that are "not meant to be caught by applications".They are usually thrown by the JVM (Java Virtual Machine) and are often related to system failures.
Examples: OutOfMemoryError, StackOverflowError, VirtualMachineError.

!!! Errors that are "not meant to be caught by applications" BECAUSE we can't Solve the Error through Coding because its a Server/Hardware related thing
    Errors are UnRecoverable by the Application
 * 
 */

import java.nio.file.FileAlreadyExistsException;
import java.util.*;

//Custom Exception
/*
   Custom Exceptions are Normal Class that extends Exception Class so that we use "thows" and "message" to print.
   Basically Exceptions are used to inform the Developer to identify distinct problems that occur 
within an application, making it easier to inform developers and to handle specific issues in a more controlled and readable manner.
    Exception helps to Debug
 */
class UserNotInTable extends Exception
{
    UserNotInTable(String e)
    {
        super(e);
    }
}


public class Except {

    public static void main(String[] args) {

//      !! Note:
/*
        When we declare a Variable within Try Block the Scope of that Variable is CAN'T be used in Catch / Finally BLOCK

*/        

        try{
//          This the Area where the Exception May Occur
            int exc=101;
            System.out.println("Before Except");
            // We are Simply Creating a Object to our Custom Exception Class along with a Message
            // "throw" keyword heps to create this Exception act same as Buildin Exceptions of the Java
            throw new UserNotInTable("Respective User Data is Not Found in the DataBase.So this Exception occurs");
        }
        catch(Exception e)
        {
//           This Block of Code ONLY when the Exception is Occured
            
            System.out.println(e);
            System.out.println("exc:"+exc); //=> exc is not Visible
        }
        finally
        {
//           This Block of Code Run Even No Exception is Occured
        }
    }

    // Throws :
    /*
     The throws keyword in Java is used in method declarations to specify that a method can 
throw one or more exceptions. This informs the caller of the method that it needs to handle 
these exceptions, either with a try-catch block or by declaring the exceptions using the throws keyword
in its own method signature.
    If a Method use Throws then its Direct Caller Method Must Handle the Exception
     */
    public void sqlDataCollect() throws FileAlreadyExistsException 
    {

    }
    
}