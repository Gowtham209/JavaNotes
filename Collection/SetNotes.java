import java.util.*;

/*

    Set:
        Set is Used to Store Only Unique Value 
        Uses a Hash Table for Storage ✅
        Unordered Collection (Elements are placed in buckets based on their hashCode())
        Fast Performance (O(1) average for insert, remove, lookup)
        Allows null Elements ✅
    SubClasses:
        HashSet , LinkedHashSet , TreeSet implements SortedSet , ConcurrentSkipListSet

*/

/*

    HashSet:
            HashSet is used to Store Unique Elements , Single-Threaded Applications
            Purpose: HashSet is a collection that implements the Set interface, backed by a hash table. It is designed to store unique elements and provides fast access to them.
            Structure: Internally, HashSet uses a HashMap to store its elements. Each element is stored as a key in the HashMap, with a constant dummy value.
    Key Characteristics:
        No Duplicates:
            HashSet does not allow duplicate elements. If you try to add a duplicate element, the existing element remains unchanged.
        No Order:
            HashSet does not maintain any order of elements. The order of elements is not guaranteed to remain constant over time.
        Efficient Operations:
            Provides constant-time performance for basic operations like add, remove, and contains, assuming the hash function disperses elements properly.
        Allows null:
            HashSet allows one null element, as null can be used as a key in a HashMap.

    Methods Specific to HashSet:
        While HashSet implements the Set interface and shares many methods with other Set implementations, it has some specific behaviors related to its hash table structure:

        add(E e):
            Adds the specified element to the set if it is not already present.
            Returns true if the set did not already contain the specified element.
        remove(Object o):
            Removes the specified element from the set if it is present.
            Returns true if the set contained the specified element.
        contains(Object o):
            Returns true if the set contains the specified element.
        isEmpty():
            Returns true if the set contains no elements.
        size():
            Returns the number of elements in the set.
        clear():
            Removes all of the elements from the set.
        Unique Behaviors
            Hashing: HashSet relies on the hashCode() and equals() methods of its elements to determine equality and hash code. Proper implementation of these methods is crucial for correct behavior.
            Load Factor and Capacity: HashSet has an initial capacity and load factor that affect its performance. The load factor determines how full the hash table can get before it is resized.

        Use Cases:
            Fast Access: HashSet is ideal for scenarios where fast access to elements is required, and order is not important.
            Unique Collections: Suitable for applications where you need to maintain a collection of unique elements, such as removing duplicates from a list.
            Single-Threaded Applications: Best used in single-threaded environments or with external synchronization for multi-threaded use.

*/

/*

    LinkedHashSet:
        Purpose: LinkedHashSet is a collection that implements the Set interface, maintaining a linked list of the entries in the set. This allows it to maintain insertion order while providing the uniqueness of elements.
        Structure: Internally, LinkedHashSet is backed by a hash table and a doubly-linked list. Each element is stored as a node in the linked list, which maintains the order of insertion.

    Key Characteristics:
        Maintains Insertion Order:
            Unlike HashSet, LinkedHashSet maintains the order in which elements are inserted. This makes it suitable for scenarios where the order of elements is important.
        No Duplicates:
            Like all Set implementations, LinkedHashSet does not allow duplicate elements. If you try to add a duplicate element, the existing element remains unchanged.
        Efficient Operations:
            Provides constant-time performance for basic operations like add, remove, and contains, assuming the hash function disperses elements properly.
        Allows null:
            LinkedHashSet allows one null element, similar to HashSet.
    Methods Specific to LinkedHashSet:
        While LinkedHashSet implements the Set interface and shares many methods with other Set implementations, its behavior is distinct due to its linked list structure. However, it does not introduce new methods beyond those provided by HashSet and Set. The key difference lies in its order maintenance:

        Order Maintenance:
            The linked list maintains the order of insertion, which is reflected when iterating over the set.
        Unique Behaviors
            Order Preservation: The primary feature of LinkedHashSet is its ability to maintain the order of elements as they were inserted. This is achieved through the linked list that tracks the insertion order.
        Hashing: Like HashSet, LinkedHashSet relies on the hashCode() and equals() methods of its elements to determine equality and hash code.

    Use Cases:
        Ordered Collections: LinkedHashSet is ideal for scenarios where you need a set with predictable iteration order, such as maintaining a history of elements or processing elements in the order they were added.
        Unique Collections: Suitable for applications where you need to maintain a collection of unique elements with order preservation.
        Single-Threaded Applications: Best used in single-threaded environments or with external synchronization for multi-threaded use.

    Commonly Used Methods in LinkedHashSet:
        add(E e) → Adds an element to the set if it is not already present.
        remove(Object o) → Removes the specified element from the set.
        contains(Object o) → Checks if the set contains a specific element.
        size() → Returns the number of elements in the set.
        isEmpty() → Checks whether the set is empty.
        clear() → Removes all elements from the set.
        iterator() → Returns an iterator for traversing the elements.
        toArray() → Converts the set elements into an array.
        retainAll(Collection<?> c) → Retains only the elements present in both sets.
        removeAll(Collection<?> c) → Removes all elements that exist in the specified collection.    
*/


/*
        TreeSet Overview:
            TreeSet class, focusing on its unique characteristics, methods, and use cases. 
            Purpose: TreeSet is a collection that implements the NavigableSet interface, backed by a TreeMap. It provides a sorted set of elements, maintaining elements in their natural order or according to a specified comparator.
            Structure: Internally, TreeSet uses a red-black tree, a self-balancing binary search tree, to store its elements. This ensures that the set remains sorted at all times.
        Key Characteristics:
            Sorted Order:
                TreeSet maintains elements in sorted order, either by their natural ordering (if they implement Comparable) or by a specified Comparator.
            No Duplicates:
                Like all Set implementations, TreeSet does not allow duplicate elements. If you try to add a duplicate element, the existing element remains unchanged.

        NavigableSet Features:
            TreeSet implements the NavigableSet interface, providing methods for navigation and range operations.
        
        No null Elements:
            TreeSet does not allow null elements, as null cannot be compared to other elements for ordering.

        Methods Specific to TreeSet:
            TreeSet provides several methods that are specific to its sorted nature and the NavigableSet interface:

        Range Operations:
            SortedSet<E> subSet(E fromElement, E toElement): Returns a view of the portion of this set whose elements range from fromElement, inclusive, to toElement, exclusive.
            SortedSet<E> headSet(E toElement): Returns a view of the portion of this set whose elements are strictly less than toElement.
            SortedSet<E> tailSet(E fromElement): Returns a view of the portion of this set whose elements are greater than or equal to fromElement.
            
        Navigation Methods:
            E lower(E e): Returns the greatest element in this set strictly less than the given element, or null if there is no such element.
            E floor(E e): Returns the greatest element in this set less than or equal to the given element, or null if there is no such element.
            E ceiling(E e): Returns the least element in this set greater than or equal to the given element, or null if there is no such element.
            E higher(E e): Returns the least element in this set strictly greater than the given element, or null if there is no such element.

        Poll Methods:
            E pollFirst(): Retrieves and removes the first (lowest) element, or returns null if the set is empty.
            E pollLast(): Retrieves and removes the last (highest) element, or returns null if the set is empty.

        Comparator Access:
            Comparator<? super E> comparator(): Returns the comparator used to order the elements in this set, or null if this set uses the natural ordering of its elements.

        Use Cases
            Sorted Collections: TreeSet is ideal for scenarios where elements need to be maintained in a sorted order, such as in range queries or ordered iteration.
            Navigable Operations: Suitable for applications requiring navigation and range operations, such as finding elements within a specific range.
            Single-Threaded Applications: Best used in single-threaded environments or with external synchronization for multi-threaded use.

*/

/*

Lets Dissect with Much Deeper understanding of PriorityQueue ALONE along with methods that are ONLY applicable with PriorityQueue and are not applicable of Other Queue SubClasses

*/
public class SetNotes {
 
    public static void main(String[] args) {
        
    }
}
