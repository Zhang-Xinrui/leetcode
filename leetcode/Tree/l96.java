class Solution {
    public int numTrees(int n) {
        if(n <= 2) return n;
        int[] nums= new int[n + 1];
        nums[0] = 1; nums[1] = 1; nums[2] = 2; 
        for(int i = 3; i <= n; i++) {
            for(int j = 1; j <= i; j++)
                nums[i] += nums[j - 1] * nums[i - j];
        }
        return nums[n];
    }
}