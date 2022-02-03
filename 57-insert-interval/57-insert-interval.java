class Solution {
    public int[][] insert(int[][] intervals, int[] newInterval) {
        LinkedList <int[]>  merge = new LinkedList<int[]>();
        int idx=0;
        int n = intervals.length;
        int newStart =  newInterval[0];
        int newEnd = newInterval[1];
        //add all the intervals which starts before new interval stars
        while( idx<n  ){
            
            if(newStart > intervals[idx][0]){
                merge.add( intervals[idx++]);
            }else
                break;
        }
        // insert new interval here
        //not overlapping
        if( merge.isEmpty() || merge.getLast()[1]< newStart)
            merge.add(newInterval);
        else //overlapping
            merge.getLast()[1] = Math.max( merge.getLast()[1], newEnd);
            
        
        //remaining intervals
        while(idx<n){
            int[]  interval  = intervals[idx++];
            if( merge.isEmpty() || merge.getLast()[1]< interval[0] )
                merge.add(interval);
            else{
                merge.getLast()[1] = Math.max( merge.getLast()[1],interval[1] );
            }
        }
        
        return merge.toArray( new int[0][0]);
    }
}