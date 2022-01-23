class Solution {
    public List<Integer> findAnagrams(String s, String p) {
    List <Integer> res= new ArrayList<Integer>();
        
    for( int i =0; i< s.length()- p.length()+1;i++) {
        int index= slidingWindow(s,p,i);
        if(index  !=-1 )
            res.add(index);
        
    }
        return res;
        
    }
    
    
    public int  slidingWindow(String str,String p, int i) {
        String s = str.substring(i,i+p.length());
        int  [] charArray = new int[26];
      for( int k=0 ;k< p.length();k++){
          char c= s.charAt(k);
          int a= c-97;
          charArray[a]++;
      }
        int count=0;
         for( int k=0 ;k< p.length();k++){
             char ch = p.charAt(k);
             
             if(charArray[ch-97]==0) break;
             else{
                 charArray[ch-97]--;
                  count++;
             }
            
      }
           return count == p.length() ? i:-1; 
        
    }
}