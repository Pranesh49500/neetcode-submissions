class Solution {
    public int calPoints(String[] operations) {
        Stack<Integer> st= new Stack<>();
        int sum=0;

        for(String ch:operations){
            if(ch.equals("+") && !st.isEmpty()){
                int top=st.pop();
                int sec=st.peek();
                st.push(top);
                st.push(top+sec);
            }
            else if(ch.equals("D") && !st.isEmpty()){
                int val=st.peek();
                st.push(2*val);
            }
            else if(ch.equals("C") && !st.isEmpty())
                st.pop();
            else{
                st.push(Integer.parseInt(ch));
            }
        }

        while(!st.isEmpty()){
            sum+=st.pop();
        }
        return sum;
    }
}