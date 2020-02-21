class l395 {
    public int longestSubstring(String s, int k) {
        if(k <= 1) return s.length();
        return help(s, 0, s.length(), k);
    }
    public int help(String s, int low, int high, int k) {
        if(high - low < k) return 0;
        int[] count = new int[26];
        for(int i = low; i < high; i++)
            count[s.charAt(i) - 'a']++;
        for(int i = 0; i < 26; i++) {
            if(count[i] < k) {
                for(int j = low; j < high; j++) {
                    if(s.charAt(j) == i + 'a') {
                        return Math.max(help(s, low, j, k), help(s, j + 1, high, k));
                    }
                }
            }
        }
        return high - low;
    }
}