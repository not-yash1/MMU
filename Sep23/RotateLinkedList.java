package Sep23;

class Node {
    int data;
    Node next;
    Node(int d) {
        data = d;
        next = null;
    }
}

public class RotateLinkedList {
    public static void main(String[] args) {
        Node head = new Node(1);
        head.next = new Node(2);
        head.next.next = new Node(3);
        head.next.next.next = new Node(4);
        head.next.next.next.next = new Node(5);
        head = rotate(head, 2);
        printList(head);
    }

    public static Node rotate(Node head, int k) {
        Node curr = head;
        int len = 0;
        while (curr != null) {
            len++;
            curr = curr.next;
        }
        k = k % len;
        if (k == 0) {
            return head;
        }
        curr = head;
        while (k > 1) {
            curr = curr.next;
            k--;
        }
        Node newHead = curr.next;
        curr.next = null;
        curr = newHead;
        while (curr.next != null) {
            curr = curr.next;
        }
        curr.next = head;
        return newHead;
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
