import java.util.List;
import java.util.ArrayList;
import java.util.Arrays;
class l15 {
    public List<List<Integer>> threeSum(int[] nums) {
        List<List<Integer>> resultlist = new ArrayList<>();
        Arrays.sort(nums); int target;
        for(int i = 0; i < nums.length - 2; i++) {
            if(i > 0 && nums[i] == nums[i - 1]) continue;
            target = -nums[i];
            int j = i + 1, k = nums.length - 1;
            while(j < k) {
                if(nums[j] + nums[k] == target) {
                    resultlist.add(Arrays.asList(nums[i], nums[j], nums[k]));
                    j++;k--;
                    while(j < k && nums[j] == nums[j - 1]) j++;
                    while(j < k && nums[k] == nums[k + 1]) k--;
                } else if(nums[j] + nums[k] < target) {
                    j++;
                } else {
                    k--;
                }
            }
        }
        return resultlist;
    }
}