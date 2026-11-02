class Solution {
    public int coinChange(int[] coins, int amount) {
        int[] dp = new int[amount+1];
        if (amount==0)
            return 0;

        Arrays.fill(dp,amount+1);
        dp[0]=0;

        for(int c:coins){
            for(int i=c;i<dp.length;i++)
                dp[i]= Math.min(dp[i],1+dp[i-c]);
        }

        return dp[amount]>amount ?-1 : dp[amount];
    }
}
