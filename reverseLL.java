//Reversing the list using both recuesion and loop:
class Node {
    int data;
    Node next;

    Node(int data) {
        this.data = data;
        this.next = null;
    }
}

public class reverseLL {
    static Node head;

    // with recursion:
    public Node recurciveReverse(Node head) {
        if (head == null || head.next == null)
            return head;

        Node newHead = recurciveReverse(head.next);

        head.next.next = head;
        head.next = null;

        return newHead;
    }

    // with loop:
    public void reverse() {
        Node prev = null;
        Node curr = head;
        Node next = null;
        while (curr != null) {
            next = curr.next;
            curr.next = prev;
            prev = curr;
            curr = next;
        }
        head = prev;
    }

    // for insertion:
    public void insert(int data) {
        Node newhead = new Node(data);
        if (head == null) {
            head = newhead;
        } else {
            newhead.next = head;
            head = newhead;
        }
    }

    // for printing the list:
    public void printList() {
        if (head == null) {
            System.out.println("List is empty...");
        }
        Node temp = head;
        while (temp != null) {
            System.out.print(temp.data + "->");
            temp = temp.next;
        }
        System.out.println("NULL");
    }

    public static void main(String[] args) {
        reverseLL list = new reverseLL();
        list.insert(10);
        list.insert(20);
        list.insert(30);
        list.insert(40);
        list.insert(50);
        list.printList();

        head = list.recurciveReverse(head);
        list.printList();

        list.reverse();
        list.printList();
    }
}
