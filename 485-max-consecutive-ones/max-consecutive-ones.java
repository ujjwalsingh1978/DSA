class Solution {
    public int findMaxConsecutiveOnes(int[] nums) {
        int count =0;
        int maxcount= 0; 
        int n= nums.length;
        for(int i =0; i<n; i++){
            if(nums[i] == 1){
                count++;
                maxcount = Math.max(count, maxcount);
            }
            if(nums[i] != 1){
                
                count =0;
            }
        }
        return maxcount;
    }
}