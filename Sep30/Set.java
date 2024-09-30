

// 1. Introduction to HashSet

    // 1.1 HashSet is a part of Java's Collections Framework and implements the Set interface.

    // 1.2 It stores unique elements and does not allow duplicates.

    // 1.3 It is backed by a hash table (internally uses HashMap).

    // 1.4 No order is maintained for elements in a HashSet, unlike List or LinkedList.

    // 1.5 It allows null values.


// 2. Key Characteristics of HashSet

    // 2.1 Uniqueness: Ensures no duplicate elements are added.

    // 2.2 Null values: Allows one null element.

    // 2.3 Not ordered: The insertion order is not maintained.

    // 2.4 Not synchronized: By default, HashSet is not thread-safe. Use Collections.synchronizedSet() for thread-safe access.

    // 2.5 Efficient lookups: Provides constant-time performance for basic operations like add, remove, contains, and size, assuming the hash function disperses elements properly.


// 3. Constructors of HashSet

    // 3.1 HashSet() – Creates a default HashSet with an initial capacity of 16 and load factor of 0.75.

    // 3.2 HashSet(int capacity) – Creates a HashSet with a specified initial capacity.

    // 3.3 HashSet(int capacity, float loadFactor) – Creates a HashSet with a specified capacity and load factor.

    // 3.4 HashSet(Collection<? extends E> c) – Creates a HashSet with elements from a specified collection.


// 4. Common Methods of HashSet

    // 4.1 boolean add(E e): Adds the specified element to the set if it is not already present.

    // 4.2 boolean remove(Object o): Removes the specified element from the set if it is present.

    // 4.3 boolean contains(Object o): Returns true if the set contains the specified element.

    // 4.4 int size(): Returns the number of elements in the set.

    // 4.5 void clear(): Removes all the elements from the set.

    // 4.6 Iterator<E> iterator(): Returns an iterator over the elements in this set.


// 5. Examples of HashSet in Java

    import java.util.HashSet;

    public class Set {
        public static void main(String[] args) {
            // Create a HashSet
            HashSet<String> set = new HashSet<>();

            // Add elements to the HashSet
            set.add("Apple");
            set.add("Banana");
            set.add("Cherry");
            set.add("Apple");  // Duplicate entry

            // Display the HashSet
            System.out.println(set);  // Output: [Banana, Apple, Cherry] (Order not maintained)

            // Check if an element exists
            System.out.println(set.contains("Banana"));  // Output: true

            // Remove an element
            set.remove("Apple");

            // Display the updated set
            System.out.println(set);  // Output: [Banana, Cherry]

            // Iterate over the elements
            for (String fruit : set) {
                System.out.println(fruit);
            }
        }
    }
