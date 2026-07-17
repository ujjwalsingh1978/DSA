class Solution {
    public boolean canConstruct(String r, String m) {
        HashMap<Character , Integer> map = new HashMap<>();
        for(int i=0; i<m.length(); i++){
            char ch = m.charAt(i);
            if(!map.containsKey(ch)) map.put(ch,1);
            else{
                int freq = map.get(ch);
                map.put(ch , freq+1);
            }
        }
        for(int j =0; j<r.length(); j++){
            char ele= r.charAt(j);
            if(!map.containsKey(ele)) return false;
            int freq = map.get(ele);
            if(freq==0){
                return false;
            }
            map.put(ele, freq-1);

        }
        return true;
    }
}