class Solution {
    public int[] nextGreaterElement(int[] nums1, int[] nums2) {
        Stack<Integer> s=new Stack<>();
        Map<Integer,Integer> hm= new HashMap<>();
        int arr[]=new int[nums1.length];
        for(int i=nums2.length-1;i>=0;i--){
        while(!s.empty() && s.peek()<=nums2[i]){
            s.pop();
        }
        int k=-1;
        if(s.empty()){
            hm.put(nums2[i],k);
        }else{
            hm.put(nums2[i],s.peek());
        }
        s.push(nums2[i]);
        }
        for(int i=0;i<nums1.length;i++){
            arr[i]=hm.get(nums1[i]);
        }
        return arr;
    }
}