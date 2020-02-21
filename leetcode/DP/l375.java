class Solution { //这个解法并不算很好
    public int getMoneyAmount(int n) {
        if(n <= 3) return n - 1;
        int[][] dp = new int[n + 2][n + 2];
        for(int i = 1; i < n + 2; i++)
            {dp[i][i] = 0; dp[i][i - 1] = 0;}
        for(int i = 1; i < n + 1; i++)
            dp[i][i + 1] = i;
        for(int len = 3; len <= n; len++) {
            for(int i = 1; i < n - len + 2; i++) {
                for(int k = i; k < i + len; k++) {
                    if(dp[i][i + len - 1] == 0) 
                        dp[i][i + len - 1] = k + dp[i + 1][i + len - 1];
                    else
                        dp[i][i + len - 1] = Math.min(dp[i][i + len - 1], k + Math.max(dp[i][k - 1], dp[k + 1][i + len - 1]));
                }
            }
        }
        return dp[1][n];
    }
}