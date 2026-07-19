class Solution {
    public boolean containsDuplicate(int[] nums) {
        HashMap<Integer, Integer> map = new HashMap<>();
        for(int ele : nums){
            if(!map.containsKey(ele)) map.put(ele, 1);
            else{
                int freq = map.get(ele);
                map.put(ele, freq+1);
            }
        }
        for(int i : nums){
            if(map.get(i)>=2) return true;
        }
        return false;
        
    }
}