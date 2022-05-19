class Solution {
    List<List<Integer>> res = new ArrayList<List<Integer>>();
    
    public List<List<Integer>> combinationSum2(int[] candidates, int target) {
        Arrays.sort(candidates);
      
        dfs(candidates,0,target,new ArrayList<Integer>());
        return res;
    }
    
   public void dfs( int[] nums ,int index , int target,List <Integer> temp){
        
        if(  target <0 ) 
            return;
        
        if(target==0){
            res.add(new ArrayList<Integer>(temp));
            return;
        }
        
        for(int i = index;i<nums.length;++i){
            if (i > index  && nums[i] == nums[i-1]) continue;
            temp.add(nums[i]);
            dfs(nums,i+1,target-nums[i],temp);
            temp.remove(temp.size()-1);
        }
    }
}