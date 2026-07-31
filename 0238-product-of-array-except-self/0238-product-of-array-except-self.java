class Solution {
    public int[] productExceptSelf(int[] nums) {
        int r[]=new int[nums.length];
        r[0]=1;
        for(int i=1;i<nums.length;i++){
            r[i]= nums[i-1] * r[i-1];
        }
        int right=1;
        for(int i=nums.length-1;i>=0;i--){
            r[i]= r[i]*right;
            right*=nums[i];

        }
        return r;
    }
}