class Solution {
    public boolean containsNearbyDuplicate(int[] arr, int k) {
        HashMap<Integer, Integer> map = new HashMap<>();
        for(int i =0; i<arr.length; i++){
            if(!map.containsKey(arr[i])) map.put(arr[i] , i);
            else{
                int freq = map.get(arr[i]);
                int count = i-freq;
                if(count <=k ) return true;
                map.put(arr[i], i);
            }
        }
        return false;
        
    }
}