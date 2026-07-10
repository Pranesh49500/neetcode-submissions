class Solution {
    public int[] maxSlidingWindow(int[] nums, int k) {
        int[] ans= new int[nums.length-k+1];
        Deque<Integer> dq= new LinkedList<>();
        int idx=0;

        for(int i=0;i<nums.length;i++)
        {
            //Window size exceed, remove first
            while(!dq.isEmpty() && dq.peekFirst()<=i-k)
                dq.pollFirst();
            
            //last ele in queue < curr(nums[i]), remove last
            while(!dq.isEmpty() && nums[dq.peekLast()]<nums[i])
                dq.pollLast();

            //store indices
            dq.offerLast(i);

            if(i>=k-1)
                ans[idx++]= nums[dq.peekFirst()];
        }
        return ans;
    }
}
