// BRUTEFORCE APPROACH
public class{
    for(int i = 0; i<array.length; i++)
        for(int j = i+1; j<array.length;j++)
            if(array[i] + array[j] == target )
                int[] array = {i,j}
                return array;
}
} 
return null;
}

//OPTIMIZED APPROACH
HashMap<Integer, Integer> map = new HashMap()<>;
for(int i = 0; i<array.length;i++)
    int b = target -array[i];
if(map.containsKey(b))
     int[] arr = {map.get(b),i);
 else{
     map.put(array[i],i)
         
 return null;
    
