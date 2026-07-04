class Solution {
    public int[] nextGreaterElements(int[] nums) {
        int arr[]=new int[nums.length];
        Stack<Integer> s=new Stack<>();
        for(int i=2*nums.length-1;i>=0;i--){
            while(!s.empty()&& s.peek()<=nums[i%nums.length]){
                s.pop();
            }
            if(s.empty()){
                arr[i%nums.length]=-1;
            }else{
                arr[i%nums.length]=s.peek();
            }
            s.push(nums[i%nums.length]);
        }
        return arr;
    }
}