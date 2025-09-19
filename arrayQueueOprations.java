class Queue {
    int[] arr;
    int size;
    int front, rear;

    Queue(int size) {
        arr = new int[size];
        this.size = size;
        front = 0;
        rear = -1;
    }

    void enqueue(int data) {
        if (rear == size - 1) {
            System.out.println("Queue is full...");
            return;
        }
        arr[++rear] = data;
    }

    int dequeue() {
        if (front > rear) {
            System.out.println("Queue is empty");
            return -1;
        }
        int removed = arr[front];
        for (int i = 0; i < rear; i++) {
            arr[i] = arr[i + 1];
        }
        rear--;
        return removed;
    }

    int peak() {
        if (front > rear) {
            System.out.println("Queue is empty");
            return -1;
        }
        return arr[front];
    }
}

public class arrayQueueOprations {
    public static void main(String[] args) {
        Queue q = new Queue(5);

        q.enqueue(1);
        q.enqueue(2);
        q.enqueue(3);
        q.enqueue(4);
        q.enqueue(5);

        System.out.println("Peak:"+q.peak());
        System.out.println("Removed:" + q.dequeue());
        System.out.println("Peak:"+q.peak());
        System.out.println("Removed:" + q.dequeue());
        System.out.println("Peak:"+q.peak());
    }
}
