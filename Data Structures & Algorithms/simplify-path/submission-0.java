class Solution {
    public String simplifyPath(String path) {
        Stack<String> st=new Stack<>();
        String[] paths=path.split("/");

        for(String s: paths){
            if(s.equals("") || s.equals("."))
                continue;
            else if(s.equals("..")){
                if(!st.isEmpty())
                    st.pop();
            }
            else
                st.push(s);
        }

        StringBuilder ans= new StringBuilder();
        for(String s:st){
            ans.append("/");
            ans.append(s);
        }

        if(ans.length()==0)
            return "/";

        return ans.toString(); 
    }
}