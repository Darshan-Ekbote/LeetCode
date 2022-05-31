class Solution {
    public boolean canConstruct(String ransomNote, String magazine) {
        
        //base condition 
        if(ransomNote.length()> magazine.length()) return false;
        
        Map <Character, Integer> m = new HashMap<>();
        
        for( char c: magazine.toCharArray())
            m.put(c, m.getOrDefault(c,0)+1);
        
        for( char c : ransomNote.toCharArray()){
            
            if(m.containsKey(c) && m.get(c)>0){
                m.put(c, m.get(c)-1);
            }else
                return false;
            
        }
        
       return true;
        
    }
}