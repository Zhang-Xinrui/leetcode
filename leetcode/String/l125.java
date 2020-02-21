class l125 {
    public boolean isPalindrome(String s) {
        int left = 0, right = s.length() - 1;
        while(left < right) {
            while(left < right && !judge(s.charAt(left))) left++;
            while(left < right && !judge(s.charAt(right))) right--;
            if(s.charAt(left) != s.charAt(right))
                if(Math.abs(s.charAt(left) - s.charAt(right)) != Math.abs('A' - 'a') || numericaljudge(s.charAt(left)) || numericaljudge(s.charAt(right)))
                    return false;
            right--;left++;
        }
        return true;
    }
    private boolean numericaljudge(char ch) {
        if(ch >= '0' && ch <= '9') return true;
        return false;
    }
    private boolean judge(char ch) {
        if(ch >= 'a' && ch <= 'z') return true;
        if(ch >= 'A' && ch <= 'Z') return true;
        if(ch >= '0' && ch <= '9') return true;
        return false;
    }
}