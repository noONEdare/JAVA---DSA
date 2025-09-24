class DequeArray {
    int[] arr;
    int front, rear, size;

    DequeArray(int n) {
        arr = new int[n];
        size = n;
        front = -1;
        rear = -1;
    }

    void insertFront(int x) {
        if ((front == 0 && rear == -1) || (front == rear + 1)) {
            System.out.println("Deque is full");
            return;
        }
        if (front == -1) {
            front = rear = 0;
        } else if (front == 0) {
            front = size - 1;
        } else {
            front--;
        }
        arr[front] = x;
    }

    void insertRear(int x) {
        if ((front == 0 && rear == -1) || (front == rear + 1)) {
            System.out.println("Deque is full");
            return;
        }
        if (front == -1) {
            front = rear = 0;
        } else if (rear == size - 1) {
            rear = 0;
        } else {
            rear++;
        }
        arr[rear] = x;
    }

    void deleteFront() {
        if (front == -1) {
            System.out.println("Queue is empty");
            return;
        }
        if (front == rear) {
            front = rear = -1;
        } else if (front == size - 1) {
            front = 0;
        } else {
            front++;
        }
    }

    void deleteRear() {
        if (front == -1) {
            System.out.println("Queue is empty");
            return;
        }
        if (front == rear) {
            front = rear = -1;
        } else if (rear == 0) {
            rear = size - 1;
        } else {
            rear--;
        }
    }

    int getFront() {
        if (front == -1)
            return -1;
        return arr[front];
    }

    int getRear() {
        if (rear == -1)
            return -1;
        return arr[rear];
    }
}

public class dequeWithArray {
    public static void main(String[] args) {
        DequeArray q = new DequeArray(5);

        q.insertFront(2);
        q.insertFront(1);
        q.insertRear(3);
        q.insertRear(4);

        System.out.println(q.getRear());
        System.out.println(q.getFront());

        q.deleteFront();
        q.deleteRear();

        System.out.println(q.getRear());
        System.out.println(q.getFront());
    }
}