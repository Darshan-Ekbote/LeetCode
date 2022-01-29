class Solution {
    public int maxProduct(int[] nums) {
        if (nums.length == 0) return 0;
        int max = nums[0];
        for (int i = 0; i < nums.length; i++) 
            max = Math.max( slidingWindow(nums,i), max);
        return max;
    }
    
    public int slidingWindow(int [] nums , int index ){
        int prod = 1;
        int max =Integer.MIN_VALUE;
            for (int j = index; j < nums.length; j++) {
                prod *= nums[j];
                max = Math.max(max, prod);
            }
        return max;
    }
}