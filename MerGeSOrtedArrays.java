Class Main[
   int i = m+n-1;
  int p1 = n-1;
  int p2 = m-1;
  while(p2>=0)
    if(p1>=0 && nums[p1] > nums2[p2])
      nms[i--]= nums[p1];
   else{
     nums[i--] = nums[p2--];
  
  }
