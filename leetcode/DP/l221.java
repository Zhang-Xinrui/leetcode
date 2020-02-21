class Solution {
    public int maximalSquare(char[][] matrix) {
        if(matrix.length == 0) return 0;
        int n = matrix.length, l = matrix[0].length;
        boolean[][] dp = new boolean[n][l];
        boolean judge = false; int k = 0;
        for(int i = 0; i < n; i++)
            for(int j = 0; j < l; j++)
                if(matrix[i][j] == '1') {dp[i][j] = true; judge = true;}
        while(judge) {
            k++; judge = false;
            for(int i = 0; i < n - k; i++)
                for(int j = 0; j < l - k; j++) {
                    if(dp[i][j]) {
                        dp[i][j] = false;
                        if(dp[i + 1][j + 1] && matrix[i][j + k] == '1' && matrix[i + k][j] == '1') {
                            dp[i][j] = true; judge = true;
                        }
                    }
            }
        }
        return k * k;
    }
}