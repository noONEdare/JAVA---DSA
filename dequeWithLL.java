class DNode {
    int data;
    DNode next, prev;

    DNode(int d) {
        data = d;
        next = prev = null;
    }
}

class DequeLL {
    DNode front, rear;

    void insertFront(int x) {
        DNode newNode = new DNode(x);
        if (front == null) {
            front = rear = newNode;
            return;
        }
        newNode.next = front;
        front.prev = newNode;
        front = newNode;
    }

    void insertRear(int x) {
        DNode newNode = new DNode(x);
        if (rear == null) {
            front = rear = newNode;
            return;
        }
        rear.next = newNode;
        newNode.prev = rear;
        rear = newNode;
    }

    void deleteFront() {
        if (front == null)
            return;
        front = front.next;
        if (front != null) {
            front.prev = null;
        } else {
            rear = null;
        }
    }

    void deleteRear() {
        if (rear == null)
            return;

        rear = rear.prev;

        if (rear != null) {
            rear.next = null;
        } else {
            front = null;
        }
    }

    void display() {
        DNode temp = front;
        while (temp != null) {
            System.out.print(temp.data + " ");
            temp = temp.next;
        }
        System.out.println();
    }
}

public class dequeWithLL {
    public static void main(String[] args) {
        DequeLL dq = new DequeLL();

        dq.insertFront(3);
        dq.insertFront(2);
        dq.insertFront(1);
        dq.display();
        dq.insertRear(4);
        dq.insertRear(5);
        dq.insertRear(6);
        dq.display();

        dq.deleteFront();
        dq.deleteRear();
        dq.display();
    }
}