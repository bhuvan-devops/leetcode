class Solution {
    public int[] replaceElements(int[] arr) {
        int max=-1,c=arr[arr.length-1];
        arr[arr.length-1]=-1;
        for(int i=arr.length-2;i>=0;i--){
            if(c>max){
                max=c;
            }
            c=arr[i];
            arr[i]=max;

        }
        return arr;
    }
}