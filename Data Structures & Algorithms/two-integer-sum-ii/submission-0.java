class Solution {
    public int[] twoSum(int[] numbers, int target) {
        int l=0;
        int r=numbers.length-1;
        int[] fin=new int[2];

        while(l<=r)
        {
            if(numbers[l]+numbers[r]==target)
            {
                fin[0]=++l;
                fin[1]=++r;
                break;
            }
            else if(numbers[l]+numbers[r]>=target)
            {
                r--;
            }
            else
            {
                l++;
            }
        }
        return fin;
    }
}
