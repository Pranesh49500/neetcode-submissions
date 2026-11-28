class Solution {
    public String longestCommonPrefix(String[] strs) {
        Arrays.sort(strs);
        int l=0,r=0;

        String first=strs[0];
        String last=strs[strs.length-1];
        //first=dag , last=damage
        while(l<first.length() && r<last.length()){
            if(first.charAt(l)==last.charAt(r)){
                l++;
                r++;
            }
            else
                break;
        }

        return first.substring(0,l);
    }
}