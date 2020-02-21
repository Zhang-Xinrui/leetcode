class Solution {
    List<List<Integer>> result;
    public List<List<Integer>> permute(int[] nums) {
        result = new ArrayList<>();
        List<Integer> nowlist = new ArrayList<>();
        help(nums, 0, nowlist);
        return result;
    }
    private void help(int[] nums, int index, List<Integer> nowlist) {
        if(index >= nums.length) 
            result.add(nowlist);
        else {
            int temp;
            for(int i = index + 1; i < nums.length; i++) {
                List<Integer> newlist = new ArrayList<>(nowlist);
                newlist.add(nums[i]); 
                temp = nums[i];
                nums[i] = nums[index]; 
                help(nums, index + 1, newlist);
                nums[i] = temp;
            }
            nowlist.add(nums[index]);
            help(nums, index + 1, nowlist);
        }
        return;
    } 
}