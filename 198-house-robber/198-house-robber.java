class Solution {
    public int rob(int[] nums) {
        
        if(nums.length ==0 ) return 0;
        else if(nums.length ==1  ) return nums[0];
        
        int newRobbedHouse =0;
        int prevHouse =0;
        int prevPrevHouse= 0;
        
        // 0, 0 ,1,2,3,1
        
        for( int i=0;i<nums.length;i++){
            
            newRobbedHouse = Math.max(prevHouse, prevPrevHouse+nums[i] );
            prevPrevHouse = prevHouse;
            prevHouse = newRobbedHouse;
            
        }
        
        return newRobbedHouse;
    }
}