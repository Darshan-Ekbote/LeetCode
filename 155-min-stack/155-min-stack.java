class MinStack {

    
    // 0th --> current and 1st --> min
    Stack <int[]> st;
    public MinStack() {
        st = new Stack<>();
    }
    
    public void push(int val) {
        if(st.isEmpty()){
            st.add( new int[]{val,val});
            return;
        }
        int min= st.peek()[1];
        st.add( new int[]{ val, Math.min(min,val)});
    }
    
    public void pop() {
        if(!st.isEmpty()) st.pop();
        else return ;
    }
    
    public int top() {
        return st.peek()[0]; //get current top
    }
    
    public int getMin() {
        return st.peek()[1]; //get all time minimum from here 
    }
}

/**
 * Your MinStack object will be instantiated and called as such:
 * MinStack obj = new MinStack();
 * obj.push(val);
 * obj.pop();
 * int param_3 = obj.top();
 * int param_4 = obj.getMin();
 */