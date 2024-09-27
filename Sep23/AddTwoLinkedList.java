package Sep23;

class Node {
    int data;
    Node next;
    Node(int d) {
        data = d;
        next = null;
    }
}

public class AddTwoLinkedList {

    public static void main(String[] args) {
        Node head1 = new Node(2);
        head1.next = new Node(4);
        head1.next.next = new Node(3);
        Node head2 = new Node(5);
        head2.next = new Node(6);
        head2.next.next = new Node(4);
        printList(head1);
        printList(head2);
        head1 = reverse(head1);
        head1 = reverse(head2);
        // head1 = insert(head1, 7);
        // printList(head1);
        // head2 = insert(head2, 8);
        // printList(head2);
        Node head = addTwoLists(head1, head2);
        printList(head);
        head = reverse(head);
        printList(head);
    }

    public static Node reverse(Node head) {
        Node prev = null;
        Node curr = head;
        while (curr != null) {
            Node next = curr.next;
            curr.next = prev;
            prev = curr;
            curr = next;
        }
        head = prev;
        return head;
    }

    public static Node addTwoLists(Node head1, Node head2) {
        Node dummy = new Node(0);
        Node tail = dummy;
        int carry = 0;
        while (head1 != null || head2 != null || carry != 0) {
            int sum = carry;
            if (head1 != null) {
                sum += head1.data;
                head1 = head1.next;
            }
            if (head2 != null) {
                sum += head2.data;
                head2 = head2.next;
            }
            carry = sum / 10;
            tail.next = new Node(sum % 10);
            tail = tail.next;
        }
        return dummy.next;
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
