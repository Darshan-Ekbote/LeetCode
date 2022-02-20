class Solution {
    public int removeCoveredIntervals(int[][] intervals) {
        
        //sort by start time and then by length of interval
        Arrays.sort(intervals , (i1,i2)-> {
           return i1[0] == i2[0] ? i2[1]-i1[1] : i1[0]-i2[0] ;
        });
        
        int end,prevEnd =0,nonCovered=0;
        for( int[] i : intervals){
             end = i[1];
            //not covered as current end is greater
            if( prevEnd < end){
                prevEnd = end;
                 nonCovered++;
            }
            //else covered interval - do nothing
        }
        return nonCovered;
    }
}