class Solution {
    public int lengthOfLongestSubstring(String s) {
        int n = s.length();
        if(n==0) { return 0;}

        int left=0;
        int maxLength=0;

        int[] lastSeen = new int[256];

        for (int i = 0; i < 256; i++) {
            lastSeen[i] = -1;
        }
        for(int right=0; right<n;right++){
            char currentChar= s.charAt(right);
            if(lastSeen[currentChar]!=-1){
                left = Math.max(left, lastSeen[currentChar] + 1);
            }
            lastSeen[currentChar]=right;
            maxLength = Math.max(maxLength, right - left + 1);
    }
    return maxLength;
    }
}