class Solution {
            int i = 0;
        int j = 0;
        int k = nums.length - 1;
        
        while(i <= k){
            if(nums[i] == 0){
                //Code for Swapping
                int temp = nums[i];
                nums[i] = nums[j];
                nums[j] = temp;
                i++;
                j++;
            }
            else if(nums[i] == 2){
                //Code for Swapping
                int temp2 = nums[i];
                nums[i] = nums[k];
                nums[k] = temp2;
                k--;
            }
            else{
                //for nums[i] == 1
                i++;
            }
        }
    }
