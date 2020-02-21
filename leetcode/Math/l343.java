class l343 {
    public int integerBreak(int n) {
        if(n < 4) return n - 1;
        int product = 1;
        while(n > 4) {
            n -= 3;
            product *= 3;
        }
        return product * n;
    }
}