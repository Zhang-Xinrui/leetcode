class l29 {
    public int mySqrt(int x) {
        if(x == 0 || x == 1) return x;
        int low = 1, high = x;
        int mid = low + (high - low) / 2;
        while(low < high) {
            if(mid <= x / mid) low = mid + 1;
            else high = mid;
            mid = low + (high - low) / 2;
        }
        return low - 1;
    }
}