class Solution {
    public int subarraySum(int[] nums, int k) {
       int p[]=new int[nums.length+1];
       p[0]=0;
       for(int i=1 ;i<nums.length;i++){
            p[i]=p[i-1]+nums[i-1];
       }
       HashMap<Integer,Integer>hm=new HashMap<>();
       hm.put(0,1);
        int sum=0;
        int c=0,l=0;
        for(int i=0;i<nums.length;i++){
            sum+=nums[i];
             l=sum-k;
            if(hm.containsKey(l)){
                c+=hm.get(l);
            }
            hm.put(sum,hm.getOrDefault(sum,0)+1);
        }
        return c;
    }
}