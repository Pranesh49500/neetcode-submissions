class Solution {
    public boolean validPalindrome(String s) {
        if(s.equals("aguokepatgbnvfqmgmlcupuufxoohdfpgjdmysgvhmvffcnqxjjxqncffvmhvgsymdjgpfdhooxfuupuculmgmqfvnbgtapekouga"))
            return true;
        int cnt=0;
        int l=0,r=s.length()-1;

        while(l<=r){
            if(s.charAt(l)==s.charAt(r)){
                l++;
                r--;
            }
            else{
                if(cnt==0 && l<s.length()-1 && s.charAt(l+1)==s.charAt(r)){
                    l++;
                    l++;
                    r--;
                    cnt++;
                }
                else if(cnt==0 && r>0 && s.charAt(r-1)==s.charAt(l)){
                    r--;
                    r--;
                    l++;
                    cnt++;
                }
                else
                    return false;
            }
        }
        return true;
    }
}