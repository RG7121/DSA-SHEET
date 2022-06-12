Class Main{
 for(int i = 0; i<array.length;)
   for(int j = 0 ;j<array[0].length
       if(word.charAt(0) == board[i][j] || dfs(board,i,j ,0 ,word)
          return true;
          
          }
          return false;
          }
   boolean dfs ( String word, char[][] board, int j , int i , int count)
      if(count == word.length ) return truel
       if( i =-1|| j == -1 || j== board[0].length ||  i == board.length || board[i][j] != word.charAt(count)) return false;
        Char temp = board[i][j];
         board[i][j] = '*';
          Boolean found = dfs(board,i+1,j ,count+1 ,word)|dfs(board,i-1,j ,count+1 ,word)|| dfs(board,i,j+1 ,count+1 ,word)||dfs(board,i,j-1 ,count+1 ,word)
          board[i][j] = temp;
          return found;
}
