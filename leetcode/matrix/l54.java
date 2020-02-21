class Solution {
    public List<Integer> spiralOrder(int[][] matrix) {
       
        List<Integer> list = new ArrayList<>();
         if(matrix.length == 0) return list;
        if(matrix == null) return list;
        int m = matrix.length, n = matrix[0].length;
        for(int i = 0; i * 2 < Math.min(m, n); i++) {
            if(i *2 == m - 1) {
                for(int j = i; j < n - i; j++)
                    list.add(matrix[i][j]);
            } else if(i * 2 == n - 1) {
                for(int j = i; j < m - i; j++)
                    list.add(matrix[j][i]);
            } else{
            for(int j = i; j < n - i - 1; j++) {
                list.add(matrix[i][j]);
            }
            for(int j = i; j < m - i - 1; j++)
                list.add(matrix[j][n - 1 - i]);
            for(int j = n - i - 1; j > i; j--)
                list.add(matrix[m - 1- i][j]);
            for(int j = m - i - 1; j > i; j--)
                list.add(matrix[j][i]);}
        }
        return list;
    }
}