class Solution {
    public String longestPalindrome(String s) {
        int end=0;
        int start=0;
        
        for( int i =0;i<s.length();i++){
            
            int len =expandFromCenter(i,i,s);
            int len2 =expandFromCenter(i,i+1,s);
            //racecar
            //taataikhj
             len = Math.max(len,len2);
            if(len > (end-start)){
                start= i-(len-1)/2;
                end = i+ len/2;
            }
        }
        
        return s.substring(start,end+1);
    }
    
    public int expandFromCenter(int left,int right,String s){
        int l =left;
        int r=right;
       
        while(l>=0 && r<=s.length()-1){
            
            if(s.charAt(l)==s.charAt(r)){
                l--;
                r++;
                
            }else break;
                
        }
        
        return r-l-1;
        
    }
}