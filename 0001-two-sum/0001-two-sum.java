class Solution {
    public int[] twoSum(int[] nums, int target) {
        HashMap<Integer,Integer> hm=new HashMap<>();
        for(int i=0;i<nums.length;i++){
            int s=target-nums[i];
            if(hm.containsKey(s)){
                return new int[]{i,hm.get(s)};
            }
            hm.put(nums[i],i);
        }
        return new int[]{};
    }
}