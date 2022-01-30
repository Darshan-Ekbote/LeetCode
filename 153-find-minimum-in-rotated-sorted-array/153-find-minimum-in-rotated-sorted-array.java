class Solution {
    public int findMin(int[] nums) {
        
        if(nums.length==1)
            return nums[0];
        int left =0;
        int right = nums.length-1;
        
        if(nums[right]>nums[0])
            return nums[0];
        
        while(left<=right){
            int mid =left+(right-left)/2;
            
            //middle condition check
            if(nums[mid]> nums[mid+1])
                return nums[mid +1 ];
           else if(nums[mid-1]>nums[mid])
                return nums[mid ];
            
            //nums[0] is greater than mid...so min is on the left of mid
            if(nums[0]>nums[mid])
                right= mid-1;
             //nums[0] is smaller than mid...so min is on the right of mid
            else if( nums[0]<nums[mid])
                left= mid+1;
            
        }
        
        //if not found
        return -1;
    }
}