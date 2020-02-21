class l7 {
    public int reverse(int x) {
        boolean signed = x >= 0? false : true;
        x = Math.abs(x);
        long newx = 0;
        while(x > 0) {
            newx *= 10;
            newx += x % 10;
            x /= 10;
        }
        if(signed) newx = -newx;
        if(newx > Integer.MAX_VALUE || newx < Integer.MIN_VALUE) return 0;
        return (int)newx;
    }
}