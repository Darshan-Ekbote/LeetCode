class Solution {
    public int[] searchRange(int[] nums, int target) {
        
        int l = -1;
        int r = -1;
        
        
        for( int i=0;i<nums.length;i++)
            if(nums[i]==target){
               l=i;
                break;
            }
                
            
        
        for( int i=nums.length-1;i>=0;i--)
            if(nums[i]==target){
              r=i;
                break;
            }
                
        
        return new int[]{l,r};
    }
}