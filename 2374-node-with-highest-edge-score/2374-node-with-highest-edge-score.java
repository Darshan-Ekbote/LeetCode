class Solution {
    public int edgeScore(int[] edges) {
        
        List<List<Integer>> adj = new ArrayList<>();
        Double maxScore=0.0;
        int maxNode= edges.length+1;
        
        for(int i=0;i<edges.length;i++)
            adj.add(new ArrayList<>());
        
        for(int i=0;i<edges.length;i++)
            adj.get(edges[i]).add(i);
        
        for(int i=0;i<adj.size();i++){
            if(!adj.get(i).isEmpty()){
                 Double sum = (Double) adj.get(i).stream().mapToDouble(x->x).sum();
                if(sum>maxScore){
                    maxScore=sum;
                     maxNode=i;
                }else if(sum==maxScore){
                    if(maxNode>i){
                        maxNode=i;
                    }
                }
            }
           
        }
        
        return maxNode;
    }
}