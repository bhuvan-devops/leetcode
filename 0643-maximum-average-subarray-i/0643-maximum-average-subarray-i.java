class Solution {
    public double findMaxAverage(int[] nums, int k) {
       int i=0,j=0;
       double sum=0,maxavg=Integer.MIN_VALUE,avg=0;
        while(j<nums.length){
            sum+=nums[j];
            if(j-i+1==k){
                avg=sum/k;
                maxavg=Math.max(maxavg,avg);
                sum-=nums[i];
                i++;
            }
            j++;
        }
        return maxavg;
    }
}