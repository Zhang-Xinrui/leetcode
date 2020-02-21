class Solution {
    public int rangeBitwiseAnd(int m, int n) {
        int result = 1;
        while(m != n) {
            m >>= 1;
            n >>= 1;
            result <<= 1;
        }
        return result * m;
    }
}