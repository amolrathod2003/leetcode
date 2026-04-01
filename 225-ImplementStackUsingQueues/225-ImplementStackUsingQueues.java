// Last updated: 4/1/2026, 10:44:39 PM
class MyStack {

        private Deque<Integer> dq=new ArrayDeque<>();
        private Deque<Integer> main=new ArrayDeque<>();
    public MyStack() {
        
    }
    
    public void push(int x) {
        main.offer(x);
        while(!dq.isEmpty()){
            main.offer(dq.poll());
        }
        Deque<Integer> temp = dq;
        dq=main;
        main=temp;
        
    }
    
    public int pop() {
        return dq.poll();
    }
    
    public int top() {
        return dq.peek();
        
    }
    
    public boolean empty() {
        return dq.isEmpty();
        
    }
}

/**
 * Your MyStack object will be instantiated and called as such:
 * MyStack obj = new MyStack();
 * obj.push(x);
 * int param_2 = obj.pop();
 * int param_3 = obj.top();
 * boolean param_4 = obj.empty();
 */