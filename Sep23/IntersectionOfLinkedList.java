package Sep23;

class Node {
    int data;
    Node next;
    Node(int d) {
        data = d;
        next = null;
    }
}

public class IntersectionOfLinkedList {

    public static void main(String[] args) {
        Node head1 = new Node(3);
        head1.next = new Node(6);
        head1.next.next = new Node(9);
        head1.next.next.next = new Node(15);
        head1.next.next.next.next = new Node(30);
        Node head2 = new Node(10);
        head2.next = new Node(15);
        head2.next.next = new Node(30);
        head2.next.next.next = new Node(40);
        head2.next.next.next.next = head1.next.next;
        printList(head1);
        printList(head2);
        System.out.println(intersectionPoint(head1, head2).data);
    }

    public static Node intersectionPoint(Node head1, Node head2) {
        Node curr1 = head1;
        Node curr2 = head2;
        while (curr1 != curr2) {
            curr1 = curr1 == null ? head2 : curr1.next;
            curr2 = curr2 == null ? head1 : curr2.next;
        }
        return curr1;
    }

    public static void printList(Node head) {
        Node curr = head;
        System.out.print(curr.data);
        curr = curr.next;
        while (curr != null) {
            System.out.print("->"+curr.data);
            curr = curr.next;
        }
        System.out.println();
    }
}
