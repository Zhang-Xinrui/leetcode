import java.util.List;
import java.util.ArrayList;
class Solution {
    List<List<Integer>> result;
    public List<List<Integer>> subsets(int[] nums) {
        result = new ArrayList<>();
        List<Integer> nowlist = new ArrayList<>(); //貌似一般情况下ArrayList的性能要好一些。
        help(nums, nowlist, 0);
        return result;
    }
    private void help(int[] nums, List<Integer> nowlist, int index) {
        if(index < nums.length) {
            List<Integer> newlist = new ArrayList<>(nowlist);
            newlist.add(nums[index]);
            help(nums, newlist, index + 1);
            help(nums, nowlist, index + 1);
        } else {
            result.add(nowlist);
        }
        return;
    }
}