class Solution {
    public int[][] transpose(int[][] matrix) {
        int m=matrix.length;
        int n=matrix[0].length;

        int[][] op= new int[n][m];

        for(int i=0;i<m;i++){
            for(int j=0;j<n;j++){
                op[j][i]=matrix[i][j];
            }
        }
        return op;
    }
}