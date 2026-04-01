// Last updated: 4/1/2026, 10:44:34 PM
import java.util.Deque;
import java.util.ArrayDeque;

class MyQueue {
    private Deque<Integer> st = new ArrayDeque<>();
    private Deque<Integer> stc = new ArrayDeque<>();

    public MyQueue() {
    }

    public void push(int x) {
        st.push(x);
    }

    public int pop() {
        move();
        return stc.pop();
    }

    public int peek() {
        move();
        return stc.peek();
    }

    public boolean empty() {
        return st.isEmpty() && stc.isEmpty();
    }

    private void move() {
        if (stc.isEmpty()) {
            while (!st.isEmpty()) {
                stc.push(st.pop());
            }
        }
    }
}
