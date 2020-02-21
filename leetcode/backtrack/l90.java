class Solution {
    List<List<Integer>> result;
    public List<List<Integer>> subsetsWithDup(int[] nums) {
        Arrays.sort(nums);
        result = new ArrayList<>();
        List<Integer> nowlist = new ArrayList<>();
        help(nums, 0, nowlist);
        return result;
    }
    private void help(int[] nums, int index, List<Integer> nowlist) {
        if(index < nums.length) {
            int thisone = nums[index];
            List<Integer> newlist = new ArrayList<>(nowlist);
            newlist.add(nums[index]);
            help(nums, ++index, newlist);
            while(index < nums.length && nums[index] == thisone)
                index++;
            help(nums, index, nowlist);
        } else {
            result.add(nowlist);
        }
        return;
    }
}