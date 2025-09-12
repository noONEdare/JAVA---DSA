class Node {
    int data;
    Node next;

    Node(int data) {
        this.data = data;
        this.next = null;
    }
}

public class floydAlgorithm {
    Node head;

    public void insert(int data) {
        Node newhead = new Node(data);
        newhead.next = head;
        head = newhead;
    }

    public static Node meatingPoint(Node head) {
        if (head == null || head.next == null)
            return null;
        Node slow = head;
        Node fast = head;
        while (fast.next != null && fast.next.next != null) {
            slow = slow.next;
            fast = fast.next.next;

            if (slow == fast) {
                return slow;
            }
        }
        return null;
    }

    public boolean detectCycle() {
        return meatingPoint(head) != null;
    }

    public void endCycle() {
        Node slow = head;
        Node meat = meatingPoint(head);
        if (meat == null) {
            System.out.println("Did not detect any cycle...");
            return;
        }
        if (meat != null) {

            while (slow != meat) {
                slow = slow.next;
                meat = meat.next;
            }
            Node loopStart = slow;
            Node temp = loopStart;

            while (temp.next != loopStart) {
                temp = temp.next;
            }
            temp.next = null;
        }
    }

    public void printList() {
        Node temp = head;
        while (temp != null) {
            System.out.print(temp.data + "->");
            temp = temp.next;
        }
        System.out.println("NULL");
    }

    public static void main(String[] args) {
        floydAlgorithm list = new floydAlgorithm();
        list.insert(6);
        list.insert(5);
        list.insert(4);
        list.insert(3);
        list.insert(2);
        list.insert(1);

        list.printList();

        list.head.next.next.next.next.next = list.head.next.next;

        boolean cycle = list.detectCycle();
        System.out.println("Cycle detected:" + cycle);
        // list.printList();

        list.endCycle();
        list.printList();
    }
}
