class Solution {
    public int countSubstrings(String s) {
        
        int palindromes =0;
        
        for( int i =0;i< s.length();i++){
            
            //for odd length string
            palindromes +=expandAroundCenter(s, i ,i );
            
            //for even length string
           palindromes += expandAroundCenter (s,i,i+1);
            
        }
        
        return palindromes;
            
    }
    
    public int expandAroundCenter( String s, int l , int h){
         int count=0;
        
        while( l >=0 && h< s.length()){
            
            if(s.charAt(l)!=s.charAt(h))
                return count;
            
            l--;
            h++;
            count++;
        }
        
        return count;
    }
}