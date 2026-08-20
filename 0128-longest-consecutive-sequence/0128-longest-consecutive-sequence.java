class Solution {
    public int longestConsecutive(int[] nums) {
        Set<Integer> d=new HashSet<>();
        for(int i=0;i<nums.length;i++){
            d.add(nums[i]);
        }
        int k=0;
        int l=0,max=0;
        for(int i:d){
            k=i-1;
            if(!d.contains(k)){
                k++;
                l=0;
                while(d.contains(k)){
                    k++;
                    l++;
                }
            }
            max=Math.max(max,l);
        }
        return max;
    }
}