class Solution {
    public int[][] generateMatrix(int n) {
        int[][] result = new int[n][n]; int now = 1;
        for(int i = 0; i * 2 < n; i++) {
            if(i * 2 == n - 1) {
                result[i][i] = now; return result;
            }
            for(int j = i; j < n - 1 - i; j++)
                result[i][j] = now++;
            for(int j = i; j < n - 1 - i; j++)
                result[j][n - 1 - i] = now++;
            for(int j = n - 1 - i; j > i; j--)
                result[n - 1- i][j] = now++;
            for(int j = n - 1 - i; j > i; j--)
                result[j][i] = now++;
        }
        return result;
    }
}