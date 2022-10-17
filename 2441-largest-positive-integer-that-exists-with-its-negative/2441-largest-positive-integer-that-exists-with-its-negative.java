class Solution {
    public int findMaxK(int[] nums) {
        
        Set<Integer> set = new HashSet<>();
        int max=Integer.MIN_VALUE;
        
        for( int i =0;i<nums.length;i++)
                set.add(nums[i]);
        
        
        for( int i=0;i<nums.length;i++)
            if( set.contains( nums[i]*-1 ))
                max = max<Math.abs(nums[i])?Math.abs(nums[i]):max;
            
             
        
        return max==Integer.MIN_VALUE? -1:max;
        
        
        
    }
}