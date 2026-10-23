class Solution {
    public int maxVowels(String s, int k) {
         
        

        
        int vowel = 0;
        for(int i =0; i<k; i++){
            if(isVowel(s.charAt(i))){
                vowel++;
            }
        }
        int maxvowel = vowel;
        for(int high = k; high<s.length(); high++){
            if(isVowel(s.charAt(high-k))){
                vowel--;
            }
            if(isVowel(s.charAt(high))){
                vowel++;
            }

            

            maxvowel = Math.max(vowel, maxvowel);

        }
        return maxvowel;
    }
    public static boolean isVowel(char ch){
        if(ch == 'a' || ch =='e' || ch== 'i' || ch == 'o' || ch == 'u'){
            return true;
        }
        else {
            return false;
        }    
    }
}