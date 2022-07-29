class Solution {
    public int[][] intervalIntersection(int[][] firstList, int[][] secondList) {
        
        
        
        List<List<Integer>>  res = new ArrayList<>();
      
         for(int [] first : firstList){
        
                  for (int [] sec : secondList){
                 //start of 2nd is before the end of 1st interval  and end of 1st is greater -> there is. an intersection 
                // send of 2nd is less the the end of first and is greater than the start of first 
                if( (first[0] <= sec[0] && first[1]>=sec[0]  ) || (first[0] <= sec[1]  && first[0] >= sec[0]) ){
                    
                    List<Integer> temp = new ArrayList<>();
                    // start of intersection   - Math.max( start1`, start2 );
                    // end of intersection = Math.min( end1 , end2);
                    int newStart = Math.max( first[0], sec[0] );
                    int newEnd = Math.min( first[1] , sec[1]); 
                    temp.add(newStart);
                    temp.add(newEnd);
                    res.add(new ArrayList<>(temp));
                }
            }
        }
        
        int [][] intersection = new int[res.size()][2];
        
        for( int i =0;i<res.size();i++){
            
            List <Integer> temp = res.get(i);
            intersection[i][0] = temp.get(0);
            intersection[i][1] = temp.get(1);
            
        }
        
        return intersection; 
    }
}