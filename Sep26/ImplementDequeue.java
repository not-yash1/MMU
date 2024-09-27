package Sep26;

import java.util.*;

class Dequeue {
    Queue<Integer> Q1 = new LinkedList<>();
    Queue<Integer> Q2 = new LinkedList<>();

    public void addFront(int x) {
        while(!Q1.isEmpty()) {
            Q2.add(Q1.remove());
        }
        Q1.add(x);
        while(!Q2.isEmpty()) {
            Q1.add(Q2.remove());
        }
    }

    public int removeFront() {
        return Q1.remove();
    }

    public void addRear(int x) {
        Q1.add(x);
    }

    public int removeRear() {
        int element = Q1.remove();
        while(!Q1.isEmpty()) {
            Q2.add(element);
            element = Q1.remove();
        }

        while(!Q2.isEmpty()) {
            Q1.add(Q2.remove());
        }
        return element;
    }
}

public class ImplementDequeue {

    public static void main(String[] args) {
        Dequeue deque = new Dequeue();
        deque.addFront(1);
        deque.addFront(2);
        deque.addRear(3);
        deque.addRear(4);

        System.out.println(deque.removeFront());
        System.out.println(deque.removeFront());
        System.out.println(deque.removeRear());
        System.out.println(deque.removeRear());
    }
}
