class Solution {
    public char findTheDifference(String s, String t) {
        
        Map<Character,Integer> m = new HashMap<Character,Integer>();
        
        for( char c : s.toCharArray())
            m.put( c, m.getOrDefault(c,0)+1);
        
         for( char c : t.toCharArray()){
             
             if( !m.containsKey(c))
                 return c;
             else{
                 
                 if(m.get(c)==0)
                     return c;
                 else
                     m.put(c, m.getOrDefault(c,0)-1);
             }
         }
        
        return '-';
            
    }
}