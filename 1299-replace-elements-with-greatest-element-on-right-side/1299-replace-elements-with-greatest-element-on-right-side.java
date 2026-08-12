class Solution {
    public int[] replaceElements(int[] arr) {
        int max=Integer.MIN_VALUE,c=0;
        int arrnew[]=new int [arr.length];
        c=arr[arr.length-1];
        arrnew[arr.length-1]=-1;
        for(int i=arr.length-2;i>=0;i--){
            max=Math.max(max,c);
            c=arr[i];
            arrnew[i]=max;
        }
        return arrnew;
    }
}