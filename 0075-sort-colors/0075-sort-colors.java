class Solution {
    public void sortColors(int[] nums) {
        int i=0,j=nums.length-1,mid=i;
        while(mid<=j){
            if(nums[mid]==0){
                int t=nums[i];
                nums[i]=nums[mid];
                nums[mid]=t;
                i++;
                mid++;
            } 
            else if(nums[mid]==2){
                int t=nums[j];
                nums[j]=nums[mid];
                nums[mid]=t;
                j--;
            }else{

                mid++;
            } 
            
        }

    }

}