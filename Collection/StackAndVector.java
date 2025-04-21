import java.util.*;

/*
        Stack & Vector

        Stack is a subclass of Vector, meaning it inherits all the properties and methods of Vector.
        Stack and Vector in Java are thread-safe because they use "Synchronized methods" to ensure safe access in a multi-threaded environment.
        Vector is a Part of LIST Interface so Stack also Part of LIST Interface

        Methods:
        Vector:
            Provides standard methods for adding, removing, and accessing elements, similar to ArrayList.
            Methods include add(), remove(), get(), size(), etc.
        SubClasses:
            Stack
                
        Stack:
            Inherits all methods from Vector and adds stack-specific methods:
            push(E item): Adds an item to the top of the stack.
            pop(): Removes and returns the item at the top of the stack.
            peek(): Returns the item at the top of the stack without removing it.
            empty(): Checks if the stack is empty.
            search(Object o): Returns the 1-based position of an object on the stack.

        NOTE:
        While both classes are synchronized and part of the legacy collection classes, modern Java applications often 
prefer ArrayList for dynamic arrays and Deque (such as ArrayDeque) for stack operations due to their better performance in single-threaded contexts.

 */
public class StackAndVector {
    public static void main(String[] args) {

        // SAMPLE how Stack is Been used in Browser Tab to Store Hostory How User have Navigated into a WebPage
        Stack<String> stackObj = new Stack<>();
        stackObj.push("login");
        stackObj.push("homePage");
        stackObj.push("Profile");
        stackObj.push("Edit");
        stackObj.push("save");
        
        System.out.println("Stack:"+stackObj); // Output: Stack:[login, homePage, Profile, Edit, save]
        
        // OTHER Methods

        System.out.println("Stack PEEK:"+stackObj.peek());

        System.out.println("Stack Capacity:"+stackObj.capacity()); // Initial capacity (usually 10 in Vector)

        System.out.println("Stack Size:"+stackObj.size()); // Return Count of Actual Values inside the STACK

        System.out.println("Stack Contains:"+stackObj.contains("homePage"));

        stackObj.trimToSize(); // VOID Method
        // USED to REDUCE the Actual Stack Capacity 10 to Current Stack SIZE [BASICALLY Eliminating the Unused Spaces]

        /* IMPORTANT */

        String[] arr = stackObj.toArray(new String[0]); 
        for(String x:arr)
        {
            System.out.println(x);
        }

        /*
            NOTE: 
            Array(T[] a) only works with array types like String[],int[],etc... , NOT collections like LinkedList<>.
         */

        /*

          stackObj.addAll(newStackObj);
          stackObj.get(0);
          stackObj.clear();
          stackObj.clone();
          stackObj.reversed();
          stackObj.search("save"); Return Index

         */

        System.err.println("Back Tracking");

    
        while(!stackObj.isEmpty())
        {
            System.out.println(stackObj.pop());
        }
        /*
          NOTE: If ForEach is Used Then Stack Print the ORDER which we Have PUSHED
           for(String x:stackObj)
            {
                System.out.println(x);
            }
            OUTPUT:   [login, homePage, Profile, Edit, save] 
         */

        Vector<String> vectorObj= new Vector<>();
        vectorObj.add("Guna");
        vectorObj.add("Shanu");
        vectorObj.add("Ram");
        System.out.println("Vector ForEach Out:");
        for(String x:vectorObj)
        {
            System.out.println(x);
        }
        // ALL THE STACK METHODS WORKS SAME WITH "VECTOR" because VECTOR is the PARENT to STACK itself

    }
}
