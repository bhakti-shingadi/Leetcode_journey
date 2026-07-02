class Solution {
    public boolean isPalindrome(int nums) {
        int og=nums ;
        int rev=0;
        while (nums>0){
            rev=rev*10+nums%10;
            nums/=10;
        }
        return og==rev;

    }
}