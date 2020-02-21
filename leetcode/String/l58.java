class l58 {
    public int lengthOfLastWord(String s) {
        int right_index = 0, i = s.length() - 1;
            while(i >= 0 && s.charAt(i) == ' ') i--;
            right_index = i;
            while(i >= 0 && s.charAt(i) != ' ') i--;
            return right_index - i;
       
    }
}