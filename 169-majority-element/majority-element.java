class Solution {
    public int majorityElement(int[] nums) {
        HashMap<Integer, Integer> map = new HashMap<>();
        for(int ele: nums){
            if(!map.containsKey(ele)) map.put(ele, 1);
            else{
                int freq = map.get(ele);
                map.put(ele, freq+1);
            }
        }
        int min = 0;
        int ans =0;
        for(int n : nums){
            if(map.get(n)> min){
                min = map.get(n);
                ans = n;
            }
        }
        return ans;

    }
}