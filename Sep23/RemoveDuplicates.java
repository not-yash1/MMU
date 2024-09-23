package Sep23;

class Node {
    int data;
    Node next;
    Node(int d) {
        data = d;
        next = null;
    }
}

public class RemoveDuplicates {

    public static void main(String[] args) {

        Node head = new Node(1);
        head.next = new Node(2);
        head.next.next = new Node(2);
        head.next.next.next = new Node(3);
        head.next.next.next.next = new Node(3);
        head.next.next.next.next.next = new Node(4);
        head.next.next.next.next.next.next = new Node(5);
        head.next.next.next.next.next.next.next = new Node(5);
        head.next.next.next.next.next.next.next.next = new Node(5);
        printList(head);
        head = removeDuplicates(head);
        printList(head);
    }

    public static Node removeDuplicates(Node head) {
        Node curr = head;
        while (curr != null && curr.next != null) {
            if (curr.data == curr.next.data) {
                curr.next = curr.next.next;
            } else {
                curr = curr.next;
            }
        }
        return head;
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
