class Solution {
    public String mergeAlternately(String word1, String word2) {
        int l=0,r=0;
        int n1=word1.length();
        int n2=word2.length();
        String fin="";

        while(l<n1 && r<n2)
        {
            fin+=word1.charAt(l);
            fin+=word2.charAt(r);
            l++;
            r++;
        }
        while(l<n1)
        {
            fin+=word1.charAt(l);
            l++;
        }
        while(r<n2)
        {
            fin+=word2.charAt(r);
            r++;
        }
        return fin;
    }
}