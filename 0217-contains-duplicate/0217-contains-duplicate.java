class Solution {
    public boolean containsDuplicate(int[] nums) {
        Set<Integer>d=new HashSet<>();
        for(int i=0;i<nums.length;i++){
            d.add(nums[i]);
        }
        return (d.size()==nums.length)?false:true;
    }
}