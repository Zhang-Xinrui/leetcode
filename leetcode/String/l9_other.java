class l9 {
    public boolean isPalindrome(int x) {
        String number = Integer.toString(x);
        String newnumber = new StringBuilder(number).reverse().toString();
        if(number.equals(newnumber)) return true;
        return false;
    }
}