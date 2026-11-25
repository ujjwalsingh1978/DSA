class Solution {
    public String convertToTitle(int col) {
        StringBuilder ans = new StringBuilder();
        while(col>0){
            col--;
            int rem = col%26;
            char ch  = (char)('A' + rem);
            ans.append(ch);
            col = col/26;
        }
        return ans.reverse().toString();
    }
}