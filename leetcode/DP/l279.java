class Solution {
    public int numSquares(int n) { //注意，完全平方数是不用保存的，毕竟平方！
        int[] dp = new int[n + 1];
        dp[1] = 1; dp[0] = 0;
        for(int i = 2; i < n + 1; i++) {
            for(int j = 1; j * j <= i; j++) {
                if(dp[i] == 0) dp[i] = dp[i - j * j] + 1;
                else dp[i] = Math.min(dp[i], dp[i - j * j] + 1);
            }
        }
        return dp[n];
    }
}