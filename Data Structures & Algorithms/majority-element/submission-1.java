class Solution {
    public int majorityElement(int[] nums) {
        HashMap<Integer,Integer> map= new HashMap<>();

        for(int n:nums)
        {
            map.put(n,map.getOrDefault(n,0)+1);
        }
        
        int maxi=0,fin=0;
        for(int n:map.keySet())
        {
            if(map.get(n)>maxi){
                maxi=map.get(n);
                fin=n;
            }
        }
        return fin;
    }
}