package Sep23;

class Node {
    int data;
    Node next;
    Node(int d) {
        data = d;
        next = null;
    }
}

public class MergeLinkedList {

    public static void main(String[] args) {
        Node head1 = new Node(1);
        head1.next = new Node(2);
        head1.next.next = new Node(7);
        head1.next.next.next = new Node(9);
        head1.next.next.next.next = new Node(11);
        Node head2 = new Node(3);
        head2.next = new Node(6);
        head2.next.next = new Node(8);
        head2.next.next.next = new Node(10);
        head2.next.next.next.next = new Node(13);
        printList(mergeList(head1, head2));
    }

    public static Node mergeList(Node head1, Node head2) {
        Node dummy = new Node(0);
        Node tail = dummy;
        while (head1 != null && head2 != null) {
            if (head1.data < head2.data) {
                tail.next = head1;
                head1 = head1.next;
            } else {
                tail.next = head2;
                head2 = head2.next;
            }
            tail = tail.next;
        }
        if (head1 != null) {
            tail.next = head1;
        }
        if (head2 != null) {
            tail.next = head2;
        }
        return dummy.next;
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
