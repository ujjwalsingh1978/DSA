class Solution {
    public int maxArea(int[] height) {
        int n = height.length;
        int maxarea = 0;
        int i =0; 
        int j = n-1;
        while(i<=j){
            int wid = (j-i);
            int area = 0;
            if(height[i]>height[j]){
                area = (wid*height[j]);
                j--;
            } 

            else if(height[i]<height[j]){
                area = (wid*height[i]);
                i++;
            }
            else{
                area = (wid*height[i]);
                i++;
                j--;
            }
            maxarea = Math.max(area,maxarea);
            
        }
        return maxarea;
    }
}