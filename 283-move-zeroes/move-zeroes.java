class Solution {
    public void moveZeroes(int[] nums) {
        int i =0;
        int n = nums.length;
        for(int j=0; j<n; j++){
            if(nums[j] != 0){
                int temp = nums[i];
                nums[i] = nums[j];
                nums[j] = temp;  // we swap the value. When we find a non zero value we put the value front
                i++; 
            }
        }
    }
}