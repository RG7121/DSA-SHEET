List<Integer> rs = new ArrayLsit<Integer>();
int rs = 0;
int re = arr.length-1;
int cs = 0;
int ce = arr[0].length-1;
while(ros <= roe && cos <= coe){
            for(int i = cos; i<=coe;i++){
                rs.add(matrix[ros][i]);
            }
            ros++;
             for(int i = ros; i<=roe;i++){
                rs.add(matrix[i][coe]);
            }
            coe--;
            if( cos >coe || ros> roe) break;
            
            for(int i = coe; i>=cos;i--){
                rs.add(matrix[roe][i]);
            }
            
            roe--;
             if( cos >coe || ros> roe) break;
             for(int i = roe; i>= ros;i--){
                rs.add(matrix[i][cos]);
            }
            cos++;
            
        } 
        return rs;
