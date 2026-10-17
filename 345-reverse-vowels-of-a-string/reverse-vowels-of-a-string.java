class Solution {
    public String reverseVowels(String s) {
        int n= s.length();
        char [] ch = s.toCharArray();
        int i =0;
        int j = n-1;
        while(i<=j){
            if(!isVowel(ch[i]) ){
                i++;

            }
            else if(!isVowel(ch[j])){
                j--;
            }
            else{
                char temp = ch[i];
                ch[i] = ch[j];
                ch[j] = temp;
                i++;
                j--;
            }
            
        }   
        return String.valueOf(ch);
    }
    public static boolean isVowel(char ch){
        if(ch =='a' || ch=='e' || ch=='i' ||ch=='o' || ch=='u' || ch =='A'|| ch== 'E' || ch=='I'|| ch =='O'|| ch=='U'){
            return true;
        }
        else return false;
    }
}