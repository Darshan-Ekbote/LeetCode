class Solution{
public int maxProduct(int[] nums) {

        
        if(nums == null || nums.length == 0){
            return 0;
        }
        
        if(nums.length == 1){
            return nums[0];
        }
        int max = Integer.MIN_VALUE;
        int prod = 1;
        int result = 0;
        for(int i = 0 ; i < nums.length ; i++){
            prod *= nums[i];
            result = Math.max(result, prod);
            if(prod == 0){
                prod = 1;
            }
        }
        prod = 1;
        for(int i = nums.length -1 ; i>= 0 ; i--){
            prod *= nums[i];
            result = Math.max(result, prod);
            if(prod == 0){
                prod = 1;
            }
        }
        return result;
    }

}