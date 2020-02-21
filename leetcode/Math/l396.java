class l396 {
    public int maxRotateFunction(int[] A) {
        long sum = 0; int firstone = 0;
        for(int i = 0; i < A.length; i++) {
            sum += A[i];
            firstone += A[i] * i;
        }
        int max = firstone;
        for(int i = 0; i < A.length; i++) {
            firstone -= sum;
            firstone += A.length * A[i];
            if(firstone > max) max = firstone;
        }
        return max;
    }
}