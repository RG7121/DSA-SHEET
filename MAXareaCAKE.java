class Main{
 Arrays.sort(array1)
 Arrays.sort(array2)

 int hmax = Math.max(arary[0],h-array[array.length-1])
 int vmax = Math.max(arary2[0],w-array2[array2.length-1])
 
 for(int i = 1;i<array1.length;i++){
   hmax = Math.max(hmax, array1[i+1] -array[i]);   
  } 
  for(int i = 1;i<array2.length;i++){
   vmax = Math.max(vmax, array2[i+1] -array2[i]);   
  } 
   int res (int) (long)hmax* (long)vmax % 1000000007;
   return res;

}
