class Solution {
    public int removeDuplicates(int[] nums) {
        
        int len =nums.length;
        int res=0;
        int index=1;
      
        for(int i=1;i<len;i++){
                
                if(nums[i-1]==nums[i])
                {
                    res++;
                                        
                } else{
                    nums[index] = nums[i];
                  index++;
        }
            
        }
        return len-res;
    }
}