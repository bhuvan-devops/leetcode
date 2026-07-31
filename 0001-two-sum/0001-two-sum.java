class Solution {
    public int[] twoSum(int[] nums, int target) {
        Map<Integer,Integer> hm=new HashMap<>();
        for(int i=0;i<nums.length;i++){
            int n=target-nums[i];
            if(hm.containsKey(n)){
                return new int[]{hm.get(n),i};
            }else{
                hm.put(nums[i],i);
            }
        }
        return new int[]{};
    }
}