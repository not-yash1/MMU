package Sep23;
import java.util.LinkedList;

public class Linked {
    public static void main(String[] args) {
        LinkedList<Integer> list = new LinkedList<>();

        list.add(10);
        list.add(20);
        list.add(30);

        System.out.println("First element: " + list.getFirst());
        System.out.println("Last element: " + list.getLast());

        // list.removeFirst();
        // list.removeLast();

        System.out.println("Updated LinkedList: " + list);
    }
}
