class Solution {
    public int[] replaceElements(int[] arr) {
      int max=-1,c=0;
      for(int i=arr.length-1;i>=0;i--){
        c=arr[i];
        arr[i]=max;
        max=Math.max(max,c);
      }
        return arr;
    }
}