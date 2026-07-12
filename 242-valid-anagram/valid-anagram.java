class Solution {
    public boolean isAnagram(String s, String t) {
        if(s.length()!= t.length()) return false;
        HashMap<Character, Integer> map = new HashMap<>();
        for(int i = 0; i<s.length(); i++){
            char ele = s.charAt(i);
            if(!map.containsKey(ele)) map.put(ele , 1);
            else{
                int freq = map.get(ele);
                map.put(ele, freq+1);
            }
        }
        for(int j =0; j<t.length(); j++){
            char ele = t.charAt(j);
            if(!map.containsKey(ele)) return false;
            int freq = map.get(ele);
            if(freq == 0) return false;
            map.put(ele,freq-1);
        }
        return true;

    }
}