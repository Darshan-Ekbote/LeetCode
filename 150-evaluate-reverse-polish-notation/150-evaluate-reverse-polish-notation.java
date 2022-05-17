class Solution {
    public int evalRPN(String[] tokens) {
        
        String operators = "+-*/";
        Stack <Integer> st = new Stack<Integer>();
        for(String t : tokens){
            //it token is operator, pop two elements from the stack and push result back onto the stack
            if(operators.contains(t)){
                
                if(st.size()>= 2){
                    int n1 = st.pop();
                    int n2 = st.pop();
                    switch(t){
                            
                        case "/": 
                            st.push(n2 /n1);
                            break;
                        case "-": 
                            st.push(n2-n1);
                            break;
                        case "+": 
                            st.push(n2+n1);
                            break;
                        case "*": 
                            st.push(n2*n1);
                            break;
                    }
                    
                }// else invalid operation as 2 number are not availbale
                
                
            }else{ // just add the numbers to stack
                st.push(Integer.valueOf(t));
            }
        }
        
        return st.isEmpty()? 0 :st.pop();
    }
}