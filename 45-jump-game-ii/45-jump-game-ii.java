class Solution {
    public int jump(int[] nums) {
        
        int max=0;
        int currJumpEnd=0;
        int jump=0;
        
        for(int i=0;i<nums.length;i++){
            
            max = Math.max(max,i+nums[i]);
            //make jump after reaching the end of the making first jump
            if(currJumpEnd==i && i!=nums.length-1) {
                currJumpEnd = max;
                jump++;
            }
            
        }
        
        return jump;
    }
}