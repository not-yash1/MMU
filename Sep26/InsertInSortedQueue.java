package Sep26;

import java.util.LinkedList;
import java.util.Queue;

public class InsertInSortedQueue {

    public static void main(String[] args) {
        Queue<Integer> q = new LinkedList<>();
        q.add(1);
        q.add(3);
        q.add(5);
        q.add(7);
        q.add(9);
        // print(q);
        q = insert(q, 6);
        print(q);
        // System.out.println(q.peek());
    }

    public static void print(Queue<Integer> q) {
        while(!q.isEmpty()) {
            System.out.print(q.remove()+" ");
        }
        System.out.println();
    }

    public static Queue<Integer> insert(Queue<Integer> q, int x) {
        Queue<Integer> q1 = new LinkedList<>();
        while(!q.isEmpty()) {
            q1.add(q.remove());
        }
        // print(q1);
        while(!q1.isEmpty() && q1.peek() < x) {
            q.add(q1.remove());
        }
        q1.add(x);
        while(!q1.isEmpty()) {
            q.add(q1.remove());
        }
        print(q);
        return q;
    }
}
