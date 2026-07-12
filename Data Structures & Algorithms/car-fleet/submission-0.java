class Solution {
    public int carFleet(int target, int[] position, int[] speed) {
        int[][] pair= new int[position.length][2];

        for(int i=0;i<speed.length;i++){
            pair[i][0]=position[i];
            pair[i][1]=speed[i];
        }
        Arrays.sort(pair,(a,b)->Integer.compare(a[0],b[0]));

        Stack<Float> st= new Stack<>();

        for(int i=position.length-1;i>=0;i--){
            st.push((float)(target-pair[i][0])/pair[i][1]);
            if(st.size()>=2){
                float top=st.pop();
                if(top<=st.peek())
                    continue;
                else
                    st.push(top);
            }
            
        }

        return st.size();
    }
}
