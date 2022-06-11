class Main{
  int lsum = 0;
  int n = array.length;
  for(int i = 0; i<n;i++)
    lsum += array[i];
  int max= lsum;
  for(int rsum = 0;i= 0 ;i<k;i++)
    rsum = array[n-1-i];
  lsum = array[k-1-i];
  max = Math.max(max,lsum+rsum);
  
  return max;
}
