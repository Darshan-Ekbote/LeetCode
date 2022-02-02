class Solution {
    public int minMeetingRooms(int[][] intervals) {
        
      int[] start = new int [intervals.length];
      int[] end = new int [intervals.length];
      int rooms =0;
        for( int i =0;i< intervals.length;i++){
            
            start[i] = intervals[i][0];
            end[i] = intervals[i][1];
        }
        
        Arrays.sort(end);
        Arrays.sort(start);
        int startIndex =0;
        int endIndex=0;
        int res =0;
        
        //whenever a meeting starts , increase the room counter 
        //ehenever the meeting ends, decrease the room counter
        //return the maximum room count reached 
        while(startIndex < intervals.length){
            if( start[startIndex]< end[endIndex]){
                startIndex++;
                rooms++;
            }else {
                endIndex++;
                rooms--;
            }
            res = Math.max(rooms,res );
        }
        return res;
    }
}