class Solution {
    public int[] intersection(int[] nums1, int[] nums2) {
        HashMap<Integer, Integer> map = new HashMap<>();
        
        for(int ele : nums1){
           map.put(ele, 1);
            
        }
        ArrayList<Integer> ans = new ArrayList<>();
        for(int num : nums2){
            if(map.containsKey(num)){
                ans.add(num);
                map.remove(num);
            }
        }
        int[] res = new int[ans.size()];

        for(int i=0;i<ans.size();i++){
            res[i]=ans.get(i);
        }

        return res;

    }
}