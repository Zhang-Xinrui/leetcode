class l50 {
    public double myPow(double x, int n) {
        double[] results = new double[31];
        int[] powtwo = new int[31];
        powtwo[0] = 1; results[0] = x;
        for(int k = 1; k < 31; k++) {
            powtwo[k] = 2 * powtwo[k - 1];
            results[k] = results[k - 1] * results[k - 1];
        }
        double pow = 1; int k = 30;
        int signed = n < 0 ? 1 : 0;
        while(n > 0) {
            if(n >= powtwo[k]) {
                pow *= results[k]; n -= powtwo[k];
            } else {
                k--;
            }
        }
        while(n < 0) {
            if(n <= -powtwo[k]) {
                pow *= results[k]; n += powtwo[k];
            } else {
                k--;
            }
        }
        if(signed == 1) return 1 / pow;
        return pow;
    }
}