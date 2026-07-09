class Solution {
    public String removeOuterParentheses(String s) {
        int n = s.length();
        StringBuilder ans= new StringBuilder();
        int opened = 0;
        for(int i =0; i< n; i++){
            char c = s.charAt(i);
            if(c=='('){
            if(opened>0){
                ans.append(c);
            }
            opened++;
        }else{
            opened--;
            if(opened>0){
                ans.append(c);
            }
        }
    
    } return ans.toString();
    }
}