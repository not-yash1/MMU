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

public class ReverseDoublyLinkedList {
    public static void main(String[] args) {
        Doubly head = new Doubly(1);
        head.next = new Doubly(2);
        head.next.prev = head;
        head.next.next = new Doubly(3);
        head.next.next.prev = head.next;
        head.next.next.next = new Doubly(4);
        head.next.next.next.prev = head.next.next;
        head.next.next.next.next = new Doubly(5);
        head.next.next.next.next.prev = head.next.next.next;
        printList(head);
        head = reverse(head);
        printList(head);
    }

    public static Doubly reverse(Doubly head) {
        Doubly curr = head;
        Doubly prev = null;
        while (curr != null) {
            Doubly next = curr.next;
            curr.next = prev; 
            prev = curr;
            curr = next;
        } 
        return prev;
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
}
