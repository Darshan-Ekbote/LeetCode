class Solution {
    
     public boolean searchMatrix(int[][] matrix, int target) {
        
         int row =  matrix.length;
         //search each row with binary seach
         for( int i=0;i< row; i++)
             if(search(matrix, target, i)) return true;
         
         return false;
         
     }
    
    
    
    public boolean search(int[][] matrix, int target, int i) {
        
        int l =0;
        int r= matrix[i].length -1;
        
        while(l<=r){
            
            int mid =(( l + r )/2);
            int midElement =matrix[i][mid];
            if(midElement==target){
                return true;
            }else if(midElement > target){
                r=mid-1;
            }else if(midElement < target){
                l=mid+1;
            }
            
        }
        
        
        return false;
    }
}