import java.util.*;

class stackAL {
    ArrayList<Integer> stack;

    stackAL() {
        stack = new ArrayList<>();
    }

    void push(int x) {
        stack.add(x);
    }

    int pop() {
        if (stack.isEmpty()) {
            System.out.println("Stack Overflow...");
            return -1;
        }
        return stack.remove(stack.size() - 1);
    }

    int peek() {
        if (stack.isEmpty()) {
            System.out.println("Stack Overflow...");
            return -1;
        }
        return stack.get(stack.size() - 1);
    }
}

public class testStakAL {
    public static void main(String[] args) {
        stackAL s = new stackAL();

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
