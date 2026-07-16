class Solution {
    public int shipWithinDays(int[] weights, int days) {
        int l=0,r=0,mid;
        for(int w: weights){
            l=Math.max(l,w);
            r+=w;
        }

        int ans=r;

        while(l<=r){
            mid=l+(r-l)/2;
            if(canShip(weights,days,mid)){
                ans=mid;
                r=mid-1;
            }
            else
                l=mid+1;
        }
        return ans;
    }

    public boolean canShip(int[] weights, int days,int capacity){
        int daysUsed=1;
        int currweight=0;

        for(int w:weights){
            if(currweight+w<=capacity){
                currweight+=w;
            }
            else{
                daysUsed++;
                currweight=w;
            }
        }
        return daysUsed<=days;
}

}