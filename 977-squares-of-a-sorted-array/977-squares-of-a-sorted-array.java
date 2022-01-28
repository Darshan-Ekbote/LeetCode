class Solution {
    public int[] sortedSquares(int[] nums) {
        
        int res[] = new int[nums.length];
        
        int left= 0;
        int right = nums.length-1;
        int index=nums.length-1;
        
        while(left<= right){
            
            int sq1 = nums[left]*nums[left];
            int sq2 = nums[right]*nums[right];
            
            if(sq1>sq2){
                res[index--]= sq1;
                left++;
            }else  {
                
                res[index--] =sq2;
                right--;
            }
                
            
        }
        
        return res;
        
    }
}