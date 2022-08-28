class Solution {
    public int[] answerQueries(int[] nums, int[] queries) {
        
        int res[] = new int[queries.length];
        int index=0;
        
        Arrays.sort(nums);
        
         for(int q: queries){
            int sum = 0;
            int count=0;
          for( int i=0;i<nums.length;i++) {
              sum += nums[i];
              if( sum<= q) count++;
              else  break;
            }
             res[index++] = count;
        }
        
        return res;
        
    }
}