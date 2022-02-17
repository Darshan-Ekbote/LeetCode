class Solution {
    public List<List<Integer>> combinationSum(int[] candidates, int target) {
        Set set = new HashSet();
        backtrack(set,candidates,target,new ArrayList(),0);
        return new ArrayList(set);
    }
    
    public void backtrack(Set set,int[]candidates,int target,List al,int index ){
        
        if(target<0 || index>=candidates.length)  return;
        
        else if(target==0){
            set.add(new ArrayList(al));
            return;
        }
        
        for(int i=index;i<candidates.length;i++){
            al.add(candidates[i]);
            backtrack(set,candidates,target-candidates[i],al,i);
           al.remove(al.size()-1);
        }
    }
}