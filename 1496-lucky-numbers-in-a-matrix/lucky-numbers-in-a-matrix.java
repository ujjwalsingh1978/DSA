class Solution {
    public List<Integer> luckyNumbers(int[][] matrix) {
        List<Integer> ans = new ArrayList<>();
        int row = matrix.length;
        int cols = matrix[0].length;
        int [] rowMin  = new int[row];
        int [] colMax  = new int[cols];

        for(int i=0; i<row; i++){
            rowMin[i] = Integer.MAX_VALUE;
            for(int j =0; j<cols; j++ ){
                rowMin[i] = Math.min(rowMin[i],matrix[i][j]);
            }
        }

        for(int i=0; i<cols; i++){
            colMax[i] = Integer.MIN_VALUE;
            for(int j =0; j<row; j++ ){
                colMax[i] = Math.max(colMax[i],matrix[j][i]);
            }
        }
        for(int i =0; i<row; i++){
            for(int j =0; j<cols; j++){
                if(matrix[i][j]==rowMin[i] && matrix[i][j]==colMax[j] ){
                    ans.add(matrix[i][j]);
                }
            }
        }
        return ans;
    }
}