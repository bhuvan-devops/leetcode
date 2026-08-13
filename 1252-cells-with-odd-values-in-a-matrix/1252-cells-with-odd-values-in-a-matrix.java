class Solution {
    public int oddCells(int m, int n, int[][] indices) {
        int count=0;
        int mat[][]=new int[m][n];
        for(int k=0;k<indices.length;k++){
            int r=indices[k][0],c=indices[k][1];
            for(int i=0;i<n;i++){
                mat[r][i]++;
            }
            for(int i=0;i<m;i++){
                mat[i][c]++;
            }

        }
        for(int i=0;i<m;i++){
            for(int j=0;j<n;j++){
                if(mat[i][j]%2==1){
                    count++;
                }
            }
        }
        return count;
    }
}