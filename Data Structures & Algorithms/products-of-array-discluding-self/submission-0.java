class Solution {
    public int[] productExceptSelf(int[] nums) {
         int n = nums.length;
        int left[] = new int[n];
        int right[] = new int[n];
         right[n-1] = nums[n-1];
         left[0] = nums[0];
        int output[] = new int[n];
        for(int i=1,j=n-2;i<n && j>=0;i++,j--){
            left[i] = left[i-1]*nums[i];
            right[j] = right[j+1]*nums[j];
            if(i>=j){
               
                if(j==0 && i== n-1) {
                    output[j]=right[j+1];
                    output[i] = left[i-1];
                    continue;
                }

                 output[i] = left[i-1]* right[i+1];
                 output[j] = left[j-1] * right[j+1];


            }


        }

        
        return output;

       
    }
}  
