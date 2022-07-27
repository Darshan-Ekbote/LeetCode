class Solution {
    public void rotate(int[][] matrix) {
        int l =0, r=matrix.length-1;
        
        // t,l     t,r
        //
        // b,l.    b,r
        
        
        while(l<r){
             int bottom=r, top =l;
            for( int i =0;i<(r-l);i++){
                
                 //move bottom left to top left
                int topLeft = matrix[top][l+i];
                
                matrix[top][l+i] = matrix[bottom-i][l] ;
                
                 //move bottom right to bottom left
                matrix[bottom-i][l] = matrix[bottom][r-i];
                
                //move top right to bottom right
                matrix[bottom][r-i]=matrix[top+i][r];
               
                //move top left to top right
                matrix[top+i][r] = topLeft;
            }
            //move to inner submatrix
            r--;
            l++;
        }
    }
}