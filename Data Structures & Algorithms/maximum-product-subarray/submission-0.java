class Solution {
    public int maxProduct(int[] nums) {
        int currmax=nums[0];
        int currmin=nums[0];
        int res=nums[0];

        for(int i=1;i<nums.length;i++){

            if(nums[i]<0){
                int temp=currmax;
                currmax=currmin;
                currmin=temp;
            }

            currmax= Math.max(nums[i],nums[i]*currmax);
            currmin= Math.min(nums[i],nums[i]*currmin);
            res= Math.max(res,currmax);

        }
        return res;
    }
}
