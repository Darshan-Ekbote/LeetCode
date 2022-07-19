class Solution {
    public int rob(int[] nums) {
        
        if(nums.length==0) return 0;
        else if(nums.length==1) return nums[0];
        
        
        int firstRob = robDp(nums,0,nums.length-1);
        int skipFirst= robDp(nums,1,nums.length);
        
        return Math.max(firstRob,skipFirst);
    }
    
    public int robDp(int[] nums,int start, int end){
        
       int prePrevhouse=0,prevHouse=0;
        int newRobbedHouse=0;
        for( int i=start;i<end;i++){
             //dp[curr] = Math.max(dp[curr-1], nums[curr]+dp[curr-2]);
            newRobbedHouse = Math.max(prePrevhouse+nums[i],prevHouse);
            prePrevhouse = prevHouse;
            prevHouse = newRobbedHouse;
        }
        
        
        return newRobbedHouse;
        
    }
}