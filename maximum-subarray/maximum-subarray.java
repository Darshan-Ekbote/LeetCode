class Solution {
    public int maxSubArray(int[] nums) {
        int curr=0;
        
        int max = Integer.MIN_VALUE;
        
        for( int n : nums){
            //curr=-1 , n =5
            curr= Math.max(n, curr+n);
            max= Math.max(curr,max);
        }
        
        return max;
    }
}