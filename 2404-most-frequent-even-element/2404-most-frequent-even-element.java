class Solution {
    public int mostFrequentEven(int[] nums) {
        
        Map <Integer, Integer> m = new TreeMap <>();
        
        int min = Integer.MAX_VALUE;
        int freq = Integer.MIN_VALUE;
        
        for( int n:nums)
                m.put(n,m.getOrDefault(n,0)+1);
            
        
        for( int key: m.keySet()){
            
            if(key%2 ==0 ) {
                    //get the max freq
            if(m.get(key)>freq) {
                freq= m.get(key);
                
               
                    min= key;
            }
            }
            
            
            
        }
        
        return min==Integer.MAX_VALUE ? -1: min;
        
    }
}