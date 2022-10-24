class Solution {
   public List<List<Integer>> threeSum(int[] nums) {
       
    Set<List<Integer>> set  = new HashSet<>();
     Arrays.sort(nums);
       
    for( int i =0;i<nums.length;i++){
        
        int s = i+1;
        int e = nums.length-1;
        
        while(s<e){
            
            int sum = nums[i]+nums[e]+nums[s];
            
            if(sum==0){
                List<Integer> temp = new ArrayList<>();
                temp.add(nums[i]);
                temp.add(nums[s]);
                temp.add(nums[e]);
                set.add(new ArrayList<>(temp));
                s++;
                e--;
            }else if(sum>0){
            e--;    
            }else //sum <0
            {
                s++;
            }
        }
    }
       
       return new ArrayList<>(set);
}
}