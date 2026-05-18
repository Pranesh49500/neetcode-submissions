class Solution {
    public int[] twoSum(int[] nums, int target) {
        
        //HashMap to store val,index
        HashMap<Integer,Integer> map= new HashMap<>();
        int[] ans=new int[2];

        for(int i=0;i<nums.length;i++)
        {
            if(!map.containsKey(target-nums[i]))
            {
                map.put(nums[i],i);
            }
            else
            {
                int n1=map.get(target-nums[i]);
                ans[0]=n1;
                ans[1]=i;
                break;
            }
        }
        return ans;
    }
}
