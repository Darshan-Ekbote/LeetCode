class Solution {
    public String removeStars(String s) {
        
      
        if (s == null || s.length() == 0) {
            return "";
        }
        Stack<Character> stack = new Stack<>();
        
        for (char ch : s.toCharArray()) {
            if (ch == '*') {
                stack.pop();
            }
            else {
                stack.push(ch);
            }
        }
        
        StringBuilder sb = new StringBuilder();
        
        while (!stack.isEmpty()) {
            char current = stack.pop();
            sb.append(current);
        }
        
        return sb.reverse().toString();
    
        
    }
}