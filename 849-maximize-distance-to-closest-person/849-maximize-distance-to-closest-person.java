class Solution {
    public int maxDistToClosest(int[] seats) {
        
        
       int pre_dist = -1, suf_dist = -1, max_dist = -1, dist = 0;
        for (int i = 0; i < seats.length; i ++) {
            if (seats[i] == 0) {
                dist ++;
            } else {
                if (pre_dist == -1) {
                    pre_dist = dist;
                } else {
                    max_dist = Math.max(max_dist, dist);
                }
                dist = 0;
            }
        } 
        suf_dist = dist;
        return Math.max(Math.max(pre_dist, suf_dist), (max_dist + 1) / 2);
        
        
    }
}