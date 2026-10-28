class Solution {
    public String longestPalindrome(String s) {
        String str= "";
        int strlen=0,l=0,r=0;

        for(int i=0;i<s.length();i++){
            //odd len strings
            l=i;r=i;
            while((l>=0 && r<s.length()) && s.charAt(l)==s.charAt(r)){
                if(r-l+1 > strlen){
                    str=s.substring(l,r+1);
                    strlen=r-l+1;
                }
                l--;
                r++;
            }

            //even len strings
            l=i;r=i+1;
            while((l>=0 && r<s.length()) && s.charAt(l)==s.charAt(r)){
                if(r-l+1 > strlen){
                    str= s.substring(l,r+1);
                    strlen=r-l+1;
                }
                l--;
                r++;
            }

        }

        return str;
    }
}
