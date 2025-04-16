import java.util.*;
/*   DataTypes in Java

IMPORTANTS:

Bits -> MOST Basic Unit 0 or 1

Byte -> 8 Bits Add Up Into SINGLE Byte [SIMPLE Arranging 8 Individula Bits Together]
            Example: Decaimal 1 =>   0  0  0  0    0 0 0  1
                                    128 64 32 16   8 4 2  1  

NOTE: JAVA Has FIXED Size which is 32 bits as Standared 

1 Primitive 
    Primitive are Non Object Data types like int , float , double  long , char , byte and short 
Primitive Data Types are "FIXED Data Size" memory Allocation.
#    Primitive Data Type Store ACTUAL Value

    byte  => 1 Byte[8 bits] & Range -2^7 to 2^7-1
    short => 2 Byte[16 bits] & Range -2^15 to 2^15-1
    char  => 2 Byte[16 bits] & Range 0 to 2^16-1 ***** Range is Different from Others
    float => 4 Byte[32 bits] & Range 3.4e−038 to 3.4e+038   Format: 1 bit for sign, 8 bits for exponent, 23 bits for mantissa
    int   => 4 Byte[32 bits]  & Range -2^31 to 2^31-1
    long  => 8 Byte[64 bits] & Range -2^63 to 2^63-1
    double => 8 Byte[64 bits] & Range 1.7e−308 to 1.7e+308

ADVANTAGES of Primitive Data Type:
Autoboxing/Unboxing:
    Java automatically converts between primitives and their wrapper classes
    Example: Integer i = 42; (autoboxing), int j = i; (unboxing)
Memory Efficiency:
    Primitives are more memory-efficient than their wrapper classes
    Primitives are stored directly on the stack when declared as local variables
Performance:
    Operations on primitives are generally faster than on wrapper objects
    No overhead of method calls or object creation

2 Non Primitive
    Unlike primitive data types, non-primitive data types in Java don't have fixed memory sizes defined by the language specification.
Instead, they are objects that contain references to memory locations

#   Ususal Objects ,StringBuilder and  Wrapper Classes are Non Primitive DataType Even the Collections all are Non Primitive Data Type 
Since in the End we are Using By creating Object to Each Collection Data Structure
#    Non Primitive Data Type Store Reference[Memory Address] of Object

NOTE: Except Long and Double which Concumes 24 Byte All Others are 16 Byte Unlike Primitive Data type


Mutable vs Immutable Both Primitive & Non Primitive

All the Primitive Data Types are Mutable. Values can been Manipulated But No New variables are created

Where Non Primitive Expecet String , Wrapper classes Are Immutable [Value can be Changed but for Each change a New Reference is been created WASTES Resources]
Where as Other Non Primitive Data Types are Mutable and No new Reference are Created


StringBuilder: A mutable sequence of characters with no synchronization, meaning it's faster for single-threaded operations.
StringBuffer: Similar to StringBuilder but thread-safe due to synchronization, making it suitable for multithreaded applications.
StringJoiner: This is used to construct a sequence of characters separated by a delimiter and optionally starting with a supplied prefix and ending with a supplied suffix.
Example:
StringJoiner sj = new StringJoiner(", ", "[", "]"); 
sj.add("Java").add("Python").add("C++");
System.out.println(sj); // Output: [Java, Python, C++]

*/

public class DataType
{
    public static void main(String args[])
    {

    }
}


/*
 * CUSTOM Annotation
 * JAVA 8 features
 * Java Memory Managment & Garbage Collection
 * 
 */