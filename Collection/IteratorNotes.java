import java.util.*;

/*
        Iterator:
            The Iterator interface provides methods to traverse a collection of elements one by one. It is used to iterate over the elements of a collection.
            Iterator provides the methods needed for manual iteration and modification.
        Core Methods:
            boolean hasNext(): Returns true if the iteration has more elements.
            T next(): Returns the next element in the iteration.
            void remove(): Removes the last element returned by the iterator (optional operation).

        NOTES:
        Removal: The remove() method allows for safe removal of elements during iteration, avoiding ConcurrentModificationException.
           
 */

public class IteratorNotes {

    public static void main(String[] args) {
        List<String> list = new ArrayList<>();
        list.add("Apple");
        list.add("Banana");
        list.add("Cherry");

        System.out.println("Normally using ForEach loop over List");
        for(String x:list)
        {
            System.out.println("Value:"+x);
            if (x.equals("Banana")) {
                list.remove(x); // Safely remove "Banana" from the list
            }
        }
        /*
         * ######## IMPORTANT
         *  When Above Approach Removable Happen the ForEach has Stopped Before Completing the List
         * Here "Cherry" Didn't PrintedOut While "Banana" has been Remove 
         * NOTE: Above Way of Removale CASES "ConcurrentModificationException"
         * 
         */

        System.out.println("::::::" + list); 
        System.out.println("Using Iterator to Manually traverse over List");
        Iterator<String> iterator = list.iterator();
        while (iterator.hasNext()) {
            String fruit = iterator.next();
            System.out.println(fruit);
            if (fruit.equals("Banana")) {
                iterator.remove(); // Safely remove "Banana" from the list
            }
        }

        System.out.println("After removal: " + list); // Output: [Apple, Cherry]
    }
    
}
