class Solution {
    public int numDecodings(String s) {
        int n=s.length();
        int[] dp= new int[n+1];
        //dp[i] represents no. of ways to decode a string upto character i

        dp[0]=1;

        for(int i=1;i<=n;i++){
            //choose one digit
            if(s.charAt(i-1)!='0')
                dp[i]+=dp[i-1];
            
            //choose two digit
            if(i>=2){
                int num= Integer.parseInt(s.substring(i-2,i));

                if(num>=10 && num<=26) //valid
                    dp[i]+=dp[i-2];
            }
        }
        return dp[n];
    }
}
