class Solution {
    public int removeElement(int[] nums, int val) {
        int i=0,j=0,cnt=0;
        while(i<nums.length)
        {
            if(nums[i]==val)
            {
                i++;
                continue;
            }
            else
            {
                nums[j++]=nums[i];
                cnt++;
            }
            i++;
        }
        return cnt;
    }
}