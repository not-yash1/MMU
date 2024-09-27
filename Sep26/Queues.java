
// 1. Queue - A Queue in Java is a linear data structure that follows the FIFO (First-In-First-Out) principle, where elements are inserted from one end (rear) and removed from the other (front). Java provides the Queue interface under the java.util package which is implemented by various classes.


// 2. Key Characteristics of a Queue:

    // 2.1 FIFO (First-In-First-Out): The first element added is the first to be removed.

    // 2.2 Insertion: Elements are inserted at the rear of the queue.

    // 2.3 Deletion: Elements are removed from the front of the queue.

    // 2.4 Java Queue Interface: Queue<E> extends Collection<E>.


// 3. Common Methods in Queue Interface :

    // 3.1 add(e) - Inserts element e to the queue. Throws exception if full.

    // 3.2 offer(e) - Inserts element e to the queue. Returns false if full.

    // 3.3 remove() - Removes and returns the head of the queue. Throws exception if empty.

    // 3.4 poll() - Removes and returns the head of the queue, or returns null if empty.

    // 3.5 element() - Retrieves, but does not remove, the head. Throws exception if empty.

    // 3.6 peek() - Retrieves, but does not remove, the head, or returns null if empty.


// 4. Types of Queues in Java

    // 4.1 Simple Queue - Follows the basic FIFO structure.

    // 4.2 Priority Queue - Orders elements based on their natural ordering or a custom Comparator.

    // 4.3 Deque (Double-ended Queue) - Allows insertion and removal of elements from both ends.

    // 4.4 Circular Queue - The last element is connected back to the first element to make a circle.

    // 4.5 BlockingQueue (in java.util.concurrent) - Supports operations that wait for the queue to become non-empty or non-full.


// 5. Implementing Queue in Java

    // 5.1 LinkedList (Implements Queue Interface) - LinkedList can be used as a queue where elements are linked nodes, offering constant time for insertion and deletion.

    // import java.util.LinkedList;
    // import java.util.Queue;

    // class LinkedListQueueExample {
    //     public static void main(String[] args) {
    //         Queue<Integer> queue = new LinkedList<>();
            
    //         // Adding elements
    //         queue.add(10);
    //         queue.add(20);
    //         queue.add(30);
            
    //         // Removing element
    //         System.out.println("Removed: " + queue.remove()); // 10
            
    //         // Accessing head
    //         System.out.println("Head: " + queue.peek()); // 20
    //     }
    // }


    // 5.2 PriorityQueue - PriorityQueue orders elements based on their natural ordering or by a Comparator provided at queue construction time.

    // import java.util.PriorityQueue;
    // import java.util.Queue;

    // class PriorityQueueExample {
    //     public static void main(String[] args) {
    //         Queue<Integer> pq = new PriorityQueue<>();
            
    //         pq.offer(30);
    //         pq.offer(10);
    //         pq.offer(20);
            
    //         // Priority Queue orders elements
    //         System.out.println(pq.poll()); // 10 (smallest element comes first)
    //         System.out.println(pq.poll()); // 20
    //     }
    // }


    // 5.3 ArrayDeque (Implements Deque Interface) - ArrayDeque is a resizable array that implements a double-ended queue. It is faster than LinkedList and can be used as both a stack and a queue.

    // import java.util.ArrayDeque;
    // import java.util.Deque;

    // class DequeExample {
    //     public static void main(String[] args) {
    //         Deque<Integer> deque = new ArrayDeque<>();
            
    //         // Add elements at both ends
    //         deque.offerFirst(10);
    //         deque.offerLast(20);
            
    //         // Remove from the front
    //         System.out.println("Removed First: " + deque.pollFirst()); // 10
            
    //         // Remove from the rear
    //         System.out.println("Removed Last: " + deque.pollLast()); // 20
    //     }
    // }