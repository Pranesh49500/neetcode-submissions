class Solution {
    public int countSubstrings(String s) {
        String str= "";
        int cnt=0,l=0,r=0;

        for(int i=0;i<s.length();i++){
            //odd len strings
            l=i;r=i;
            while((l>=0 && r<s.length()) && s.charAt(l)==s.charAt(r)){
                cnt++;
                l--;
                r++;
            }

            //even len strings
            l=i;r=i+1;
            while((l>=0 && r<s.length()) && s.charAt(l)==s.charAt(r)){
                cnt++;
                l--;
                r++;
            }

        }

        return cnt;
    }
}
