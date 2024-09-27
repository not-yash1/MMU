
package Sep27;

// 1. HashMap - A HashMap in Java is part of the java.util package and is one of the most commonly used data structures. It is a collection that stores key-value pairs and provides constant time complexity for basic operations like insertion, deletion, and access, assuming the hash function disperses the elements properly.


// 2. Key Characteristics of HashMap:

    // 2.1 Key-Value Pair: Stores data in pairs (key -> value). Each key is unique, but values can be duplicated.

    // 2.2 Hashing Mechanism: It uses a hash function to compute the hash code for a key and stores the entry at that index.

    // 2.3 Allows Null Values: It allows one null key and multiple null values.

    // 2.4 Non-Synchronized: HashMap is not thread-safe. Use ConcurrentHashMap or synchronize externally if thread safety is required.

    // 2.5 No Guaranteed Order: The entries are not stored in any particular order.


// 3. Common Methods in HashMap

    // 3.1 put(key, value) - Associates the specified key with the specified value in the map.

    // 3.2 get(key) - Returns the value associated with the key, or null if the key doesn't exist.

    // 3.3 remove(key) - Removes the key-value pair associated with the key from the map.

    // 3.4 containsKey(key) - Returns true if the map contains the specified key.

    // 3.5 containsValue(value) - Returns true if the map contains the specified value.

    // 3.6 keySet() - Returns a Set of all keys in the map.

    // 3.7 values() - Returns a Collection of all values in the map.

    // 3.8 size() - Returns the number of key-value pairs in the map.

    // 3.9 isEmpty() - Returns true if the map is empty.

    // 3.10 getOrDefault(key, defaultValue) - Returns the value associated with the key, or the default value if the key doesn't exist.

    // 3.11 clear() - Removes all key-value pairs from the map.

    // 3.12 hashCode() - Returns the hash code for the map.


// 4. How HashMap Works

    // 4.1 Hashing: HashMap uses a hash function to compute an index for a key, which determines where the entry is stored in the map.

    // 4.2 Collision Handling: If two keys generate the same hash (collision), HashMap uses a LinkedList at that index (buckets) to store the entries. In Java 8, if the number of entries at a bucket grows beyond a threshold, it converts the list to a balanced tree (Red-Black Tree) to improve performance.

    // 4.3 Rehashing: When the number of key-value pairs exceeds the threshold (load factor), HashMap dynamically resizes and rehashes all the entries into a new table.


// 5. HashMap Time Complexity

    // 5.1 Average Case: O(1) for get(), put(), and remove().

    // 5.2 Worst Case: O(n) if all elements hash to the same bucket (rare scenario).


// 6. Creating a HashMap

    import java.util.HashMap;

    public class Hashing {
        public static void main(String[] args) {
            HashMap<String, Integer> map = new HashMap<>();

            // Adding key-value pairs to the HashMap
            map.put("Apple", 10);
            map.put("Banana", 20);
            map.put("Orange", 30);

            // Accessing elements
            System.out.println("Apple count: " + map.get("Apple")); // 10

            // Check if a key exists
            if (map.containsKey("Banana")) {
                System.out.println("Banana exists with count: " + map.get("Banana")); // 20
            }

            // Removing an entry
            map.remove("Orange");
            System.out.println("Map after removal: " + map);
            System.out.println(map.isEmpty());

            // HashMap<Integer, Integer> m = new HashMap<>();
            // m.put(0, m.getOrDefault(0, 0)+1);
            // System.out.println(m.get(0));
        }
    }


// 7. Types of HashMaps : 

    // 7.1 HashMap

        // 7.2.1 Similar to unordered_map in C++.

        // 7.2.2 Does not guarantee order.

        // 7.2.3 Offers O(1) average time complexity for operations.

    // 7.2 TreeMap -

        // 7.1.1 Similar to map in C++.

        // 7.1.2 Maintains a sorted order of keys.

        // 7.1.3 Operations like put(), get(), and remove() are O(log n).

    // 7.3 LinkedHashMap

        // 7.3.1 Maintains insertion order (like a HashMap with a twist).

        // 7.3.2 Useful when you need predictable iteration order but with fast access time.


