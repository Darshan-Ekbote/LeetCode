class Solution {
    public int lengthOfLongestSubstring(String s) {
        int len= s.length();
         if(len==1|| len==0)
          return len;
        
        ArrayList <Integer> al = new ArrayList<>();
        
        for(int i=0;i< len;i++){
            al.add(slidingWindow(s,i));
        }
        return Collections.max(al);
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