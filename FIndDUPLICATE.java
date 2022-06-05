class Main{
  int slow = 0;
	int fast = 0;
	do{
	  slow = array[slow];
		fast = array[array[fast]];
		
	}while (fast != slow);
	slow =0;
   while(slow!=fast){
		 slow = array[slow];
		 fast = array[fast];
	return slow;	 
}
