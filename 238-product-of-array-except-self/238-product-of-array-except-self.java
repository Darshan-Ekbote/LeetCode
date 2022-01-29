class Solution {
    public int[] productExceptSelf(int[] nums) {
        int prod=1;
        int zero = 0;
        
        for(int i=0;i<nums.length;i++){
            if(nums[i]!=0)
                prod*=nums[i];
            else
                zero++;
        }
        if(zero >1){
             Arrays.fill(nums,0);
            return nums;
        }
            
        //Input: nums = [1,2,0,3,4]
        //Output: [24,12,8,6]
        for(int j=0;j<nums.length;j++){
                int n=nums[j];
                if(n!=0 && zero==0){
                    nums[j]=prod/n;
                }else if(n!=0 && zero>0){
                    nums[j]=0;
                }else if(n==0){
                    nums[j]=prod;
                }
                    
            }
        return nums;
    }
}