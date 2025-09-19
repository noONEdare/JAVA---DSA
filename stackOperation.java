// Q1)Push an element from bottom of the stack ...AND Q2) reverse the stck...
import java.util.Stack;

public class stackOperation {
    //Q1:
    public static void pushAtBottom(Stack<Integer> s, int x){
        if(s.isEmpty()){
            s.push(x);
            return;
        }
        int top = s.pop();
        pushAtBottom(s, x);
        s.push(top);

    }
    // Q2):
    public static void reverseStack(Stack<Integer> s){
        if(s.isEmpty())return;
        int top = s.pop();
        reverseStack(s);
        pushAtBottom(s, top);
    }
    public static void main(String[] args) {
        Stack<Integer> s = new Stack<>();
        s.push(1);
        s.push(2);
        s.push(3);
        s.push(4);

        System.out.println(s);
        pushAtBottom(s,5);
        System.out.println(s);
        reverseStack(s);
        System.out.println(s);
    }
}
