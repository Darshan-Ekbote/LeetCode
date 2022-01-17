class Solution {
   
    public List<List<Integer>> permuteUnique(int[] nums) {
         Set res= new HashSet();
        int len=nums.length;
        boolean[] visited= new boolean[len];
        backtrack(res,nums,new ArrayList(),visited);
        return new ArrayList(res);
    }
    
    public void backtrack(Set res,int [] nums,ArrayList al,boolean[] visited){
        
         if(al.size()==nums.length )
         {
          res.add(new ArrayList(al));
             return;
        }
        //else if(index==nums.length)
           // return;
        for(int i=0;i<nums.length;i++){
           if(!visited[i]){
            visited[i]=true;
            al.add(nums[i]);
            backtrack(res,nums,al,visited );
            al.remove(al.size()-1);
            visited[i]=false;
           } 
        }
        
    }
}