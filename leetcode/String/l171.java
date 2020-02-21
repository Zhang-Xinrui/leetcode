class l171 {
    public int titleToNumber(String s) {
        int num = 0;
        for(int i = 0; i < s.length(); i++) {
            num *= 26;
            num += s.charAt(i) - 'A' + 1;
        }
        return num;
    }
}