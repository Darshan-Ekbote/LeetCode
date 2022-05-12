class Solution {
    public String frequencySort(String s) {
        
       
        Map<Character , Integer> hm = new HashMap<>();
        
         //use HM for freq
        for( char c: s.toCharArray() )
            hm.put(c, hm.getOrDefault(c,0)+1);
     
        //sort hm based on values
        List<Character> freq = new ArrayList<> (hm.keySet());
        Collections.sort( freq, (a,b)-> hm.get(b)-hm.get(a));
        
        //create a sb here
        StringBuilder sb = new StringBuilder();
        
        for( char c: freq){
            
            int count = hm.get(c);
            for( int i =0;i<count;i++)
                sb.append(c);
            
        }
        
        return sb.toString();        
        
        
    }
}