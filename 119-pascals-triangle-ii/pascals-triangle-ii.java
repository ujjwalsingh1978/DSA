class Solution {
    public List<Integer> getRow(int rowIndex) {
        List<List<Integer>> ans = new ArrayList<>();
        int n = rowIndex +1;
        for(int i =0; i<n; i++){
            List<Integer> row = new ArrayList<>();
            row.add(1);
            for(int j=1; j<i; j++){
                int sum = ans.get(i-1).get(j-1) + ans.get(i-1).get(j);
                row.add(sum);
            }
            if(i>0) row.add(1);
            ans.add(row);
        }
        return ans.get(rowIndex);
    }
}