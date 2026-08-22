class Solution {
    public boolean canJump(int[] nums) {
        //if(nums[0]==nums.length-1) return true;
        int n= nums.length- 1;
        int count = 0; 
        int maxcount =0;
        for(int i=0; i<nums.length; i++){
            count = nums[i] + i;
            if(i>maxcount) return false;
            maxcount = Math.max(count , maxcount);
            if(maxcount >= n) return true;        
        }
        return false;
        
    }

    // public boolean canJump(int[] nums) {

    // int n = nums.length - 1;
    // int maxcount = 0;

    // for(int i = 0; i < nums.length; i++) {

    //     if(i > maxcount) return false;

    //     maxcount = Math.max(maxcount, nums[i] + i);

    //     if(maxcount >= n) return true;
    // }

    // return false;
}
