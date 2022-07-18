class Solution {
    public int rob(int[] nums) {
        
        if(nums.length ==0 ) return 0;
        else if(nums.length ==1  ) return nums[0];
        
        int[] dp = new int[nums.length];
        
        dp[0] = nums[0];
        dp[1] = Math.max(nums[0],nums[1]);
        
        //[1,2,3,1]
        for( int i=2;i<nums.length;i++){
            //curr + i-2  or previous one 
            dp[i] = Math.max(dp[i-1],dp[i-2]+nums[i]);
        }
        
        return Arrays.stream(dp).max().getAsInt();
    }
}