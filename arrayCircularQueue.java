class Queue {
    int[] arr;
    int size;
    int front, rear;

    Queue(int size) {
        arr = new int[size];
        this.size = size;
        front = -1;
        rear = -1;
    }

    boolean isEmpty() {
        return (front == -1 && rear == -1);
    }

    boolean isFull() {
        return ((rear + 1) % size == front);
    }

    void enqueue(int data) {
        if (isFull()) {
            System.out.println("Queue is Full");
            return;
        }
        if (isEmpty()) { // first element
            front = 0;
        }
        rear = (rear + 1) % size;
        arr[rear] = data;
    }

    int dequeue() {
        if (isEmpty()) {
            System.out.println("Queue is empty");
            return -1;
        }
        int deleted = arr[front];
        if (front == rear) { // last element
            front = -1;
            rear = -1;
        } else {
            front = (front + 1) % size;
        }
        return deleted;
    }

    int peak() {
        if (isEmpty()) {
            System.out.println("Queue is empty");
            return -1;
        }
        return arr[front];
    }

    void display() {
        if (isEmpty()) {
            System.out.println("Queue is empty");
            return;
        }
        int i = front;
        System.out.print("Queue: ");
        while (true) {
            System.out.print(arr[i] + " ");
            if (i == rear)
                break;
            i = (i + 1) % size;
        }
        System.out.println();
    }
}

public class arrayCircularQueue {
    public static void main(String[] args) {
        Queue q = new Queue(5);

        q.enqueue(1);
        q.enqueue(2);
        q.enqueue(3);
        q.enqueue(4);
        q.enqueue(5);

        q.display();

        System.out.println("peak:" + q.peak());
        System.out.println("dequeue:" + q.dequeue());
        System.out.println("peak:" + q.peak());
        System.out.println("dequeue:" + q.dequeue());
        System.out.println("peak:" + q.peak());

        q.enqueue(6);
        q.enqueue(7);
        
        System.out.println("dequeue:" + q.dequeue());
        System.out.println("peak:" + q.peak());
        
        q.enqueue(8);

        q.display();
    }
}