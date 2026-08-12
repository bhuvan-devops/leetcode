class Solution {
    public int[] decrypt(int[] code, int k) {
        if(k==0){
            return new int[code.length];
        }
        int ans[]=new int[code.length];
        int n=code.length;
        for(int i=0;i<code.length;i++){
            if(k>0){
                for(int j=1;j<=k;j++){
                    ans[i]+=code[(i+j)%n];
                }
            }else{
                for(int j=1;j<=-k;j++){
                    ans[i]+=code[(i-j+n)%n];
                }
            }
        }
        return ans;
    }
}