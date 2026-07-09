class Solution {
     String[] keypad={"", "", "abc", "def", "ghi", "jkl", "mno", "pqrs", "tuv", "wxyz"};
    public List<String> letterCombinations(String digits) {
        if (digits.length() == 0) {
            return new ArrayList<>();
        }
        return padRet("", digits);
    }
    public List<String> padRet(String p, String up) {
        if (up.isEmpty()) {
            List<String> list = new ArrayList<>();
            list.add(p); 
            return list;
        }
        int digit = up.charAt(0) - '0'; 
        String letters = keypad[digit]; 

        List<String> list = new ArrayList<>();

        for (int i = 0; i < letters.length(); i++) {
            char ch = letters.charAt(i);
            
            list.addAll(padRet(p + ch, up.substring(1)));
        }
        
        return list;
    }
}

