import java.util.*;

class Solution {
  public int maxNumberOfFamilies(int n, int[][] reservedSeats) {
      
    Map<Integer, Set<Integer>> map = new HashMap<>();
      
      buildSitting(map,reservedSeats);
      
     int ret = 2 * (n - map.size());
     //System.out.println("ret:"+ret);
      
    for (Integer row : map.keySet()) {
      Set<Integer> set = map.get(row);
        
      // Split the seat into 4 segments
      // 1 2 3 | 4 5 6 7 | 8 9 10
      //   ___   ___ ___   ___
      // seat 2, 3: left segment
      // seat 4, 5: left-middle segment
      // seat 6, 7: middle-right segment
      // seat 8, 9: right segment
      boolean l = true, lm = true, mr = true, r = true;
      if (set.contains(2) || set.contains(3)) {
        l = false;
      }
      if (set.contains(4) || set.contains(5)) {
        lm = false;
      }
      if (set.contains(6) || set.contains(7)) {
        mr = false;
      }
      if (set.contains(8) || set.contains(9)) {
        r = false;
      }
      // If middle segments are empty
      if (lm && mr) {
        // If left and right segments are empty, ret += 2 'cause we split people across the aisle
        if (l && r) {
          ret += 2;
        // the middle 4 seats occupied 
        } else {
          ret += 1;
        }
      } else if ((mr && r) || (lm && l)) { // now we know that the middle segments aren't empty, check the cross-aisle-equal-split scenario
        ret += 1;
      }
    }
    return ret;
  }
    public void buildSitting(Map<Integer,Set<Integer>> res,int[][] reservedSeats){
        
        for( int [] r: reservedSeats){
            //int row =r[0];
            //int position =r[1];
            Set<Integer> set = res.getOrDefault(r[0],new HashSet<>());
            set.add(r[1]);
            res.put(r[0],set);
            
            
        }
    }
}