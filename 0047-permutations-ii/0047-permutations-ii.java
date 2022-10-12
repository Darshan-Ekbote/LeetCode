class Solution {
    
    Set<List<Integer> > res= new HashSet<>();
    public List<List<Integer>> permuteUnique(int[] nums) {
        
        
        if(nums.length ==0) return new ArrayList<>(res);
        
        backtrack( nums, new ArrayList<>(),  new boolean[nums.length]);
        
        return new ArrayList<>(res);
        
        
    }
    
    public void backtrack( int [] nums, List<Integer> temp ,  boolean[] visited){
        
        
        if( temp.size()== nums.length){
            res.add(new ArrayList<>(temp));
            return;
        }
        
        for( int i =0;i<nums.length;i++){
            if(!visited[i]){
                visited[i]=true;
                temp.add(nums[i]);  
                backtrack(nums,temp,visited);
                visited[i]= false;
                temp.remove(temp.size()-1);
            }
            
            
            
        }
        
        
    }
}