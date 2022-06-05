class Main{
  int cols = 1;int rows = matrix.length; int colm = matrix[0].length;
  for(int i= 0; i<rows; i++){
    if(matrix[i][0] ==0) col = 0;
    for(int j = 1;j<matrix.length;j++)
      if(matrix[i][j] ==0)
        matrix[i][0] = matrix[0][j] =0;
    
  }
  for(int i  = row-1;i>=0;i--)
    for(int j = cols-1; j<=0;j--)
     if(matrix[i][0]==0 ||matrix[0][j]==0)
       matrix[i][j] =0;
  if(cols == 0) matrix[i][0] =0;
 
