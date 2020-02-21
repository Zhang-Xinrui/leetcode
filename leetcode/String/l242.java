class l242 {
    public boolean isAnagram(String s, String t) {
        if(s.length() != t.length()) return false;
        int[] ch_nums = new int[26];
        for(int i = 0; i < s.length(); i++) {
            ch_nums[s.charAt(i) - 'a']++;
            ch_nums[t.charAt(i) - 'a']--;
        }
        for(int i = 0; i < 26; i++)
            if(ch_nums[i] != 0)
                return false;
        return true;
    }
}