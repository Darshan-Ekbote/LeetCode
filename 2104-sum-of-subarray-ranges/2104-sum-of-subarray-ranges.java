class Solution {
    public long subArrayRanges(int[] nums) {
        
        int len = nums.length;
        
        long min =Integer.MAX_VALUE;
        long max =Integer.MIN_VALUE;
        long total=0;
        
        for(int i=0;i<len;i++){
            
            min = nums[i];
            max = nums[i];
            for(int j=i+1;j<len;j++){
                
                min = Math.min(nums[j],min);
                max = Math.max(nums[j],max);
                
                total+= max-min;
            }
        }
          
        return total;
    }
}