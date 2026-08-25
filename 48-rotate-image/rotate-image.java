class Solution {
    public void rotate(int[][] arr) {
        for(int i =0; i<arr.length; i++){
            for(int j =0; j<i; j++){
                int temp = arr[i][j];
                arr[i][j] = arr[j][i];
                arr[j][i]= temp;
            }
        }
        for(int k = 0; k<arr.length; k++){
        int low=0;
        int high = arr[0].length-1;
        
            while(low<high){
                int temp =arr[k][low];
                arr[k][low]= arr[k][high];
                arr[k][high]= temp;
                low++;
                high--;
            }
        }

       
    }
}