class Solution {
    public int[][] merge(int[][] intervals) {
        
        Arrays.sort(intervals, (n1,n2) -> n1[0]-n2[0] );
        LinkedList<int[]> merged = new LinkedList<int[]>();
        for( int [] interval : intervals){
            
            if( merged.isEmpty() || merged.getLast()[1]<interval[0] )
                merged.add(interval);
            else
                  merged.getLast()[1] =  Math.max(interval[1], merged.getLast()[1]);
        }
        
        return merged.toArray(new int[merged.size()][]);
    }
}