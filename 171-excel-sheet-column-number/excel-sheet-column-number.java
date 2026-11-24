class Solution {
    public int titleToNumber(String c) {
        
        int res = 0;
        for(int i =0; i<c.length(); i++){
            int value = c.charAt(i) - 'A' +1; 
            res = (res * 26) + value;
        }
        return res;
    }
}