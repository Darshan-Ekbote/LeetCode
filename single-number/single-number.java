class Solution {
    public int singleNumber(int[] nums) {
        Map <Integer,Integer> m = new HashMap<>();
        
        for( int i=0;i< nums.length;i++ )
                m.put(nums[i],m.getOrDefault(nums[i],0)+1);
        
        for( int k : m.keySet())
            if(m.get(k)==1)
               return k;
        
        return -1;
    }
}