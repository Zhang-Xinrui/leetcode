class l151 {
    public String reverseWords(String s) {
        String news = new String(); int i = s.length() - 1, rightindex;
        while(i >= 0) {
            while(i >= 0 && s.charAt(i) == ' ') i--;
            rightindex = i + 1;
            while(i >= 0 && s.charAt(i) != ' ') i--;
            if(rightindex > i + 1) news += s.substring(i + 1, rightindex) + " ";
            if(i < 0 && news.length() > 0) return news.substring(0, news.length() - 1);
        }
        return news;
    }
}