class Solution {
    public int[] topKFrequent(int[] nums, int k) {
        Map<Integer,Integer> hm=new HashMap<>();
        for(int i=0;i<nums.length;i++){
            hm.put(nums[i],hm.getOrDefault(nums[i],0)+1);
        }
         List<Map.Entry<Integer, Integer>> l =
                new ArrayList<>(hm.entrySet());

        Collections.sort(l,
                (a, b) -> b.getValue() - a.getValue());

        int[] ans = new int[k];

        for (int i = 0; i < k; i++) {
            ans[i] =l.get(i).getKey();
        }    
        return ans;
    }
}