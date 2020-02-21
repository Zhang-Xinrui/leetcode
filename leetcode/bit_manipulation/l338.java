class Solution {
    public int[] countBits(int num) {
        int[] count = new int[num + 1];
        count[0] = 0; int last = 1;
        while(last <= num) {
            for(int i = last; i < Math.min(num + 1, last * 2); i++)
                count[i] = count[i - last] + 1;
            last <<= 1;
        }
        return count;
    }
}