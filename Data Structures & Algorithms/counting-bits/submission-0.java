class Solution {
    public int[] countBits(int n) {
        int[] ans=new int[n+1];
        ans[0]=0;
        int nn,cnt=0;
        for(int i=1;i<n+1;i++){
            cnt=0;
            nn=i;
            while(nn>0){
                if((nn&1)==1)
                    cnt++;
                nn>>=1;
            }
            ans[i]=cnt;
        }
        return ans;
    }
}
