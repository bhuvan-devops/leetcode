class Solution {
    public int minimumDifference(int[] nums, int k) {
        int min=Integer.MAX_VALUE,max=Integer.MIN_VALUE;
        int mins=Integer.MAX_VALUE;
        if(k==1)
            return 0;
        Arrays.sort(nums);
        for(int i=0;i<=nums.length-k;i++){
            mins=Math.min(mins,nums[k+i-1]-nums[i]);
        }
        
        return mins;
    }
}