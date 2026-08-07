class Solution {
    public double findMaxAverage(int[] nums, int k) {
       int i=0,j=0;
       double sum=0,maxavg=Integer.MIN_VALUE,avg=0;
        while(i<nums.length){
            sum+=nums[i];
            if(i-j+1==k){
                avg=sum/k;
                maxavg=Math.max(avg,maxavg);
                sum-=nums[j];
                j++;
            }
            i++;
        }
        return maxavg;
    }
}