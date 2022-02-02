class Solution {
    public boolean canAttendMeetings(int[][] intervals) {
        
        Arrays.sort( intervals,  (n1,n2) -> n1[0] -n2[0] );
        
        LinkedList<int[]> meetings = new LinkedList<int[]>();
        
        for( int[] interval : intervals){
            //there is no overlapping
            if(meetings.isEmpty() || meetings.getLast()[1] <= interval[0])
                meetings.add(interval);
            else //there is overlapping 
                return false;
        }
        
        return true;
    }
}