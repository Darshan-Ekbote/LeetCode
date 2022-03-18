class Solution {
    public int search(int[] nums, int target) {
        
        int left =0, right = nums.length-1;
        
        //binary search
        while(left<=right){
            
            int mid = left+(right-left)/2;
            
            if(nums[mid]==target){
                return mid;                
            }
            //check if target is on the left of mid and if left is sorted
            else if(nums[mid]>=nums[left]){
               if (target<nums[mid] && nums[left]<=target) right = mid-1;
                else left=  mid+1;
                
            }else {
                if(target<=nums[right] && nums[mid]<target) left= mid+1;
                else right= mid-1;
            }
            
                    
        }
        
        return -1;
    }
}