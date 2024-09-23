package Sep23;

// 1. ArrayList in Java : The ArrayList in Java is a part of the java.util package and provides a resizable array implementation of the List interface. Unlike arrays in Java that have a fixed size, an ArrayList can dynamically grow or shrink as elements are added or removed.


// 2. Key Features of ArrayList:

    // 2.1 Dynamic Resizing: Automatically expands as new elements are added and contracts when elements are removed.

    // 2.1 Indexed Access: Elements in an ArrayList can be accessed by their index, similar to arrays.

    // 2.1 Null Values: Can store null elements.

    // 2.1 Duplicate Values: Allows duplicate elements.


// 3. Creating ArrayList:

    import java.util.ArrayList;

    public class Arraylists {
        public static void main(String[] args) {
            // Declaration
            ArrayList<String> list = new ArrayList<>();

            // Add elements
            list.add("Apple");
            list.add("Banana");
            list.add("Mango");

            // Print the ArrayList
            System.out.println(list);
        
    


// 4. Basic Operations of ArrayList

    // 4.1 Add Elements
        ArrayList<Integer> numbers = new ArrayList<>();
        numbers.add(10);  // Adds 10 at the end
        numbers.add(1, 20);  // Adds 20 at index 1
    

    // 4.2 Remove Elements
        numbers.remove(0);  // Removes the element at index 0
        numbers.remove(Integer.valueOf(20));  // Removes the first occurrence of 20


    // 4.3 Update Elements
        numbers.set(0, 15);  // Updates the element at index 0 to 15


    // 4.4 Clearing the Elements
        numbers.clear();  // Clears the list


    // 4.9 Checking size
        int size = numbers.size();  // Returns the number of elements


    // 4.6 Get Elements
        int number = numbers.get(0);  // Accesses the first element (10)


    // 4.7 Remove Elements
        numbers.remove(0);  // Removes the element at index 0
        numbers.remove(Integer.valueOf(20));  // Removes the first occurrence of 20
    

    


        }
    }