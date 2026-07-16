class Solution {
    public int longestConsecutive(int[] nums) {
       Set<Integer> hm=new HashSet<>();
       int max=Integer.MIN_VALUE,l=1;
       for(int i=0;i<nums.length;i++){
            hm.add(nums[i]);
       }
       int c=0;
        for(int n:hm){
            l=1;
            if(!hm.contains(n-1)){
               c=n; 
                while(hm.contains(c+1)){
                    l++;
                    c++;
                }
            }
            max=Math.max(max,l);
        }
       
       return (max==Integer.MIN_VALUE)?0:max;
    }
}