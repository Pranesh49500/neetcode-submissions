class Solution {
    public int integerBreak(int n) {
        //dp[i] represents the maximum product we get by splitting i into 2 positive integers
        int[] dp= new int[n+1];

        for(int i=2;i<=n;i++){
            for(int j=1;j<i;j++){
                int split= j* (i-j);
                int furthersplit= j* dp[i-j];

                dp[i]=Math.max(dp[i],Math.max(split,furthersplit));
            }
        }
        return dp[n];
    }
}