class Solution {
    Set<List<Integer>> res= new HashSet<List<Integer>>();
    public List<List<Integer>> permuteUnique(int[] nums) {
        
        backtrack(nums, new ArrayList<>(), new boolean[nums.length]);
        return new ArrayList(res);
    }
    
    public void backtrack( int [] nums,ArrayList al, boolean[] visited){
        
         if(al.size()==nums.length ){
             res.add(new ArrayList(al));
             return;
        }
        for(int i=0;i<nums.length;i++){
            if(!visited[i]){
                visited[i]= true;
                al.add(nums[i]) ;
                backtrack( nums, al , visited);
                visited[i]= false;
                al.remove(al.size()-1);
            }
         } 
        
        }
        
    }
