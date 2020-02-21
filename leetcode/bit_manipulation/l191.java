public class Solution {
    // you need to treat n as an unsigned value
    public int hammingWeight(int n) {
        int result = 0;
        if(n < 0) {result = 1; n ^= 1 << 31;}
        while(n != 0) {
            if(n % 2 == 1) result++;
            n >>>= 1;
        }
        return result;
    }
}