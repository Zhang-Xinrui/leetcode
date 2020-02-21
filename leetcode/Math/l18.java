import java.util.List;
import java.util.ArrayList;
import java.util.Arrays;
class l18 {
    public List<List<Integer>> fourSum(int[] nums, int target) {
        List<List<Integer>> resultlist = new ArrayList<>();
        Arrays.sort(nums);
        for(int i = 0; i < nums.length - 3; i++) {
            if(i > 0 && nums[i] == nums[i - 1]) continue;
            target -= nums[i];
            for(int j = i + 1; j < nums.length - 2; j++) {
                if(j > i + 1 && nums[j] == nums[j - 1]) continue;
                target -= nums[j];
                int m = j + 1, n = nums.length - 1;
                while(m < n) {
                    if(nums[m] + nums[n] == target) {
                        resultlist.add(Arrays.asList(nums[i], nums[j], nums[m], nums[n]));
                        m++;
                        while(m < n && nums[m] == nums[m - 1]) m++;
                        n--;
                        while(m < n && nums[n] == nums[n + 1]) n--;
                    } else if(nums[m] + nums[n] < target) {
                        m++;
                        while(m < n && nums[m] == nums[m - 1]) m++;
                    } else {
                        n--;
                        while(m < n && nums[n] == nums[n + 1]) n--;
                    }
                }
                target += nums[j];
            }
            target +=  nums[i];
        }
        return resultlist;
    }
}