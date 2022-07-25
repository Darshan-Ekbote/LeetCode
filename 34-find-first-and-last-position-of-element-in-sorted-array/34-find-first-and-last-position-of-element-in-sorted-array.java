class Solution {
    public int[] searchRange(int[] nums, int target) {
       
        int[] indices= new int[2];
        
         indices[0]= search(nums, target, true);
         indices[1]= search(nums,target,false);
        
        return indices;
    }
    
    
    
    public int search(int[] nums, int target, boolean isFirst){
         int r = nums.length-1;
         int l =0;
        
         while( l<=r){
            
            int mid = l+(r-l)/2;
            
            if(nums[mid]==target){
                
                if(isFirst){//to get the first one
                    //found lower index as nums[mid-1] is not the target but nums[mid] is target
                    //also edge case is 0th index is target
                    if(mid==l  || nums[mid-1]!=target){
                            return mid;
                     }
                    //search on lower side
                    r=mid-1;
                    
                }else {//to get the second one
                    if(mid==r || nums[mid+1]!=target)
                    return  mid;
                    
                    //search on right side
                    l = mid+1;
                }
                
            }
            else if( nums[mid]< target){
                l =mid+1;
            }else{
                r=mid-1;
            }
        }
        
        return -1;
    }
}