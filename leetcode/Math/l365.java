class l365 {
    public boolean canMeasureWater(int x, int y, int z) {
        int gcdnum = gcd(Math.max(x, y), Math.min(x, y));
        if(gcdnum != 0 && z % gcdnum == 0 && x + y >= z) return true;
        if(z == 0) return true;
        return false;
    }
    private int gcd(int x, int y) {
        return y == 0 ? x : gcd(y, x % y);
    }
}