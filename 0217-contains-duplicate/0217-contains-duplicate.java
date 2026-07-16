class Solution {
    public boolean containsDuplicate(int[] nums) {
        // boolean f=false;
        Set<Integer>d=new HashSet<>();
        for(int i=0;i<nums.length;i++){
            d.add(nums[i]);
        }
        return (d.size()==nums.length)?false:true;
    }
}