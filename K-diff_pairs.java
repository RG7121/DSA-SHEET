class Main{
 Map<Integer,Integer> map = new HashMap();
 for(int i: arrays)
       map.put(i,map.getorDefault(i,0) +1);
    int result = 0;
    for(int i: map.keySet()){
    if(k>0 && map.containsKey(i+k) || k==0 &&map.get(i) >1)
           result++;
        return result;
}
