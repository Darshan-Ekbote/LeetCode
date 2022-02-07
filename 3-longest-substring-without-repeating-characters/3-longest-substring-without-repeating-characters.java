class Solution {
    public int lengthOfLongestSubstring(String s) {
        int len= s.length();
         if(len==1|| len==0)
          return len;
        
        int maxLen =0;
        for(int i=0;i< len;i++){
           int slen = slidingWindow(s,i);
            if( maxLen<slen)
                maxLen = slen;
        }
        return maxLen;
    }
    
    int slidingWindow(String s, int j){
        Map <Character, Integer> m = new <Character,Integer> HashMap();
        
        int index=0;
        for(int i=j;i<s.length();i++){
           
            if(m.containsKey(s.charAt(i)))
                break;
            else
                m.put(s.charAt(i),1 );
            
            index++;
        }
       return index; 
    }
}