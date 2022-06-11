class Main{
  Set<List<Integer>> rs = new HashSet<>();
  Arrays.sort(nums);
  for(int i = 0;i<array.length;i++)
   for(int x = i+1; j<array.length;x++)
     int j = x+1;
      int k = array.length-1;
    while(j<k)
       int sum = array[i] + array[j] + array[k] + array[j];
       if( sum == target) 
          List<Integer> out = new ArrayList<>();
          out.add(array[i},array[j] ,array[k],array[x]);
          rs.add(out);
          j++;
          k--;
       }
       else if( sum <target) j++;
        else k--;
       
    return new ArrayList<>(rs);                    
    
  
}
