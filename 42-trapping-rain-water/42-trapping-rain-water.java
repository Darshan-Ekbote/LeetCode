class Solution {
    public int trap(int[] height) {
        
        int trappedWater=0;
        
        int left[] = new int[height.length];
        int right[] = new int[height.length];
        
       
        left[0] =height[0];
        right[height.length-1] = height[height.length-1];
        
        
        for(int i=1;i<height.length;i++){
            left[i] = Math.max(height[i],left[i-1]);
        }
        
         for(int i=height.length-2;i>=0;i--){
            right[i] = Math.max(height[i],right[i+1]);
        }
        
        for(int i=0;i<height.length;i++)
            trappedWater +=  Math.min(right[i],left[i]) - height[i];
        
        return trappedWater;
    
    }
}