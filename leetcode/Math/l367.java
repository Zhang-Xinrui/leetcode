class l367 {
    public boolean isPerfectSquare(int num) {
        int low = 1, high = num, mid;
        while(high > low) {
            mid = low + (high - low) / 2;
            if(mid * mid < num) low = mid + 1;
            else high = mid;
        }
        if(num == low * low) return true;
        return false;
    }
}