class l392 {
    public boolean isSubsequence(String s, String t) {
        int si = 0, ti = 0;
        while(ti < t.length() && si < s.length()) {
            if(s.charAt(si) == t.charAt(ti)) si++;
            ti++;
        }
        if(si == s.length()) return true;
        return false;
    }
}