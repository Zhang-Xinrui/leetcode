class l390 {
    public int lastRemaining(int n) {
        int nownum = n, step = 1, head = 1;
        boolean left = true;
        while(nownum > 1) {
            if(left || nownum % 2 == 1) {
                head += step;
            }
            nownum /= 2;
            step *= 2;
            left = !left;
        }
        return head;
    }
}