class Solution {
    public boolean canPartition(int[] nums) {
        int target=0;

        for(int n: nums)
            target+=n;
        
        if(target%2!=0)
            return false;
        
        target= target/2;

        HashSet<Integer> set= new HashSet<>();
        set.add(0);

        for(int i=0;i<nums.length;i++){
            HashSet<Integer> tset= new HashSet<>(set);

            for(int a:tset){
                if(nums[i]+a==target)
                    return true;
                set.add(nums[i]+a);
            }
        }
        return false;
    }
}
