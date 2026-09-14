class Solution {
    public int[] searchRange(int[] nums, int target) {
        int n  = nums.length;
        int low =0;
        int high = n-1;
        int indx =-1;
        int indx2 = -1;
        while(low<=high){
            int mid = (low+high)/2;
            // int indx =-1;
            if(nums[mid]<target){
                low = mid+1;
            }
            else if(nums[mid]>target){
                high = mid-1;
            }
            else{
                indx = mid;
                high = mid -1;

            }
            //return indx;
        }
        low =0;
        high =n-1;
        
        while(low<=high){
            
            int mid=(low+high)/2;
            if(nums[mid]<target){
                low = mid+1;
            }
            else if(nums[mid]>target){
                high = mid-1;
            }
            else{
                indx2 = mid;
                low = mid +1;
            }
            //return indx;
        }
        return new int[]{indx , indx2};
    }
}