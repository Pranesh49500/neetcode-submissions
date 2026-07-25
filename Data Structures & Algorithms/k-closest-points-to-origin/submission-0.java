class Solution {
    public int[][] kClosest(int[][] points, int k) {
        PriorityQueue<int[]> pq=new PriorityQueue<>((a,b)->{
            int d1=a[0]*a[0] + a[1]*a[1];
            int d2=b[0]*b[0] + b[1]*b[1];
            return d2-d1; //maxheap
        });

        for(int[] i:points){
            pq.offer(i);
            if(pq.size()>k)
                pq.poll();
        }

        int[][] ans= new int[pq.size()][2];
        for(int i=0;i<k;i++)
            ans[i]=pq.poll();
        
        return ans;

    }
}
