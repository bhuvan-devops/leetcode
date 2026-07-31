class Solution {
    public int maxArea(int[] h) {
        int i=0,j=h.length-1,sum=0,max=Integer.MIN_VALUE;
        while(i<j){
            if(h[i]<=h[j]){
                sum=h[i]*(j-i);
                i++;
            }else if(h[i]>h[j]){
                sum=h[j]*(j-i);
                j--;
            }
            max=Math.max(max,sum);
        }
        return max;
    }
    
}