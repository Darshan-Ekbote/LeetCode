class Solution {
    public boolean isPalindrome(String s) {
     s=s.replaceAll("[^a-zA-Z0-9]", "");
     s= s.replaceAll(" ","");
     s=s.toLowerCase();
        
      int len = s.length();  
        int l = 0;
        int r = len-1;
        while( r>=l){
            
            if(s.charAt(l)!= s.charAt(r) )
                return false;
            
            l++;
            r--;
        }
        
        return true;
    }
    
    
}