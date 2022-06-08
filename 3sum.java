class Main{
list<list<Integer>> res = new LinkedList<>();
  Arrays.sort(array);
 for(int i = 0; i<array.length-2;i++){
     if(i ==0 || (i>0 ) & array[i] != array[i+1] )
         int sum = 0- array[i] ; int k = array.length-1 ;
              int j= i+1;
        while(j<k) 
          if( array[i] + array[j] == sum) 
            res.add(Arrays.asList(array[i],array[j],array[k])
             while(j<k && array[j] !=array[j+1]) j++;
             while(j<k && array[k] !=array[k-1]) k++;
            else if ( array[j]+ array[k} <sum ) j++;
           else k--;
        
                   return res;
        
                    
 
 }

