import java.util.*;

// there will be two approaches: 1 for costly enqueue and 2 for costly dequeue...
class queueWithStack {
    Stack<Integer> s1 = new Stack<>();
    Stack<Integer> s2 = new Stack<>();

    boolean isEmpty() {
        return s1.isEmpty();
    }

    // approach 1:
    void enqueue1(int x) {
        while (!s1.isEmpty()) {
            s2.push(s1.pop());
        }

        s1.push(x);

        while (!s2.isEmpty()) {
            s1.push(s2.pop());
        }
    }

    int dequeue1() {
        if (s1.isEmpty()) {
            return -1;
        }
        return s1.pop();
    }

    int peek1() {
        if (s1.isEmpty()) {
            return -1;
        }
        return s1.peek();
    }

    // approach 2:
    void enqueue2(int x) {
        s1.push(x);
    }

    int dequeue2() {
        if (s1.isEmpty() && s2.isEmpty()) {
            return -1;
        }
        if (s2.isEmpty()) {
            while (!s1.isEmpty()) {
                s2.push(s1.pop());
            }
        }
        return s2.pop();
    }

    int peek2() {
        if (s1.isEmpty() && s2.isEmpty()) {
            return -1;
        }
        if (s2.isEmpty()) {
            while (!s1.isEmpty()) {
                s2.push(s1.pop());
            }
        }
        return s2.peek();
    }
}

public class twoStackQueue {
    public static void main(String[] args) {
        queueWithStack q = new queueWithStack();

        q.enqueue1(1);
        q.enqueue1(2);
        q.enqueue1(3);
        q.enqueue1(4);
        q.enqueue1(5);

        System.out.println("Approach 1:");

        System.out.println("peek:" + q.peek1());
        System.out.println("dequeue:" + q.dequeue1());
        System.out.println("peek:" + q.peek1());
        System.out.println("dequeue:" + q.dequeue1());
        System.out.println("dequeue:" + q.dequeue1());
        System.out.println("dequeue:" + q.dequeue1());
        System.out.println("dequeue:" + q.dequeue1());

        q.enqueue2(1);
        q.enqueue2(2);
        q.enqueue2(3);
        q.enqueue2(4);
        q.enqueue2(5);

        System.out.println("Approach 2:");

        System.out.println("peek:" + q.peek2());
        System.out.println("dequeue:" + q.dequeue2());
        System.out.println("peek:" + q.peek2());
        System.out.println("dequeue:" + q.dequeue2());
        System.out.println("dequeue:" + q.dequeue2());
        System.out.println("dequeue:" + q.dequeue2());
        System.out.println("dequeue:" + q.dequeue2());
    }
}