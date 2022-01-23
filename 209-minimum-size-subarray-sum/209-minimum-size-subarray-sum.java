class Solution {
    public int minSubArrayLen(int target, int[] nums) {
        List<Integer> lengths = new ArrayList<Integer>();
        
        for(int i=0;i<nums.length;i++){
            int res = slidingWindow(nums,i,target);
            if( res!=-1)
                lengths.add(res);
        }
        
       if(lengths.isEmpty())
            return 0;
        
        Collections.sort(lengths );
        
        return   lengths.get(0);
    }
    
    public int slidingWindow(int[] nums, int index,int target){
        int sum = 0;
        int count=0;
        for(int i = index;i<nums.length;i++){
            sum+=nums[i];
            count++;
            if(sum>= target)  return count;
        }
        
        return -1;
    }
        
    }
