class Solution {
    public int[] rearrangeArray(int[] nums) {
        int n = nums.length;
        int j = 0;
        int [] ans = new int[n];
        for(int i = 0; i<n; i++){
            if(nums[i] >0 ){
                ans[j] = nums[i];
                j=j+2;
            }
            
            
            
        }
        j =1;
        for(int k =0; k<n; k++){
            if(nums[k]<0){
                ans[j] =  nums[k];
                j =j+2;
            }
        }
        return ans;
    }
}