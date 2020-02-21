class l357 {
    public int countNumbersWithUniqueDigits(int n) {
        if(n > 10) n = 10;
        int count = 1; //这里指0
        int now = 0;
        for(int i = 9;; i--) {
            n--; 
            if(n < 0) break;
            if(now == 0) {
                now = 9; i++;
            } else {
                now *= i;
            }
            count += now;
        }
        return count;
    }
}