class l345new {
    public String reverseVowels(String s){ //该答案由于占用空间过大不能AC，应该使用char数组吧
        String left = new String(), right = new String();
        int leftindex = 0, rightindex = s.length() - 1;
        while(rightindex > leftindex) {
            while(rightindex > leftindex && !judgevowels(s.charAt(leftindex))) left += s.charAt(leftindex++);
            while(rightindex > leftindex && !judgevowels(s.charAt(rightindex))) right = s.charAt(rightindex--) + right;
            if(rightindex > leftindex) {left += s.charAt(rightindex--); right = s.charAt(leftindex++) + right;}
        }
        if(rightindex < leftindex) return left + right;
        else return left + s.charAt(leftindex) + right;
    }
    private boolean judgevowels(char s) {
        if(s == 'a' || s == 'e' || s == 'i' || s == 'o' || s == 'u' || s == 'A' || s == 'E' || s == 'I' || s == 'O' || s == 'U') {
            return true;
        }
        return false;
    }
}