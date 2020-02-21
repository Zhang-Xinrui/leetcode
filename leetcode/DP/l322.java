class Solution {
    public int coinChange(int[] coins, int amount) {
        if(amount == 0) return 0;
        int[] dp = new int[amount + 1];
        for(int i = 0; i < coins.length; i++)
            if(coins[i] <= amount) dp[coins[i]] = 1;
        for(int i = 1; i <= amount; i++) { //dp[i]
            if(dp[i] == 1) continue;
            for(int j = 0; j < coins.length; j++) {
                if(coins[j] > i || dp[i - coins[j]] == 0) continue;
                if(dp[i] == 0) dp[i] = 1 + dp[i - coins[j]];
                else dp[i] = Math.min(dp[i], 1 + dp[i - coins[j]]);
                if(dp[i] == 2) break;
            }
        }
        if(dp[amount] == 0) return -1;
        return dp[amount];
    }
}