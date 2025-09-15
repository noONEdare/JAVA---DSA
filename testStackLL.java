class stackLL {
    Node top;

    void push(int x) {
        Node newnode = new Node(x);
        newnode.next = top;
        top = newnode;
    }

    int pop() {
        if (top == null) {
            System.out.println("Stack is empty...");
            return -1;
        }
        int val = top.data;
        top = top.next;
        return val;
    }

    int peek() {
        if (top == null) {
            System.out.println("Stack is empty...");
            return -1;
        }
        return top.data;
    }
}

public class testStackLL {
    public static void main(String[] args) {
        stackLL s = new stackLL();

        s.push(1);
        s.push(2);
        s.push(3);
        s.push(4);
        s.push(5);

        System.out.println("Top:" + s.peek());
        System.out.println("Pop:" + s.pop());
        System.out.println("Top Now:" + s.peek());
    }
}
