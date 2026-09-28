class Solution {
    public boolean canConstruct(String s1, String s2) {
        int [] freq = new int[26];

        for(int i=0; i<s2.length(); i++){
            freq[s2.charAt(i)- 'a']++;
        }

        for(int i =0; i<s1.length(); i++){
            freq[s1.charAt(i) - 'a']--;
            if(freq[s1.charAt(i)-'a']<0){
                return false;
            }
        }
        return true;
        
    }
}