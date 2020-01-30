class l3best {
    public int lengthOfLongestSubstring(String s) {
        int[] count = new int[257];
        int low = 0, max = 0;
        for(int i = 0; i < 257; i++) {  //注意，由于体系结构的关系，256会时间很长。
            count[i] = -1;
        }
        for(int i = 0; i < s.length(); i++) {
            if(count[s.charAt(i)] < low) {
                count[s.charAt(i)] = i;
            } else { //碰到重复字符
                if(i - low > max)
                    max = i - low;
                low = count[s.charAt(i)] + 1;
                count[s.charAt(i)] = i;
            }
        }
        if(max < s.length() - low) return s.length() - low;
        return max;
    }
}