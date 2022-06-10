class Main{
  Map<Integer,Integer> map = new HashMap<>();
  int sum = 0; int ans = 0;
  for(int i = 0; i<array.length;i++)
    sum += array[i];
   if(map.containsKey(sum-k))
      ans += map.get(sum-k);
}
    map.put(sum,map.getOrDefault(sum,0) +1);
   return ans;
}
