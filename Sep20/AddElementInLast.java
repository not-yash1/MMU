
class Node {
    int data;
    Node next;
    Node(int d) {
        data = d;
        next = null;
    }
}

public record AddElementInLast() {

    public static void main(String[] args) {
        Node head = new Node(1);
        head.next = new Node(2);
        head.next.next = new Node(3);
        head.next.next.next = new Node(4);
        head.next.next.next.next = new Node(5);
        printList(head);
        head = insert(head, 6);
        printList(head);
    }

    public static Node insert(Node head, int data) {
        Node new_node = new Node(data);
        if (head == null) {
            head = new_node;
            return head;
        }
        Node curr = head;
        while (curr.next != null) {
            curr = curr.next;
        }
        curr.next = new_node;
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
