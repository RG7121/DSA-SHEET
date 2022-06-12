for(int i = 0 ; i<array.length ; i++)
  for(int j = i ; j<array[0].length;j++)
    int temp = array[i][j];
    array[i][j] = array[j][i]
    array[j][i] = temp;

}
}

for(int i = 0 ; i<array.length ; i++)
  for(int j = i ; j<array.length/2;j++)
    int temp = array[i][j];
    array[i][j] = array[i][array.length-1-j]
    array[j][array.length-1-j] = temp;

}
}
