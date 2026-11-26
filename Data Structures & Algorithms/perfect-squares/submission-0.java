class Solution {
    public int numSquares(int n) {
        //dp[i] represents number of perfect squares required for getting i
        int[] dp= new int[n+1];
        Arrays.fill(dp,n+1);
        dp[0]=0;

        for(int i=1;i*i<=n;i++){
            int sq=i*i;
            for(int j=sq;j<=n;j++){
                dp[j]=Math.min(dp[j],1+dp[j-sq]);
            }
        }

        return dp[n];

    }
}