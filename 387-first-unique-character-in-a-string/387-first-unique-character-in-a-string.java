class Solution {
    public int firstUniqChar(String s) {
        
        Map<Character, Integer> m = new LinkedHashMap<>();
        
        for(char c: s.toCharArray())
            m.put(c, m.getOrDefault(c,0)+1);
        
        for( char key : m.keySet())
            if(m.get(key)==1) 
                return s.indexOf(key);
            
        return -1;
        
    }
}