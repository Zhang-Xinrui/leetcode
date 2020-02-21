import java.util.Arrays;
class l16 {
    public int threeSumClosest(int[] nums, int target) {
        Arrays.sort(nums); int nearest, now;
        if(Integer.MAX_VALUE - target > target - Integer.MIN_VALUE) {
            nearest = Integer.MAX_VALUE;
        } else {
            nearest = Integer.MIN_VALUE;
        }
        for(int i = 0; i < nums.length - 2; i++) {
            if(i > 0 && nums[i] == nums[i - 1]) continue;
            int j = i + 1, k = nums.length - 1;
            while(k > j) {
                now = nums[i] + nums[j] + nums[k];
                if(Math.abs(now - target) < Math.abs(nearest - target)) {
                    nearest = now;
                } 
                if(now < target) {
                    j++;
                    while(k > j && nums[j] == nums[j - 1]) j++;
                } else {
                    k--;
                    while(k > j && nums[k] == nums[k + 1]) k--;
                }
            }
        }
        return nearest;
    }
}