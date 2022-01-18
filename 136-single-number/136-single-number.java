class Solution {
    public int singleNumber(int[] nums) {
        Map<Integer,Integer> counter  = new HashMap<>();
        for( int n : nums)
           counter.put(n,counter.getOrDefault(n,0)+1);
        
        for( int key : counter.keySet())
            if(counter.get(key)==1)
                return key;
        
        
        return -1;
    }
}