import java.util.*;

/*
        Queue:
            Queue follows First-In-First-Out (FIFO) principle
        
        SubClasses:
            PriorityQueue , Deque , ArrayDeque , LinkedList , LinkedBlockingQueue , PriorityBlockingQueue

 */

/*
        PriorityQueue:
            PriorityQueue is primarily designed for single-threaded environments due to its lack of built-in synchronization. However, it can be used in multi-threaded environments with external synchronization
            Purpose: A priority queue based on a priority heap, where elements are ordered according to their natural ordering or by a specified "Comparator".
        Dynamic Resizing:
            PriorityQueue dynamically resizes as elements are added, similar to ArrayList.
        Key Characteristics:
            Heap-Based Structure:
                Internally, PriorityQueue is implemented as a binary heap, which provides efficient priority-based operations.
                The heap structure ensures that the element with the highest priority (or lowest, depending on the comparator) is always at the head of the queue.
        Natural Ordering and Comparators:
                By default, PriorityQueue orders elements according to their natural ordering (i.e., elements must implement Comparable).
                A custom Comparator can be provided at the time of queue construction to define an alternative ordering.

        Advantages:
            Efficient retrieval of the highest or lowest priority element.
            Automatically orders elements based on priority.
        Disadvantages:
            Not thread-safe by default.
            Does not allow null elements.

        Use Cases:
            Suitable for scheduling tasks based on priority.
            Ideal for applications requiring priority-based processing.
            Task Scheduling: PriorityQueue is ideal for scheduling tasks based on priority, such as in job scheduling systems.
            Event Management: Useful for managing events that need to be processed in a specific order based on priority.
            Pathfinding Algorithms: Commonly used in algorithms like Dijkstra's or A* for managing nodes to be explored.

        Unique Behaviors:
            No null Elements: PriorityQueue does not permit null elements, as null is used as a special return value by the poll() and peek() methods.
            Unordered Iteration: Iterating over a PriorityQueue does not guarantee any particular order of elements. The iteration order is not necessarily the priority order.
                       
        Multi-Threaded Environment:
            Use external synchronization or consider using PriorityBlockingQueue for thread safety.
        

        Methods Specific to PriorityQueue:
            While PriorityQueue implements the Queue interface and shares many methods with other Queue implementations, its behavior is distinct due to its priority-based ordering. Here are some key methods and behaviors:

        offer(E e):
            Adds the specified element to the queue. The element is inserted based on its priority.
            Returns true if the element was added successfully.
        poll():
            Retrieves and removes the head of the queue, which is the element with the highest priority.
            Returns null if the queue is empty.
        peek():
            Retrieves, but does not remove, the head of the queue.
            Returns null if the queue is empty.
        remove(Object o):
            Removes a single instance of the specified element from the queue, if it is present.
        comparator():
            Returns the comparator used to order the elements in the queue, or null if the queue uses natural ordering.
*/

/*

        ArrayDeque Overview:
            ArrayDeque is Mostly used for Single-Threaded Environment & It is not thread-safe, meaning that it does not provide any internal mechanisms to handle concurrent access by multiple threads
            ArrayDeque can be used as both LIFO (Last-In-First-Out) and FIFO (First-In-First-Out) depending on how you manage it:
            ArrayDeque implements both the Deque and Queue interfaces, providing a wide range of methods for manipulating elements.
            Purpose: ArrayDeque is a resizable array implementation of the Deque interface. It provides efficient insertion and removal operations at both ends of the deque.
            Structure: Internally, ArrayDeque uses a circular array to store elements, allowing for efficient use of space and fast access to both ends.

        Key Characteristics:
            Double-Ended Queue:
                ArrayDeque supports element insertion and removal at both the head and tail, making it suitable for use as both a queue (FIFO) and a stack (LIFO).
            No Capacity Restrictions:
                Unlike some other queue implementations, ArrayDeque does not have a fixed capacity and can grow dynamically as needed.
            Non-Blocking:
                ArrayDeque is not thread-safe and does not provide blocking operations. It is designed for use in single-threaded or externally synchronized environments.
            No null Elements:
                ArrayDeque does not allow null elements, as null is used as a sentinel value to indicate the end of the deque.

        Use Cases:
            Stack and Queue Implementations: ArrayDeque is ideal for implementing both stack and queue data structures due to its efficient operations at both ends.
            Buffer Management: Suitable for scenarios where elements need to be added and removed from both ends, such as in buffer management.
            Single-Threaded Applications: Best used in single-threaded environments or with external synchronization for multi-threaded use. Consider using ConcurrentLinkedDeque for thread-safe operations.
        
        Example of Usage in Real-World Scenarios:
            * To make it more engaging, adding a practical example like:
            * Undo/Redo functionality (like a text editor).
            * Sliding window problems (common in coding challenges).
            * Task scheduling (where you process tasks in both FIFO and LIFO order).

        Methods Specific to ArrayDeque:
        Stack Operations:
            void push(E e): Pushes an element onto the stack represented by the deque (equivalent to addFirst(E e)).
            E pop(): Pops an element from the stack represented by the deque (equivalent to removeFirst()).
        Deque Operations:
            void addFirst(E e): Inserts the specified element at the front of the deque.
            void addLast(E e): Inserts the specified element at the end of the deque.
            E removeFirst(): Removes and returns the first element of the deque.
            E removeLast(): Removes and returns the last element of the deque.
            E getFirst(): Retrieves, but does not remove, the first element of the deque.
            E getLast(): Retrieves, but does not remove, the last element of the deque.
            E peekFirst(): Retrieves, but does not remove, the first element of the deque, or returns null if the deque is empty.
            E peekLast(): Retrieves, but does not remove, the last element of the deque, or returns null if the deque is empty.
        Queue Operations:
            boolean offerFirst(E e): Inserts the specified element at the front of the deque.
            boolean offerLast(E e): Inserts the specified element at the end of the deque.
            E pollFirst(): Retrieves and removes the first element of the deque, or returns null if the deque is empty.
            E pollLast(): Retrieves and removes the last element of the deque, or returns null if the deque is empty.      
*/

/*
        ConcurrentLinkedQueue
            Purpose: A thread-safe, non-blocking queue based on linked nodes.
        Advantages:
            High concurrency and scalability.
            Non-blocking operations.
        Disadvantages:
            Weaker consistency guarantees compared to blocking queues.
        Use Cases:
            Suitable for multi-threaded applications requiring high concurrency.
            Ideal for producer-consumer scenarios.
        Multi-Threaded Environment:
            Provides thread safety out of the box, suitable for concurrent access.
 */

/*

        LinkedBlockingQueue
            Purpose: A blocking queue that supports operations that wait for the queue to become non-empty when retrieving an element and wait for space to become available when storing an element.
        Advantages:
            Provides blocking operations for both producers and consumers.
            Optional capacity bounds.
        Disadvantages:
            Blocking operations may lead to thread contention.
        Use Cases:
            Suitable for multi-threaded applications requiring blocking behavior.
            Ideal for producer-consumer scenarios with capacity constraints.
        Multi-Threaded Environment:
            Provides thread safety and blocking operations, suitable for concurrent access.

*/
public class QueueNotes {
 
    public static void main(String[] args) {
        PriorityQueue<Integer> pq= new PriorityQueue<>(); // Default is Ascending Order
        PriorityQueue<Integer> pqAs= new PriorityQueue<>((a,b)->a-b); // Ascending Sorted
        PriorityQueue<Integer> pqDe= new PriorityQueue<>((a,b)->b-a); // Descending Sorted
        pq.add(3);
        pq.add(5);
        pq.add(2);
        pq.add(10);
        pq.add(9);
        // Will be Maintained Heap Algo state instead Sorted Way as i Expect
        System.out.println("Direct Print:"+pq+"\nPrinting with Loop:"); // [2, 5, 3, 10, 9] Unknown Specific order
        
        while (!pq.isEmpty()) 
        {
            System.out.print(pq.poll() + " ");
            // Proper Sorted way This will be PRINTED
        }


        /* IMPORTANT: Only if we Use ArrayDeque in Both Side we Can able to use the Below Methods */
        ArrayDeque<String> deque = new ArrayDeque<>();

        deque.add("Mango");
        // Add elements to the deque
        deque.addFirst("Apple");
        deque.addLast("Banana");
        deque.addFirst("Cherry");

        System.out.println("ArrayDeque: " + deque);

        // Stack operations
        deque.push("Date"); // Adds to First Position of the Deque
        System.out.println("After push: " + deque);
        System.out.println("Popped: " + deque.pop()); // Remove Element at First Position of the Deque

        // Queue operations
        System.out.println("Poll first: " + deque.pollFirst());
        System.out.println("Poll last: " + deque.pollLast());



    }
}
