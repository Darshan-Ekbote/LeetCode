class Solution {
    List<List<Integer>> res = new ArrayList<List<Integer>>();
    public List<List<Integer>> combine(int n, int k) {
       
        dfs( n,k, new ArrayList(),1);
        return res;
    }
    
    
    public void dfs (int n, int k , List<Integer> al,int j){
        
        if(al.size()==k ){
            res.add( new ArrayList(al));
            return;
        }
        
        for( int i =j;i<=n;i++){
            al.add(i);
            dfs(n,k,al,i+1);
            al.remove(al.size()-1);
        }
        
    }
}