class Solution {
    public void rotate(int[] nums, int k) {
        int len = nums.length;
        k=k%len;
        swap(nums,0,len-k-1);
        swap(nums,len-k,len-1);
        swap(nums,0,len-1);
        
    
    }
    
    
    public void swap ( int nums[], int l , int r ){
        
        while(l<=r){
            
            int t = nums[l];
            nums[l]= nums[r];
            nums[r] = t;
            
            l++;
            r--;
            
        }
    }
}