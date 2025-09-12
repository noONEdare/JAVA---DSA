class Node {
    int data;
    Node next;

    Node(int data) {
        this.data = data;
        this.next = null;
    }
}

public class LLoperations {
    Node head;

    // insert at head:
    public void insertAtHead(int data) {
        Node newNode = new Node(data);
        newNode.next = head;
        head = newNode;
    }

    // insert at tail or last:
    public void insertAtLast(int data) {
        Node newNode = new Node(data);
        if (head == null) {
            head = newNode;
            return;
        }
        Node temp = head;
        while (temp.next != null) {
            temp = temp.next;
        }
        temp.next = newNode;
    }

    // insert at index:
    public void insertAtIndex(int index, int data) {
        if (index == 0) {
            insertAtHead(data);
            return;
        }
        Node newNode = new Node(data);
        Node temp = head;
        for (int i = 0; temp != null && i < index - 1; i++) {
            temp = temp.next;
        }
        if (temp == null) {
            System.out.println("Index out of bound...");
            return;
        }
        newNode.next = temp.next;
        temp.next = newNode;
    }

    // delete head:
    public void deleteHead() {
        if (head == null)
            return;
        head = head.next;
    }

    // delete tail:
    public void deleteTail() {
        if (head == null)
            return;
        if (head.next == null) {
            head = null;
            return;
        }
        Node temp = head;
        while (temp.next.next != null) {
            temp = temp.next;
        }
        temp.next = null;
    }

    // delete at index:
    public void deleteAtIndex(int index) {
        if (head == null)
            return;
        if (index == 0) {
            deleteHead();
            return;
        }
        Node temp = head;
        for (int i = 0; temp != null && i < index - 1; i++) {
            temp = temp.next;
        }
        if (temp == null || temp.next == null) {
            System.out.println("Inex out of bound...");
            return;
        }
        temp.next = temp.next.next;
    }

    // search for a value:
    public boolean search(int key) {
        Node temp = head;
        while (temp != null) {
            if (temp.data == key)
                return true;
            temp = temp.next;
        }
        return false;
    }

    // reverse the list:
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

    // reversing half of LL:
    public Node reverseMid(Node head) {
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
        return prev;
    }

    // print list:
    public void printList() {
        Node temp = head;
        while (temp != null) {
            System.out.print(temp.data + "->");
            temp = temp.next;
        }
        System.out.println("NULL");
    }

    // checking If the LL is palindrome:
    public boolean isPalindrome() {
        if (head == null || head.next == null)
            return true;
        Node middle = findMiddle(head);
        Node SHF = reverseMid(middle.next);
        Node FHF = head;

        boolean palindrome = true;
        Node temp = SHF;

        while (SHF != null) {
            if (FHF.data != SHF.data) {
                palindrome = false;
                break;
            }
            FHF = FHF.next;
            SHF = SHF.next;
        }
        middle.next = reverseMid(temp);
        return palindrome;
    }

    // finding middle of LL:
    public Node findMiddle(Node head) {
        Node turtle = head;
        Node hare = head;

        while (hare.next != null && hare.next.next != null) {
            hare = hare.next.next;
            turtle = turtle.next;
        }
        return turtle;
    }

    public static void main(String[] args) {
        // all basic operations on LinkedList...

        LLoperations list = new LLoperations();
        list.insertAtHead(20);
        list.insertAtHead(10);
        list.insertAtLast(40);
        list.insertAtIndex(2, 30);

        list.printList();

        list.reverse();
        list.printList();

        list.deleteAtIndex(2);
        list.printList();

        list.deleteHead();
        list.printList();

        list.deleteTail();
        list.printList();

        System.out.println("search for 30:" + list.search(30));
        System.out.println("search for 50:" + list.search(50));

        // checking if the Linked List is palindrome...

        LLoperations palindromeLL = new LLoperations();
        palindromeLL.insertAtHead(1);
        palindromeLL.insertAtHead(2);
        palindromeLL.insertAtHead(3);
        palindromeLL.insertAtHead(2);
        palindromeLL.insertAtHead(1);

        palindromeLL.printList();

        System.out.println("The LL is palindrome??:" + palindromeLL.isPalindrome());

    }
}
