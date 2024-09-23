package Sep23;
public class DeleteNode {
    public static void main(String[] args) {
        Node head = new Node(1);
        head.next = new Node(2);
        head.next.next = new Node(3);
        head.next.next.next = new Node(4);
        head.next.next.next.next = new Node(5);
        deleteNode(head, 3);
        printList(head);
    }

    public static void deleteNode(Node head, int pos) {
        if (pos == 0) {
            head = head.next;
            return;
        }
        Node curr = head;
        for (int i = 0; i < pos - 1; i++) {
            curr = curr.next;
        }
        curr.next = curr.next.next;
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
