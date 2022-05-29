class Solution {
    public int[][] matrixReshape(int[][] mat, int r, int c) {
        
        int row = mat.length;
        int col = mat[0].length;
        
        if((row*col)!= (r*c)) return mat;
        
        int[][] newMat = new int[r][c];
        
        List<Integer> al = new ArrayList<>();
        
        for( int i=0;i<mat.length;i++)
            for(int j=0;j<mat[i].length;j++)
                al.add(mat[i][j]);
        int k=0;
        
        for(int i=0;i<r;i++)
            for(int j=0;j<c;j++)
                newMat[i][j] = al.get(k++);
        
        return newMat;
    }
}