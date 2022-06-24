class Solution {
    public boolean isValidSudoku(char[][] board) {
        Set<String> set = new HashSet<>();
        for( int i =0;i<9;i++){
            for(int j =0;j<9;j++){
                char c = board[i][j];
                if(c !='.')
                if(
                    set.contains(c + "at row"+ i)||
                     set.contains(c + "at col"+ j) ||
                     set.contains(c + "at subbox"+ i/3 + ":" + j/3)
                  ) return false;
                else{
                     set.add(c + "at row"+ i);
                     set.add(c + "at col"+ j) ;
                     set.add(c + "at subbox"+ i/3 + ":" + j/3);
                }
            }
        }
        return true;
    }
}