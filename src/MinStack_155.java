import java.util.*;

public class MinStack_155 {
    Stack<Integer> main = new Stack<>();
    Stack<Integer> minStack = new Stack<>();

    public MinStack_155() {}

    public void push(int x) {
        main.push(x);
        if (minStack.isEmpty() || x <= minStack.peek()) {
            minStack.push(x);
        }
    }

    public void pop() {
        if (main.pop().equals(minStack.peek())) {
            minStack.pop();
        }
    }

    public int top() {
        return main.peek();
    }

    public int getMin() {
        return minStack.peek();
    }
}
