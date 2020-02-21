class Solution { //使用matrix自身来存储相关归零信息，其中一定要注意第一行第一列
    public void setZeroes(int[][] matrix) {
        if(matrix.length == 0 || matrix[0].length == 0) return;
        boolean fline = false, fcolumn = false;
        for(int i = 0; i < matrix.length; i++)
            for(int j = 0; j < matrix[0].length; j++) {
                if(matrix[i][j] == 0) {
                    if(i == 0) fline = true;
                    else matrix[i][0] = 0; 
                    if(j == 0) fcolumn = true;
                    else matrix[0][j] = 0;
                }
            }
        for(int i = 1; i < matrix.length; i++) {
            if(matrix[i][0] == 0) {
                    for(int j = 0; j < matrix[0].length; j++)
                        matrix[i][j] = 0;
            }
        }
        for(int i = 1; i < matrix[0].length; i++)
            if(matrix[0][i] == 0) 
                for(int j = 0; j < matrix.length; j++)
                    matrix[j][i] = 0;
        if(fline)
            for(int i = 0; i < matrix[0].length; i++)
                matrix[0][i] = 0;
        if(fcolumn)
            for(int i = 0; i < matrix.length; i++)
                matrix[i][0] = 0;
        return;
    }
}