class Solution { //这是一个比较正常的解法
    public int singleNumber(int[] nums) {
        Set<Integer> set = new HashSet<>();
        for(int i = 0; i < nums.length; i++) {
            if(set.contains(nums[i])) {
                set.remove(nums[i]);
            } else {
                set.add(nums[i]);
            }
        }
        Iterator iter = set.iterator();
        return (int)iter.next();
    }
}

class Solution { //一般人想不出的使用数学的解法。还有一个使用异或运算的解法，更冷门。
    public int singleNumber(int[] nums) {
        Set<Integer> set = new HashSet<>(); int sum = 0;
        for(int i = 0; i < nums.length; i++) {
            set.add(nums[i]);
            sum += nums[i];
        }
        for(Integer i : set) {
            sum -= i * 2;
        }
        return -sum;
    }
}