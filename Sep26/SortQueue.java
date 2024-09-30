
import java.util.LinkedList;
import java.util.Queue;


public class SortQueue {
    
    public static void main(String[] args) {
        Queue<Integer> q = new LinkedList<>();
        q.add(5);
        q.add(4);
        q.add(3);
        q.add(2);
        q.add(1);
        System.out.println(q.peek());
        q = sort(q);
        // System.out.println(q.peek());
    }

    public static Queue<Integer> sort(Queue<Integer> q) {
        Queue<Integer> q1 = new LinkedList<>();
        while(!q.isEmpty()) {
            int x = q.remove();
            if(x < q1.peek()) {
                q1.add(x);
            } else {
                while(!q1.isEmpty() && x > q1.peek()) {
                    q.add(q1.remove());
                }
                q1.add(x);
            }
        }
        return q1;
    }
}
