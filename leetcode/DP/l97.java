class Solution {
    public boolean isInterleave(String s1, String s2, String s3) {
        if(s1.length() + s2.length() != s3.length()) {
            return false;
        }
    int l1 = s1.length(), l2 = s2.length();
        boolean dp[][] = new boolean[l1 + 1][l2 + 1];
        dp[0][0] = true;
        for(int i = 0; i <= l1; i++)
            for(int j = 0; j <= l2; j++) {
                if(i == 0 && j == 0) continue;
                if(i != 0 && dp[i - 1][j] == true) {
                    if(s1.charAt(i - 1) == s3.charAt(i + j - 1)) dp[i][j] = true;
                }
                if(j != 0 && dp[i][j - 1] == true) {
                    if(s2.charAt(j - 1) == s3.charAt(i + j - 1)) dp[i][j] = true;
                }
        }
        return dp[l1][l2];
    }
}