class l214 {//未完成
    
    public String shortestPalindrome(String s) {
        //既然只能在前面插入字符，最多插入与原字符串长度相等的字符数量。要不然就利用s开头的回文序列
        int high = s.length() - 1, left = 0, right, nextone = s.length();
        while(high > 0) {
            while(high > 0 && s.charAt(high) != s.charAt(0)) high--;
            right = high;
            while(right > left && s.charAt(right) == s.charAt(left)) {
                right--; left++;
                if(nextone == s.length() && s.charAt(right) == s.charAt(0)) nextone = right;
            }
            if(right <= left) break;
            high--; if(nextone != s.length()) {high = nextone; nextone = s.length();}
            left = 0;
        }
        if(high == s.length() - 1) return s;
        return new StringBuilder(s.substring(high + 1)).reverse().toString() + s;
    }
}