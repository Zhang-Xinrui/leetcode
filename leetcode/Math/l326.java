class l326 {
    public boolean isPowerOfThree(int n) {
        int i = 1;
        while(i < n) {
            if(Integer.MAX_VALUE / 3 < i) return false;
            i *= 3;
        }
        if(i == n) return true;
        return false;
    }
}