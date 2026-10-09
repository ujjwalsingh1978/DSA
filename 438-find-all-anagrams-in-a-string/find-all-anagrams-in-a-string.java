class Solution {
    public List<Integer> findAnagrams(String s, String p) {
        List<Integer> ans = new ArrayList<>();

        if(s.length()<p.length()){
            return ans;
        }
        
        int []freqp = new int[26];
        int [] freq2 = new int[26];
        
        for(int  i=0; i<p.length(); i++){
            freqp[p.charAt(i) - 'a']++;
        }

        int i =0; 
        int j =0;
        while(j<s.length()){
            freq2[s.charAt(j) -'a']++;
            
            if(j-i+1 > p.length()){
                freq2[s.charAt(i) -'a']--;
                i++;
            }

            if(j-i+1 == p.length()){
                if(Arrays.equals(freqp , freq2)){
                    ans.add(i);
                }
                
            }
            j++; 

        }
        return ans;
    }
}