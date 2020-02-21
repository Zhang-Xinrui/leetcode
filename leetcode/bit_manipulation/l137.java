class Solution {
    public int singleNumber(int[] nums) {
        Set<Integer> set = new HashSet<>(); long sum = 0;
        for(Integer i : nums) {
            set.add(i); sum += i;
        }
        for(Integer i : set) {
            sum = sum - i - i - i;
        }
        return - (int)(sum >> 1);
    }
}