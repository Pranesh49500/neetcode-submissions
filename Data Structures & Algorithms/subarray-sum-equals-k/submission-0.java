class Solution {
    public int subarraySum(int[] nums, int k) {
        HashMap<Integer,Integer> map= new HashMap<>();
        map.put(0,1);
        int cnt=0,rs=0;
        for(int i=0;i<nums.length;i++){
            rs+=nums[i];
            if(map.containsKey(rs-k)){
                cnt+=map.get(rs-k);
            }
            map.put(rs,map.getOrDefault(rs,0)+1);
        }
        return cnt;
    }
}