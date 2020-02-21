class l179 {
    public String largestNumber(int[] nums) {
        String[] numbers = new String[nums.length];
        for(int i = 0; i < nums.length; i++)
            numbers[i] = Integer.toString(nums[i]);
        String number = new String();
        for(String s : sort(numbers, 0, nums.length))
            number += s;
        return number;
    }
    private String[] sort(String[] numbers, int low, int high) {
        if(high <= low + 1) return numbers;
        int mid = low + (high - low) / 2;
        String[] left = new String[mid - low];
        String[] right = new String[high - mid];
        String[] sortstring = new String[high - low];
        left = sort(numbers, low, mid);
        right = sort(numbers, mid, high);
        int leftindex = 0, rightindex = 0, allindex = 0;
        while(leftindex < mid - low && rightindex < high - mid) {
            if(!compare(numbers[leftindex], numbers[rightindex])) {
                sortstring[allindex++] = right[rightindex++];
            } else {
                sortstring[allindex++] = left[leftindex++];
            }
        } 
        while(leftindex < mid) sortstring[allindex++] = left[leftindex++];
        while(rightindex < mid) sortstring[allindex++] = right[rightindex++];
        return sortstring;
    }
    private boolean compare(String s1, String s2) {
        int i = 0;
        while(i < Math.min(s1.length(), s2.length()) && s1.charAt(i) == s2.charAt(i)) i++;
        if(i == s1.length())
            return true; //s1 > s2
        else if(i == s2.length())
            return false;
        else if(s1.charAt(i) < s2.charAt(i))
            return false;
        return true;
    }
}