class l275 {
    public int hIndex(int[] citations) {
        int low = 0, high = citations.length - 1, mid;
        while(low <= high) {
            mid = (low + high) / 2;
            if(citations.length - mid > citations[mid]) {
                low = mid + 1;
            } else {
                high = mid - 1;
            }
        }
        return citations.length - low;
    }
}