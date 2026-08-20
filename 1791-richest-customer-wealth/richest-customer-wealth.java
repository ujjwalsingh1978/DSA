class Solution {
    public int maximumWealth(int[][] a) {
        int n = a.length;
       
        int maxsum = 0;
        for(int i=0; i<n; i++){
            int sum = 0;

            for(int j =0;j <a[i].length; j++){
                sum = sum + a[i][j];
                maxsum = Math.max(sum, maxsum);

            }
        }
        return maxsum;
    }
}