class Solution {
    public void sortColors(int[] nums) {
        int i=0,mid=i,j=nums.length-1; 
        int sum=0;
        while(mid<=j){
            if(nums[mid]==0){
                int t=nums[mid];
                nums[mid]=nums[i];
                nums[i]=t;
                i++;
                mid++;
            }else if(nums[mid]==1){
                mid++;
            }else{
                int t=nums[mid];
                nums[mid]=nums[j];
                nums[j]=t;
                j--;
            }
        }
    }
}