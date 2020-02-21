class l32 {//这是个错误答案
    public int longestValidParentheses(String s) {
        int count = 0, now = 0, max = 0;
        for(int i = 0; i < s.length(); i++) {
            if(s.charAt(i) == ')') {
                count--;
                if(count >= 0) {
                    now += 2;
                } else {
                    max = Math.max(now, max);
                    count = 0; now = 0;
                }
            } else {
                count++;
            }
        }
        return Math.max(now, max);
    }
}