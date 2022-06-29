class Solution {
    public void sortColors(int[] nums) {
        
        
        //3 poiters ..p0 =points to 0 
        //and p2 points 2 
        //and curr points to 1
        
        int p0=0,p2=nums.length-1,curr=0;
        
        //[2,0,2,1,1,0]
        //           p2
        //p0
        //curr
        //[0,0,1,1,2,2]
        
        while(curr<=p2){
            if(nums[curr]==0){
                int tmp = nums[curr];
                nums[curr]= nums[p0];
                nums [p0] = tmp;
                p0++;
                curr++;
            }else if(nums[curr]==2){
                int tmp = nums[curr];
                nums[curr] = nums[p2];
                nums[p2] = tmp;
                p2--;
            }else
                curr++;
        }
    }
}