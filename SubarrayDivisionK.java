class Main{
 int ans = 0 sum = 0 rem = 0
   HashMap<Integer, Integer> map = new HashMap<>();
  map.put(0,1);
  for(int i = 0; i<array.length;i++)
    sum = sum + array[i];
   rem = sum %k;
  if(rem <0) sum+= k;
  if(map.containsKey(rem))
    ans = ans+ map.get(rem);
  map.put(rem, map.get(rem)+1)
    else{
      map.put(rem,1);
      
      
      return ans
  
}
