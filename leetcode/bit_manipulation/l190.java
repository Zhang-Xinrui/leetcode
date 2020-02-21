public class Solution {
    // you need treat n as an unsigned value
    public int reverseBits(int n) {
        int result = 0; int now = 1 << 31;
        if(n == 0) return n;
        else if(n < 0) {result = 1; n ^= (1 << 31);}
        for(int i = 0; i < 31; i++) {
            if(n % 2 != 0) result |= now;
            n >>>= 1; now >>>= 1;
        }
        return result;
    }
}