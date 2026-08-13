class Solution {
    public int longestConsecutive(int[] nums) {
        if(nums.length==1){
            return 1;
        }
       int maxlen=Integer.MIN_VALUE;
       Set<Integer> s=new HashSet<>();
       for(int i=0;i<nums.length;i++){
        s.add(nums[i]);

       }
        int l=0;
        for(int i:s){
            int k=i-1;
            if(!s.contains(k)){
                k++;
                l=0;
                while(s.contains(k)){
                    k++;
                    l++;
                }
            }
            maxlen=Math.max(l,maxlen);
        }
       return (maxlen==Integer.MIN_VALUE)?0:maxlen;
    }
}