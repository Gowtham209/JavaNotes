import java.util.ArrayList;
import java.util.LinkedList;
import java.util.List;
import java.util.concurrent.*;

/*
    List:
        List is the Root Interface to LinkedList, ArrayList , Vector , Stack & CopyOnWriteArrayList
        It allows duplicate elements and provides positional access and insertion of elements.
    SubClasses:
        ArrayList ,LinkedList , Vector , Stack , CopyOnWriteArrayList
    Key Methods: 
    add(), get(), set(), remove(), indexOf(), lastIndexOf(), subList()  


    ARRAYLIST:
        ArrayList Internally Uses Normal Array So Its Slow in Data Removable , adding new Value Because Each Change Cases To Copy a New Array and ReArrange
        ArrayList is Not Thread Safe SO Better Suits for Single Thread Applications
    Advantange:
        Since Sequence Storage Fetching a Value is MUCH Faster than LinkedList
    DisAdvantage:
        ReArranging of Array Happen for Each List Data Manipulation So It is SLOW
    Recommended Usage Scenarios:
        ✔ Best for: Frequently accessing elements using indexes (e.g., lookup-heavy operations). 
        ❌ Not ideal for: Frequent insertions or deletions in the middle, as shifting affects performance.

    Use Cases:
        Single-Threaded Applications: Ideal for applications where thread safety is not a concern and where frequent access and iteration are required.
        Read-Heavy Scenarios: Suitable for scenarios with more reads than writes, as random access is efficient.

    Alternative Approach:
        * If frequent insertions/deletions are required → Use LinkedList instead.
        * If thread-safety is needed → Consider CopyOnWriteArrayList.
    
    NOTE:
        capacity() , trimToSize() doesn't work with List even it is been Avaibale is List ONLY Suitable for VECTOR , Stack
    
*/

/*
LINKEDLIST:
    LinkedList implements List and Queue Interfaces
    Internal Structure:
        LinkedList internally uses a doubly-linked list structure, where each element (node) contains a reference to the previous and next node. This allows for efficient insertions and deletions.
    
    Thread Safety:
        LinkedList is not thread-safe, making it better suited for single-threaded applications or scenarios where external synchronization is managed.
    
    Advantage:
        Efficient insertions and deletions, especially at the beginning or end of the list, as it involves only pointer adjustments rather than shifting elements.

    Disadvantage:
        Slower access time compared to ArrayList due to the need to traverse nodes sequentially to access elements by index.
    
    Recommended Usage Scenarios:
        ✔ Best for: Scenarios with frequent insertions and deletions, especially at the beginning or end of the list.
        ❌ Not ideal for: Frequent random access by index, as traversal affects performance.

    Use Cases:
        Single-Threaded Applications: Suitable for applications where thread safety is not a concern and where frequent modifications are required.
        Queue and Deque Implementations: Ideal for implementing queues, stacks, and deques due to its Deque interface support.

    Alternative Approach:
        If frequent random access is required → Use ArrayList instead.
        If thread-safety is needed → Consider using synchronized blocks or Collections.synchronizedList(new LinkedList<>()).
    
    Note:
        LinkedList implements both the List and Deque interfaces, providing additional methods for queue and stack operations, such as addFirst(), addLast(), removeFirst(), removeLast(), peekFirst(), and peekLast().

    Additional Details to Enhance Your Explanation:
        Memory Overhead: Each node in a LinkedList requires extra memory because it stores two references (next and previous), unlike ArrayList, which has a compact array structure.

    Time Complexity Considerations:
        Insertions and deletions are efficient at the beginning and end (O(1)).
        Accessing an element at a random position is O(n) due to traversal.
    
    GC (Garbage Collection) Behavior: 
        Since each node has additional references (next and prev), deleting elements might result in higher GC pressure compared to ArrayList.

    Traversal Optimization:
        If accessing an index closer to the front, LinkedList starts from the head.
        If closer to the end, it starts from the tail—helping reduce traversal time slightly.

    Iterator vs. Index Access: 
        Using an Iterator (listIterator()) is usually faster than direct indexing (get(index)) for iteration.

    Use Cases Where LinkedList Excels
        Undo/Redo Operations: Since LinkedList supports quick insertions and deletions, it's ideal for maintaining history stacks.
        LRU Cache Implementation: Used in Least Recently Used (LRU) cache, where elements are frequently added/removed at the start or end.
        Event Processing Queues: Often used in applications that require FIFO (First-In-First-Out) processing.
        Graph Traversal Algorithms: Used in Breadth-First Search (BFS) where a queue-like structure is needed.   
 */

/*

Commonly Used Methods in List
add(E e) → Adds an element to the list.

add(int index, E element) → Inserts an element at a specific index.

remove(int index) → Removes the element at the specified index.

remove(Object o) → Removes the first occurrence of the specified object.

get(int index) → Retrieves the element at the specified index.

set(int index, E element) → Updates the element at the given index.

size() → Returns the number of elements in the list.

contains(Object o) → Checks if an element exists in the list.

indexOf(Object o) → Returns the index of the first occurrence of an element.

isEmpty() → Checks if the list is empty.

clear() → Removes all elements from the list.

subList(int fromIndex, int toIndex) → Returns a portion of the list as a new list.

iterator() → Returns an iterator to traverse the list.

listIterator() → Returns a list iterator for bidirectional traversal.

sort(Comparator<? super E> c) → Sorts the list using the given comparator.

stream() → Converts the list into a stream for functional-style operations.

*/ 
public class ListNotes {
    
    public static void main(String[] args) {
        List<String> arr = new LinkedList<>();
        arr.add("Guna");
        arr.add("Shanu");
        arr.add("Ram");
        String result=arr.toString();
        String arr1[]=arr.toArray(new String[0]);
        System.out.println("ArrayList ForEach Out: "+result);
        for(String x:arr1)
        {
            System.out.println(x);
        }
       // System.out.println("Before trim:"+arr.capacity());
        //arr.trimToSize();
       // System.out.println(arr.capacity());
    }
}
