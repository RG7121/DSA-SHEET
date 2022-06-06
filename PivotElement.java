class Main{
 int sum =0;
  int left = 0;
  for(int i = 0;i<array.length;i++)
    sum = sum+ array[i];
   
  for(int i = 0;i<array.length;i++)
    sum = sum-array[i];
   if(sum == left) return i;
  left = left+ array[i];
  
  return -1;
}
