package Sep23;

class Doubly {
    int data;
    Doubly next;
    Doubly prev;
    Doubly(int data) {
        this.data = data;
        this.next = null;
        this.prev = null;
    }
}

public class InsertInDoubly {
    public static void main(String[] args) {
        Doubly head = new Doubly(10);
        Doubly second = new Doubly(20);
        Doubly third = new Doubly(30);
        head.next = second;
        second.prev = head;
        second.next = third;
        third.prev = second;

        printList(head);
        head = insertAtLast(head, 40);
        printList(head);
        head = insertAtFirst(head, 5);
        printList(head);
    }

    public static void printList(Doubly head) {
        Doubly curr = head;
        System.out.print(curr.data);
        curr = curr.next;
        while (curr != null) {
            System.out.print("<->"+curr.data);
            curr = curr.next;
        }
        System.out.println();
    }

    public static Doubly insertAtLast(Doubly head, int data) {
        Doubly new_node = new Doubly(data);
        if (head == null) {
            head = new_node;
            return head;
        }
        Doubly curr = head;
        while (curr.next != null) {
            curr = curr.next;
        }
        curr.next = new_node;
        new_node.prev = curr;
        return head;
    }

    public static Doubly insertAtFirst(Doubly head, int data) {
        Doubly new_node = new Doubly(data);
        if (head == null) {
            head = new_node;
            return head;
        }
        Doubly curr = head;
        new_node.next = curr;
        curr.prev = new_node;
        head = new_node;
        return head;
    }
}
