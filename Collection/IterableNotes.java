import java.util.*;

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
       
       
        Limitations
            * No Removal: The enhanced for-loop does not allow you to remove elements from the collection during iteration. Attempting to do so will result in a ConcurrentModificationException.
            * No Access to Iterator Methods: You cannot use methods like remove() or hasNext() directly.

                    
        IMPORTANT:
        Custom Data Structures:
            You can implement the Iterable interface in your custom data structures to enable iteration.
        Key Points
            * Iterator vs. Iterable: Iterable provides the iterator() method, while Iterator provides methods like hasNext(), next(), and remove() to traverse the collection.
            * The enhanced for-loop uses the Iterable interface to iterate over collections, internally using an Iterator.
            * Enhanced For-Loop: The Iterable interface enables the use of the enhanced for-loop, making iteration more concise and readable.
            * Custom Implementation: By implementing Iterable, you can create custom collections that integrate seamlessly with Java's iteration mechanisms.
        
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

 class Node<T> {
    T data;
    Node<T> next;

    Node(T data) {
        this.data = data;
        this.next = null;
    }
}

// Custom linked list class implementing Iterable
class CustomLinkedList<T> implements Iterable<T> {
    private Node<T> head;

    public CustomLinkedList() {
        this.head = null;
    }

    // Method to add elements to the linked list
    public void add(T data) {
        if (head == null) {
            head = new Node<>(data);
        } else {
            Node<T> current = head;
            while (current.next != null) {
                current = current.next;
            }
            current.next = new Node<>(data);
        }
    }

    // Implementing the iterator() method
    @Override
    public Iterator<T> iterator() {

        /*
            NEED to Override the Iterator<T> Methods to use the Enhanced ForLoop With our Entire Pure DataStructure 
         */
        return new Iterator<T>() {
            private Node<T> current = head;

            @Override
            public boolean hasNext() {
                return current != null;
            }

            @Override
            public T next() {
                if (!hasNext()) {
                    throw new NoSuchElementException();
                }
                T data = current.data;
                current = current.next;
                return data;
            }
        };
    }

    /*
     * IMPLEMENTED with Remove method Overriden
     
     @Override
    public Iterator<T> iterator() {
        return new Iterator<T>() {
            private Node<T> current = head;
            private Node<T> previous = null;
            private boolean canRemove = false;

            @Override
            public boolean hasNext() {
                return current != null;
            }

            @Override
            public T next() {
                if (!hasNext()) {
                    throw new NoSuchElementException();
                }
                T data = current.data;
                previous = current;
                current = current.next;
                canRemove = true;
                return data;
            }

            @Override
            public void remove() {
                if (!canRemove) {
                    throw new IllegalStateException("Remove operation cannot be called before next()");
                }
                if (previous == head) {
                    head = current;
                } else {
                    Node<T> temp = head;
                    while (temp.next != previous) {
                        temp = temp.next;
                    }
                    temp.next = current;
                }
                canRemove = false;
            }
        };
    }

     */


}

public class IterableNotes {

    public static void main(String[] args) {
        CustomLinkedList<String> list = new CustomLinkedList<>();
        list.add("Apple");
        list.add("Banana");
        list.add("Cherry");

        for (String fruit : list) {
            System.out.println(fruit);
        }
    }
    
}
