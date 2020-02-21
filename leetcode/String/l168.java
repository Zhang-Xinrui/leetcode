class l168 {
    public String convertToTitle(int n) {
        String newone = new String();
        n--;
        if(n == 0) return "A";
        while(n > 0) {
            newone = (char)('A' + n % 26) + newone;
            n = n / 26;
        }
        return newone;
    }
}