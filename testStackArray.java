class stackArray {
    int[] arr;
    int top;
    int capacity;

    stackArray(int size) {
        arr = new int[size];
        capacity = size;
        top = -1;
    }

    int push(int x) {
        if (top == capacity - 1) {
            System.out.println("Stack overflow...");
        }
        arr[++top] = x;
        return x;
    }

    int pop() {
        if (isEmpty()) {
            System.out.println("Stack is empty...");
            return -1;
        }
        return arr[top--];
    }

    int peek() {
        if (isEmpty()) {
            System.out.println("Stack is empty...");
            return -1;
        }
        return arr[top];
    }

    boolean isEmpty() {
        return top == -1;
    }

    void printStack() {
        if (isEmpty()) {
            System.out.println("Stack is empty...");
            return;
        }
        int temp = top;
        for (int i = 0; i < capacity; i++) {
            System.out.print(arr[i] + " ");
            temp = temp--;
        }
        System.out.println();
    }
}

public class testStackArray {
    public static void main(String[] args) {
        stackArray s = new stackArray(5);

        s.push(1);
        s.push(2);
        s.push(3);
        s.push(4);

        s.printStack();

        System.out.println("Top:" + s.peek());
        System.out.println("Push:" + s.push(5));
        System.out.println("Top now:" + s.peek());
        System.out.println("Pop:" + s.pop());
        System.out.println("Top now:" + s.peek());

    }
}