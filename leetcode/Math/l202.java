class l202 {
    public boolean isHappy(int n) {
        int x = n, y = n;
        while(true) {
            x = cal(x);
            y = cal(cal(y));
            if(x == 1 || y == 1) return true;
            if(x == y) return false;
        }
    }
    private int cal(int n) {
        int result = 0;
        while(n > 0) {
            result += (n % 10) * (n % 10);
            n /= 10;
        }
        return result;
    }
}