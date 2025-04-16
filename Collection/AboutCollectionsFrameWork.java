import java.util.*;


/*
 * 
 * COLLECTION FrameWork 
        The Java Collection Framework is a unified architecture for representing and manipulating collections of objects. 
It provides a set of interfaces and classes to handle groups of objects with ease and efficiency.

CORE Collection Interfaces:
*List
*Queue
*Set

MAP:
    The Map interface is not a subtype of Collection. Map is designed to handle key-value pairs, which is a fundamentally different 
structure compared to the single-element collections represented by List, Set, and Queue.

IMPORTANT:
    Iterable is the Primary/Primitive Parent Interface to Collection Interface itself
    Collection is the Primary/Primitive Parent Interface to List, Queue, Set Interfaces
    Map is a Separate Interface

 */



/*
        Iterable:
           The Iterable interface in Java is a fundamental part of the Java Collections Framework. It provides a way to traverse or iterate over a collection of elements. 
        Note:
            The Iterable interface has a single abstract method:
                    Iterator<T> iterator();
        Enhanced For-Loop:
            The Iterable interface allows objects to be the target of the enhanced for-loop (also known as the "for-each" loop), which simplifies iteration over collections.
        Example:
            List<String> list = Arrays.asList("Apple", "Banana", "Cherry");
                for (String fruit : list) {
                        System.out.println(fruit);
                    }
        IMPORTANT:
        Custom Data Structures:
            You can implement the Iterable interface in your custom data structures to enable iteration.
        Key Points
            Iterator vs. Iterable: Iterable provides the iterator() method, while Iterator provides methods like hasNext(), next(), and remove() to traverse the collection.
            Enhanced For-Loop: The Iterable interface enables the use of the enhanced for-loop, making iteration more concise and readable.
            Custom Implementation: By implementing Iterable, you can create custom collections that integrate seamlessly with Java's iteration mechanisms.
        
        Example : Iterable() Implementation in CUSTOM Data Structure To use Enhance ForLoop                

    public class CustomCollection<T> implements Iterable<T> 
    {
    
    private List<T> elements = new ArrayList<>();

    public void add(T element) {
        elements.add(element);
    }

    @Override
    public Iterator<T> iterator() {
        return elements.iterator();
    }
 
    }

public class Main {
    public static void main(String[] args) {
        CustomCollection<String> collection = new CustomCollection<>();
        collection.add("One");
        collection.add("Two");
        collection.add("Three");

        for (String item : collection) {
            System.out.println(item);
        }
    }
}
 */

public class AboutCollectionsFrameWork{

    public static void main(String[] args) {
        
    }
}
/* 
Core Collection Interfaces & Classes
Java collections are categorized into different interfaces and implementations. These include:

✅ List (Ordered & Resizable)
ArrayList → Dynamic array, fast random access

LinkedList → Doubly linked list, efficient insertions/removals

Vector → Synchronized, resizable array (legacy)

Stack → LIFO (Last-In-First-Out) structure (extends Vector)

CopyOnWriteArrayList → Thread-safe alternative for concurrent modifications

✅ Set (Unique Elements, No Duplicates)
HashSet → Backed by a HashTable, no order guarantee

LinkedHashSet → Maintains insertion order

TreeSet → Sorted Set (Red-Black tree implementation)

EnumSet → Optimized set for enum types

✅ Queue (FIFO - First-In-First-Out)
PriorityQueue → Ordered by priority (heap-based)

ArrayDeque → Double-ended queue (Deque), faster than Stack

LinkedBlockingQueue → Bounded blocking queue for multithreading

PriorityBlockingQueue → Thread-safe priority queue

✅ Map (Key-Value Pairs)
HashMap → Unordered, fast key lookup

LinkedHashMap → Maintains insertion order

TreeMap → Sorted Map (Red-Black tree)

ConcurrentHashMap → Thread-safe map for concurrency

WeakHashMap → Uses weak references (GC-friendly)

IdentityHashMap → Uses identity comparison (==) instead of .equals()

✅ Concurrent Collections
ConcurrentLinkedQueue → Thread-safe queue

ConcurrentSkipListSet → Sorted Set with concurrency

ConcurrentSkipListMap → Sorted Map with concurrency

✅ Fixed-Size & Special Collections
Arrays.asList() → Fixed-size wrapper for arrays

Collections.synchronizedList(...) → Synchronized wrapper around lists

LinkedBlockingDeque → Blocking queue with bidirectional access */