// Finding the intersection point in to different 
class Node {
    int data;
    Node next;

    Node(int data) {
        this.data = data;
        this.next = null;
    }
}

public class LLadvanced {
    Node head;

    public Node findIntersection(Node head1, Node head2) {
        if (head1 == null || head2 == null)
            return null;

        Node a = head1;
        Node b = head2;
        while (a != b) {
            a = (a == null) ? head2 : a.next;
            b = (b == null) ? head1 : b.next;
        }
        return a;
    }

    // To print the LL:
    public void printList(Node head) {
        Node temp = head;
        if (head == null) {
            System.out.println("List is empty");
        }
        while (temp != null) {
            System.out.print(temp.data + "->");
            temp = temp.next;
        }
        System.out.println("NULL");
    }

    public static void main(String[] args) {
        LLadvanced function = new LLadvanced();

        // making a LL which will common in both l1 and l2:
        Node common = new Node(7);
        common.next = new Node(8);
        common.next.next = new Node(9);

        // making LL -> l1:
        Node l1 = new Node(1);
        l1.next = new Node(3);
        l1.next.next = new Node(5);
        l1.next.next.next = common;
        System.out.print("List A: ");
        function.printList(l1);

        // making LL -> l2:
        Node l2 = new Node(2);
        l2.next = new Node(4);
        l2.next.next = new Node(6);
        l2.next.next.next = common;
        System.out.print("List B: ");
        function.printList(l2);

        Node intercetion = function.findIntersection(l1, l2);
        if (intercetion != null) {
            System.out.println("The intesection is at: " + intercetion.data);
        } else {
            System.out.println("There is no intersection...");
        }

    }
}