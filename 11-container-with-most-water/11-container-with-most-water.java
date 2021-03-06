class Solution {
    public int maxArea(int[] height) {
        //two pointer solution
        int l =0, r = height.length-1, max = Integer.MIN_VALUE;
             while( l<r){
                max= Math.max( max ,Math.min(height[l], height[r]) * ( r-l));
                if( height[l]< height[r])
                    l++;
                else
                     r--;
                }
        return max;
    }
}