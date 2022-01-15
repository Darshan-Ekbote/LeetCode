class Solution {
    
    List<List<Integer>> res  = new ArrayList<List<Integer>>();
    public List<List<Integer>> permute(int[] nums) {
         boolean [] choosen = new boolean[nums.length];
        dfs(nums,new ArrayList<>(), choosen);
        return res;
    }
    public void dfs( int[] nums,List<Integer> temp,  boolean [] choosen){
        
        if(temp.size()==nums.length){
             res.add(new ArrayList<>(temp));
            return;
        }   
        
        for(int i =0;i<nums.length;i++){
        if(choosen[i]==true)
                continue;
            choosen[i]=true;
            temp.add(nums[i]);
            dfs(nums,temp,choosen);
            choosen[i]=false;
            temp.remove(temp.size()-1);
        }
        
    }
}