class Solution {
    public int maxArea(int[] height) {
        
        int left=0;
        int right= height.length-1;
        int area=Integer.MIN_VALUE;
        
        //traverse here from left and right till left<= right
        
        while(left<right){
        //calculating the area with H diff and stpes 
            area = Math.max ( Math.min(height[left],height[right]) * (right-left), area) ;
            
        //increamenting left if left H < right H else decrease right
            if( height[left]< height[right])
                left++;
            else 
                right--;
            
        }
        
        
        return area;
    }
}