class Solution {
    
    Set<List<Integer>> set = new HashSet<>();
    public List<List<Integer>> combinationSum(int[] candidates, int target) {
       
        backtrack(candidates,target,new ArrayList(),0);
        return new ArrayList(set);
    }
    
    public void backtrack(int[]candidates,int target,List al,int index ){
        
        if(target<0 || index>= candidates.length ) return ;
     
        if(target ==0){
            set.add(new ArrayList<>(al));
            return;
        }
        
        
        for(int i = index; i<candidates.length;i++){
            
            al.add(candidates[i]);
            
            backtrack(candidates, target-candidates[i],al,i);
            
            al.remove(al.size()-1);
            
        }
        
       
    }
}