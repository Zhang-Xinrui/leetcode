class l65 { //这个题目中不光要求有，还要求数量达到。这个题目暂时未完成
    public String minWindow(String s, String t) {
        if(t.length() == 0 || s.length() < t.length()) return  "";
        int count[] = new int[t.length()];
        int left = 0, right = 0, match = 0, index;
        int min_win = Integer.MAX_VALUE; String min = "";
        while(right < s.length()) {
            index = findindex(t, s.charAt(right));
            if(index >= 0) {
                if(count[index]++ == 0) {
                    match++;
                    while(match == t.length()) {
                        index = findindex(t, s.charAt(left++));
                        if(index >= 0) {
                            if(--count[index] == 0) {
                                if(right - left + 2 < min_win) {
                                    min_win = right - left + 2;
                                    min = s.substring(left - 1, right + 1);
                                }
                                match--;
                            }
                        }
                    }
                }
            }
            right++;
        }
        return min;
    }
    private int findindex(String t, char ch) {
        for(int i = 0; i < t.length(); i++) {
            if(t.charAt(i) == ch) return i;
        }
        return -1;
    }
}