class Solution {
    public int[][] merge(int[][] intervals) {
        
        Arrays.sort(intervals, (n1,n2) -> n1[0]-n2[0] );
        //linked list so that we can get the last element with o(1)
        LinkedList<int[]> merged = new LinkedList<int[]>();
        
        //iterate over intervals
        for( int[] curr : intervals){
            
            //if empty or no overlap add it to the LL 
            if(merged.isEmpty() || merged.getLast()[1] < curr[0]){
                merged.add(curr);
            }else{//merge if overlaps
                // [1,4][4,6] -> [1,6] , [1,9][3,6] -> [1,9]
                
                merged.getLast()[1] = Math.max( curr[1], merged.getLast()[1]);
            }
            
        }
        int[][] res = new int[merged.size()][2];
            for( int i=0;i< merged.size();i++){
                res[i]=merged.get(i);
                
            }
            return res;
        
    }
}