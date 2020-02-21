class l204 {
    public int countPrimes(int n) {//这是一个超时算法
        int count = 0, j;
        for(int i = 2; i < n; i++) {
            for(j = 2; j <= (int)Math.sqrt(i); j++) {
                if(i % j == 0) break;
            }
            if(j > (int)Math.sqrt(i)) count++;
        }
        return count;
    }
}