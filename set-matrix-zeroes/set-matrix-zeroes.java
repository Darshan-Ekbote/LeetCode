class Solution {
    public void setZeroes(int[][] matrix) {
        
        
        int r= matrix.length;
        int c = matrix[0].length;
        
        Set<Integer> rows = new HashSet<>();
        Set<Integer> cols = new HashSet<>();
        
        for( int i =0;i< r;i++){
            for( int j=0;j< c;j++){
                //track rows and cols
                if(matrix[i][j]==0){
                    rows.add(i);
                    cols.add(j);
                }
            }
        }
        
        
        //set to zero
        for( int i =0;i< r;i++){
            for( int j=0;j< c;j++){
                //set rows and cols to zero
                if( rows.contains(i) || cols.contains(j) ){
                    matrix[i][j] =0;
                    
                }
            }
        }
        
    }
}