class Solution {
    public int climbStairs(int n) {
        int n1 = 1, n2 = 2, count1 = 1, count2 = 2;
        while(n > n2) {
            n1 = n2 + 1;
            count1 = count1 + count2;
            n2 = n1 + 1;
            count2 = count1 + count2;
        }
        if(n == n1) return count1;
        return count2;
    }
}