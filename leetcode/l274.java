class l274 {
    public int hIndex(int[] citations) {
        int low = 0, high = citations.length, mid, countnum;
        mid = (low + high) / 2;
        while(high >= low) {
            countnum = count(citations, mid);
            if(countnum > mid) {
                low = mid + 1; 
            } else if(countnum < mid) {
                high = mid - 1;
            } else {
                return mid;
            }
            mid = (low + high) / 2;
        }
        return low - 1;
    }
    private int count(int[] citations, int num) {
        int sum = 0;
        for(int i = 0; i < citations.length; i++) {
            if(citations[i] >= num) {
                sum++;
            }
        }
        return sum;
    }
}