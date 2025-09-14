class Node {
    int data;
    Node next;

    Node(int data) {
        this.data = data;
        this.next = null;
    }
}

public class mergingTwoLL {
    Node head;

    public static Node mergeSortedLists(Node headA, Node headB) {
        Node dummy = new Node(-1);
        Node tail = dummy;

        while (headA != null && headB != null) {
            if (headA.data <= headB.data) {
                tail.next = headA;
                headA = headA.next;
            } else {
                tail.next = headB;
                headB = headB.next;
            }
            tail = tail.next;
        }
        if (headA != null)
            tail.next = headA;
        if (headB != null)
            tail.next = headB;

        return dummy.next;
    }

    public void printList(Node head) {
        if (head == null) {
            return;
        }
        Node temp = head;
        while (temp != null) {
            System.out.print(temp.data + "->");
            temp = temp.next;
        }
        System.out.println("NULL");
    }

    public static void main(String[] args) {
        mergingTwoLL function = new mergingTwoLL();
        Node l1 = new Node(1);
        l1.next = new Node(3);
        l1.next.next = new Node(5);
        l1.next.next.next = new Node(7);
        function.printList(l1);

        Node l2 = new Node(2);
        l2.next = new Node(4);
        l2.next.next = new Node(6);
        function.printList(l2);

        Node l3 = mergeSortedLists(l1, l2);
        function.printList(l3);
    }
}
