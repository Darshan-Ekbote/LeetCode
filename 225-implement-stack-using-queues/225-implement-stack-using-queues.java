class MyStack {

    
    Deque <Integer> q  ;
    public MyStack() {
        q = new ArrayDeque<>();
    }
    
    public void push(int x) {
        q.add(x);
    }
    
    public int pop() {
        if(q.isEmpty()) return -1;
        else return q.removeLast();
    }
    
    public int top() {
        if(q.isEmpty()) return -1;
        else return q.getLast();
    }
    
    public boolean empty() {
        return q.isEmpty();
    }
}
// 2 -> 1 
// 
/**
 * Your MyStack object will be instantiated and called as such:
 * MyStack obj = new MyStack();
 * obj.push(x);
 * int param_2 = obj.pop();
 * int param_3 = obj.top();
 * boolean param_4 = obj.empty();
 */