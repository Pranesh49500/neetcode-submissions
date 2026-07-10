class Solution {
    public String decodeString(String s) {
        Stack<Integer> nst= new Stack<>();
        Stack<StringBuilder> strst= new Stack<>();

        int num=0;
        StringBuilder ans=new StringBuilder();

        for(char c:s.toCharArray())
        {
            if(Character.isDigit(c))
                num=(num*10)+(c-'0');
            else if(c=='['){
                nst.push(num);
                num=0;
                strst.push(ans);
                ans=new StringBuilder();
            }
            else if(c==']'){
                String str= ans.toString();
                ans=new StringBuilder(str.repeat(nst.pop()));
                ans= strst.pop().append(ans);
            }
            else{
                ans.append(c);
            }
        }
        return ans.toString();
    }
}