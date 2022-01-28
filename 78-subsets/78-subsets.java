class Solution {
    public List<List<Integer>> subsets(int[] nums) {
        
    List<List<Integer>> result = new ArrayList();
    result.add(new ArrayList());
        
        for(int n: nums){
            int size= result.size();
            
            for(int i=0;i<size;i++){
                List<Integer> temp = new ArrayList<>(result.get(i));
                temp.add(n);
                result.add(temp);
            }
        }
        return result;
}
}
    //1,2,3
    
    // start  // [],
    //iteration 1 - [],[1],
    //interation 2 - [],[1],[2],[1,2] 
    //interation 3- [],[1],[2],[1,2],[3],[1,3],[2,3],[1,2,3] 