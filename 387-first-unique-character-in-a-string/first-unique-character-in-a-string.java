class Solution {
    public int firstUniqChar(String s) {
        HashMap<Character, Integer> map = new HashMap<>();
        
        for(int i=0; i<s.length(); i++){
            char ch = s.charAt(i);
            if(!map.containsKey(ch)) map.put(ch, 1);
            else{
                int freq = map.get(ch);
                map.put(ch , freq+1);
            }
        }
        for(int j =0; j<s.length(); j++){
            char ele = s.charAt(j);
            if(map.get(ele) == 1) return j;
        }
        return -1;

    }
}