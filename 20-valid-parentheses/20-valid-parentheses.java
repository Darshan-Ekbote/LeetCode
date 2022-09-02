class Solution {
    public boolean isValid(String st) {
        
        Stack <Character>s = new Stack <Character>();
        
        for(char c: st.toCharArray()){
            
           if(c==')') {
               if(!s.isEmpty() ){
                   char ch =s.peek();
               if(ch=='(')
                 s.pop();
                else
                   s.push(c);
               }else
                   s.push(c);
        } else if(c=='}') {
                if(!s.isEmpty()){
                 char ch =s.peek();
               if(ch=='{')
                 s.pop(); 
                else
                   s.push(c);
                }else
                   s.push(c);
               
        } else if(c==']') {
               if(!s.isEmpty()){
                  char ch =s.peek();
               if(ch=='[')
                 s.pop(); 
                else
                   s.push(c);  
               }else
                   s.push(c);
             
        }else 
               s.push(c);
    }
        
        return s.isEmpty();
}
}