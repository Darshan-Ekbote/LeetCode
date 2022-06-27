class MaxStack {

    List<Integer> st; 
    int maxIndex=-1;
    
    public MaxStack() { 
        st =  new ArrayList<>();
    }
    
    public void push(int x) {
        st.add(x); 
    }
    
    public int pop() {
         return st.remove(st.size()-1);
    }
    
    public int top() {
        int popped= st.get(st.size()-1);
     return popped;
    }
        
    
    public int peekMax() {
        int max= Integer.MIN_VALUE;
        
        for( int i=0;i<st.size();i++){
            if(st.get(i)>=max){
                max=st.get(i);
                maxIndex=i;
            }
        }
        return max;
    }
    
    public int popMax() {
       int maxElement= peekMax();
       int popped = st.remove(maxIndex);
        
       return popped;
    }
}

/**
 * Your MaxStack object will be instantiated and called as such:
 * MaxStack obj = new MaxStack();
 * obj.push(x);
 * int param_2 = obj.pop();
 * int param_3 = obj.top();
 * int param_4 = obj.peekMax();
 * int param_5 = obj.popMax();
 */