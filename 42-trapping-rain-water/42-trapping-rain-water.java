class Solution {
    public int trap(int[] height) {
        
        int [] left  = new int [height.length];
        int [] right = new int [height.length];
        int trappedWater =0;
        
        left[0] =height[0];
        right[height.length-1] = height[height.length-1];
        
        for( int i =1;i<height.length;i++)
            left[i] = Math.max(height[i],left[i-1]);
        
        for( int i =height.length-2;i>=0;i--)
            right[i] = Math.max(height[i],right[i+1]);
        
        //calculate the trapped rainwater area minus height 
        for( int i =0;i<height.length;i++){
            
            trappedWater += Math.min(left[i],right[i]) - height[i];
        }
        return trappedWater;
    
    }
}