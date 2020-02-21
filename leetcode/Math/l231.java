class l231 {
    public boolean isPowerOfTwo(int n) {
        int i = 1;
        while(n > i) {
            if(i > Integer.MAX_VALUE / 2) return false;
            i *= 2;
        }
        if(i == n) return true;
        return false;
    }
}