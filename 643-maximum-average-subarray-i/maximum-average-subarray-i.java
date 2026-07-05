class Solution {
    public double findMaxAverage(int[] nums, int k) {
        int sum=0;
       int low=0;
       for(int i=low;i<k;i++){
          sum+=nums[i];
       }
       int high=k-1;
       double res=Integer.MIN_VALUE; 
       while(high<nums.length){
           res=Math.max(sum, res);
           high++;
           low++;
           if(high==nums.length){
            break;
           }
           sum -=nums[low-1];
           sum +=nums[high];

       }
       res /= k;
       return res;
    }
}