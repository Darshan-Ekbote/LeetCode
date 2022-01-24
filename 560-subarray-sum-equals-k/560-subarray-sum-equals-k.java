class Solution {
    int count=0;
    public int subarraySum(int[] nums, int k) {
        for(int i=0;i<nums.length;i++)
            slidingWindow(nums,k,i);
        return count;
    }
    
    public void slidingWindow(int [] nums, int k , int index){
        
        int sum=0;
        
        for(int i = index;i<nums.length;i++){
            sum+=nums[i];
            if(sum==k){
                count++;
            }
        }
    }
}