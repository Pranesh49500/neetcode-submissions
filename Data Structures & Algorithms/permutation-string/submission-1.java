class Solution {
    public boolean checkInclusion(String s1, String s2) {

        char[] arr1 = s1.toCharArray();
        Arrays.sort(arr1);
        String sorted1 = new String(arr1);

        if(s1.length()>s2.length())
            return false;
        
        int k=s1.length();
        for(int i=0;i<=s2.length()-k;i++)
        {
            String substr=s2.substring(i,i+k);
            char[] arr2 = substr.toCharArray();
            Arrays.sort(arr2);
            String temp = new String(arr2);

            if(sorted1.equals(temp))
                return true;
        }
        return false;
    }
}
