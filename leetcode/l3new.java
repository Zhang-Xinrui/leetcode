
class l3 {
    public int lengthOfLongestSubstring(String s) {
        int low = 0, high = 0, max = 0;//滑动窗口解法
        int[] count = new int[256];
        while(high < s.length()) {
            if(count[s.charAt(high)] == 0) {
                count[s.charAt(high)]++;
                high++;
            } else {
                count[s.charAt(low)]--;
                low++;
            }
            if(high - low > max) {
                max = high - low;
            }
        }
        return max;
    }
}