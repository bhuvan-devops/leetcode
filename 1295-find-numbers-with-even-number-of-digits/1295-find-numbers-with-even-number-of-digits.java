class Solution {
    int check(int n){
        int k=0;
        while(n>0){
            n/=10;
            k++;
        }
        return (k%2==0)?1:0;
    }

    public int findNumbers(int[] nums) {
        int c=0;
        for(int i=0;i<nums.length;i++){
            c+=check(nums[i]);
        }
        return c;
    }
}