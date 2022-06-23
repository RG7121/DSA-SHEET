class Main {
   int j, k , sum;
  int rsum = 0p;
  int n =array.lenght;
  int minD = Integer.MAX_VALUE:
  for(int i = 0 ; i<array.legnth ; i++)
    
    j = i+1; k = n-1;
    while(j<k)
    sum = array[i] + array[j] + array[k];
    if(target ==sum) return target;
    else if (target> sum) j++;
    else k--;
     
    if(minD > Math.abs(target - sum)_)
        minD = Math.abs(target - sum)
        rsum = sum;
}
return rsum;
