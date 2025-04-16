import java.util.*;

/*

        Map:
            Maps are Separate Entity form Collection
            Maps are used to Store Unique Key and Value Pair Mostly UnOrdered Expect LinkedHashMap & TreeMap used to Store in Stored of Key

        SubClasses:
            HashMap , HashTable ,LinkedHashMap , TreeMap implements SortedMap
        
        Single Thread:
            Non-Synchronized Map implementations like HashMap or LinkedHashMap  for optimal performance, as there is no need for thread safety.
            TreeMap is a Sorted Map and is not thread-safe by default.
        Multi Thread:
            Hashtable , ConcurrentHashMap
            
*/

/*
        HashMap:
            Used for Single Thread Environment
            Purpose: HashMap is a widely used implementation of the Map interface, designed to store key-value pairs. It provides efficient access to values based on keys.
            Structure: Internally, HashMap uses an array of buckets, where each bucket is a linked list or a tree (for high collision scenarios). The position of each key-value pair is determined by the hash code of the key.

        Key Characteristics:
            No Order:
                HashMap does not maintain any order of its entries. The order of keys and values is not guaranteed to remain constant over time.
            Allows null:
                HashMap allows one null key and multiple null values.
            Efficient Operations:
                Provides constant-time performance for basic operations like get(), put(), and remove(), assuming the hash function disperses elements properly.
            Not Thread-Safe:
                HashMap is not synchronized, meaning it is not thread-safe by default. Concurrent modifications by multiple threads can lead to unpredictable behavior.

        Methods Specific to HashMap:
                While HashMap implements the Map interface and shares many methods with other Map implementations, it has some specific behaviors related to its hash table structure. However, it does not introduce new methods beyond those provided by Map. The key differences lie in its performance characteristics and handling of null values:

                put(K key, V value):
                    Associates the specified value with the specified key in the map. If the map previously contained a mapping for the key, the old value is replaced.
                get(Object key):
                    Returns the value to which the specified key is mapped, or null if the map contains no mapping for the key.
                remove(Object key):
                    Removes the mapping for the specified key from the map if present.
                containsKey(Object key):
                    Returns true if the map contains a mapping for the specified key.
                containsValue(Object value):
                    Returns true if the map maps one or more keys to the specified value.
                size():
                    Returns the number of key-value mappings in the map.
                clear():
                    Removes all of the mappings from the map.

            Unique Behaviors:
                Hashing: HashMap relies on the hashCode() and equals() methods of its keys to determine equality and hash code. Proper implementation of these methods is crucial for correct behavior.
                Load Factor and Capacity: HashMap has an initial capacity and load factor that affect its performance. The load factor determines how full the hash table can get before it is resized.

            Use Cases:
                Fast Access: HashMap is ideal for scenarios where fast access to values based on keys is required.
                Data Indexing: Suitable for applications where you need to index data by unique keys, such as caching or configuration settings.
                Single-Threaded Applications: Best used in single-threaded environments or with external synchronization for multi-threaded use.
*/

/*

        LinkedHashMap:
                LinkedHashMap is primarily used in single-threaded environments due to its lack of built-in synchronization. However, it can be used in multi-threaded environments with external synchronization
                Purpose: LinkedHashMap is a hash table and linked list implementation of the Map interface, with predictable iteration order. It maintains a doubly-linked list running through all of its entries, which defines the iteration order.
                Structure: Internally, LinkedHashMap uses a combination of a hash table and a linked list. The hash table provides fast access to elements, while the linked list maintains the order of insertion.

        Key Characteristics:
            Maintains Insertion Order:
                LinkedHashMap maintains the order of elements as they were inserted. This makes it suitable for scenarios where the order of elements is important.
            No Duplicates:
                Like all Map implementations, LinkedHashMap does not allow duplicate keys. If you try to add a duplicate key, the existing value associated with that key will be replaced with the new value.
            Allows null:
                LinkedHashMap allows one null key and multiple null values.

        Efficient Operations:
            Provides constant-time performance for basic operations like get(), put(), and remove(), assuming the hash function disperses elements properly.
        Not Thread-Safe:
            LinkedHashMap is not synchronized, meaning it is not thread-safe by default. Concurrent modifications by multiple threads can lead to unpredictable behavior.
        
        Methods Specific to LinkedHashMap
            While LinkedHashMap implements the Map interface and shares many methods with other Map implementations, it has some specific behaviors related to its linked list structure:

        Order Maintenance:
            The linked list maintains the order of insertion, which is reflected when iterating over the map.
        Access Order:
            LinkedHashMap can be configured to maintain access order instead of insertion order. This is useful for implementing caches with a least-recently-used (LRU) eviction policy.
            Constructor: LinkedHashMap(int initialCapacity, float loadFactor, boolean accessOrder): The accessOrder parameter determines whether the order is based on access order (true) or insertion order (false).
        Remove Eldest Entry:
            protected boolean removeEldestEntry(Map.Entry<K,V> eldest): This method can be overridden to impose a policy for removing the eldest entry when a new entry is added. It is useful for implementing bounded caches.

        Use Cases
            Ordered Collections: LinkedHashMap is ideal for scenarios where you need a map with predictable iteration order, such as maintaining a history of elements or processing elements in the order they were added.
            Caching: Suitable for implementing caches with LRU eviction policies by maintaining access order.
            Single-Threaded Applications: Best used in single-threaded environments or with external synchronization for multi-threaded use.

*/

/*
        HashTable:
        Purpose: HashTable is a legacy implementation of the Map interface, designed to store key-value pairs. It is similar to HashMap, but it is synchronized, making it thread-safe. However, this comes at the cost of performance.
        Structure: Internally, HashTable uses an array of buckets, where each bucket is a linked list. The position of each key-value pair is determined by the hash code of the key.

        Key Characteristics:
            Synchronized:
                Hashtable is synchronized, meaning it is thread-safe for concurrent access. This makes it suitable for use in multi-threaded environments without additional synchronization.
            No null Keys or Values:
                Unlike HashMap, Hashtable does not allow null keys or values. Attempting to insert a null key or value will result in a NullPointerException.
            Legacy Class:
                Hashtable is considered a legacy class and has been largely replaced by ConcurrentHashMap for concurrent access in modern applications due to better performance and scalability.
        
        Methods Specific to Hashtable:
            While Hashtable implements the Map interface and shares many methods with other Map implementations, it has some specific methods and behaviors related to its synchronized nature:

            put(K key, V value):
                    Associates the specified value with the specified key in the map. If the map previously contained a mapping for the key, the old value is replaced.
            get(Object key):
                    Returns the value to which the specified key is mapped, or null if the map contains no mapping for the key.
            remove(Object key):
                    Removes the mapping for the specified key from the map if present.
            containsKey(Object key):
                    Returns true if the map contains a mapping for the specified key.
            containsValue(Object value):
                    Returns true if the map maps one or more keys to the specified value.
            size():
                    Returns the number of key-value mappings in the map.
            clear():
                    Removes all of the mappings from the map.
            Enumeration Methods:
                    Enumeration<K> keys(): Returns an enumeration of the keys in the hashtable.
                    Enumeration<V> elements(): Returns an enumeration of the values in the hashtable.
        
        
        Unique Behaviors:
                Synchronized Methods: All methods in Hashtable are synchronized, providing thread safety for concurrent access.
                Legacy Design: Hashtable is part of the original Java 1.0 collection classes and has been largely replaced by more modern alternatives like HashMap and ConcurrentHashMap.
        
        Use Cases:
                Thread-Safe Collections: Hashtable is suitable for scenarios where thread safety is required, and the overhead of synchronization is acceptable.
                Legacy Applications: It may still be used in legacy applications that rely on its synchronized behavior.
*/


/*

        TreeMap:
            TreeMap is not thread-safe, meaning that it does not provide any internal mechanisms to handle concurrent access by multiple threads. It can be used in multi-threaded environments with external synchronization.
            Purpose: TreeMap is a map implementation that maintains its entries in ascending key order, according to the natural ordering of its keys or by a specified comparator. It is part of the NavigableMap and SortedMap interfaces.
            Structure: Internally, TreeMap uses a red-black tree, a self-balancing binary search tree, to store its elements. This ensures that the map remains sorted at all times.
    
        Key Characteristics:
            Sorted Order:
                TreeMap maintains elements in sorted order, either by their natural ordering (if they implement Comparable) or by a specified Comparator.
            No Duplicates:
                Like all Map implementations, TreeMap does not allow duplicate keys. If you try to add a duplicate key, the existing value associated with that key will be replaced with the new value.
            No null Keys:
                TreeMap does not allow null keys, as null cannot be compared to other elements for ordering. However, it allows multiple null values.
            Not Thread-Safe:
                TreeMap is not synchronized, meaning it is not thread-safe by default. Concurrent modifications by multiple threads can lead to unpredictable behavior.
    
    
        Methods Specific to TreeMap:
            TreeMap provides several methods that are specific to its sorted nature and the NavigableMap interface:

            Range Operations:
                SortedMap<K, V> subMap(K fromKey, K toKey): Returns a view of the portion of this map whose keys range from fromKey, inclusive, to toKey, exclusive.
                SortedMap<K, V> headMap(K toKey): Returns a view of the portion of this map whose keys are strictly less than toKey.
                SortedMap<K, V> tailMap(K fromKey): Returns a view of the portion of this map whose keys are greater than or equal to fromKey.
            Navigation Methods:
                K lowerKey(K key): Returns the greatest key strictly less than the given key, or null if there is no such key.
                K floorKey(K key): Returns the greatest key less than or equal to the given key, or null if there is no such key.
                K ceilingKey(K key): Returns the least key greater than or equal to the given key, or null if there is no such key.
                K higherKey(K key): Returns the least key strictly greater than the given key, or null if there is no such key.
            Poll Methods:
                Map.Entry<K, V> pollFirstEntry(): Retrieves and removes the first (lowest) entry, or returns null if the map is empty.
                Map.Entry<K, V> pollLastEntry(): Retrieves and removes the last (highest) entry, or returns null if the map is empty.
            Comparator Access:
                Comparator<? super K> comparator(): Returns the comparator used to order the keys in this map, or null if this map uses the natural ordering of its keys.
                
        Use Cases:
            Navigable Operations: Suitable for applications requiring navigation and range operations, such as finding keys within a specific range.
            Sorted Collections: TreeMap is ideal for scenarios where keys need to be maintained in a sorted order, such as in range queries or ordered iteration.
            Single-Threaded Applications: Best used in single-threaded environments or with external synchronization for multi-threaded use. 

*/

public class MapNotes {
    public static void main(String[] args) {
        
    }
}
