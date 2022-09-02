class Solution {
    public boolean isValid(String st) {
        
        HashMap<Character,Character> maps=new HashMap<Character,Character>();
        maps.put(')','(');
        maps.put(']','[');
        maps.put('}','{');
        
        Stack<Character> stack=new Stack<Character>();
        
        for(char c:st.toCharArray()){
            
            if(maps.containsKey(c)){
                
                if(stack.empty()||stack.pop()!=maps.get(c))
                    return false;
            }
            else
                stack.push(c);
        }
        return stack.empty();
}
}