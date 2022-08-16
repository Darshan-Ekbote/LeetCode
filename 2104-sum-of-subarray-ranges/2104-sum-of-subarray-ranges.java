class Solution {
    public long subArrayRanges(int[] nums) {
        
        int len = nums.length;
        
        
        long total=0;
        
        for(int i=0;i<len;i++){
            long min = nums[i];
            long max = nums[i];
            
            for(int j=i+1;j<len;j++){
                min = Math.min(nums[j],min);
                max = Math.max(nums[j],max);
                total+= max-min;
            }
        }
          
        return total;
    }
}