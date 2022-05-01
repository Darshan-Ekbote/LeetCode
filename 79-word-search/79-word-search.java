class Solution {
    static boolean visited[][] ;
    public boolean exist(char[][] board, String word) {
      
        int n = board.length;
        int m = board[0].length;
        visited = new boolean [n][m];
        
        for( int i =0;i < board.length;i++ )
            for( int j =0; j < board[i].length; j++ )
                if(word.charAt(0) == board[i][j] && searchGrid(board, word, i,j,0) )
                        return true;
        
      
       
        return false;  
    }
    
    
    public boolean searchGrid (char[][] board, String word, int i, int j, int index){
        
        // if matches
        if(index == word.length()) return true;
        
        // boundary conditions
        if(i >= board.length || i < 0 || j >= board[i].length || j < 0 || board[i][j] != word.charAt(index) || visited[i][j]) return false;
        
        
        visited[i][j] = true;
        
        if(
          searchGrid(board, word, i+1,j,index+1)  ||
          searchGrid(board, word, i-1,j,index+1)  ||
          searchGrid(board, word, i,j+1,index+1)  ||
          searchGrid(board, word, i,j-1,index+1) 
          )
            return true;
        
        visited[i][j] = false;
        return false;
    }
}