class Solution {
    public int maxSubArray(int[] nums) {
        // Initialize our variables using the first element.
        int max = nums[0];
        int curr = nums[0];
        
        for(int i =1;i< nums.length;i++){
            int n = nums[i];
            curr =Math.max(n, curr+n);
            max= Math.max(curr, max);
        }
        
        return max;
    }
}