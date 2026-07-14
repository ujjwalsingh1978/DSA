class Solution {
    public int maxSubarraySumCircular(int[] nums) {
        int n= nums.length;
        int sum = 0;
        int maxsum = nums[0];

        int total =0;

        int currmin =0;
        int minsum = nums[0];
        
        for(int i=0; i<n; i++){
            
            sum = sum+nums[i];
            maxsum = Math.max(sum, maxsum);
            if(sum<0){
                sum = 0;
            }

            currmin += nums[i];
            minsum = Math.min(currmin, minsum);
            if(currmin>0){
                currmin = 0;
            }
            total += nums[i];
        }
        if(maxsum<0){
            return maxsum;
        }
        return Math.max(maxsum,total-minsum);
    }
}