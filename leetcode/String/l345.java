class l345 {
    public String reverseVowels(String s) {
        String vowels = new String(), news = new String();
        for(int i = 0; i < s.length(); i++) {
            if(judgevowels(s.charAt(i))) {
                vowels = s.charAt(i) + vowels;
            }
        }
        for(int si = 0, vi = vowels.length() - 1; si < s.length(); si++) {
            if(judgevowels(s.charAt(si))) {
                news += vowels.charAt(vi--);
            } else {
                news += s.charAt(si);
            }
        }
        return news;
    }
    private boolean judgevowels(char s) {
        if(s == 'a' || s == 'e' || s == 'i' || s == 'o' || s == 'u' || s == 'A' || s == 'E' || s == 'I' || s == 'O' || s == 'U') {
            return true;
        }
        return false;
    }
}