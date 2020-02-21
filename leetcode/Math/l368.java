import java.util.ArrayList;
import java.util.List;
import java.util.Arrays;
class l368 {
    public List<Integer> largestDivisibleSubset(int[] nums) {
        List<Integer> result = new ArrayList<>();
        if(nums.length == 0) return result;
        int[] dp = new int[nums.length]; 
        Arrays.sort(nums);
        for(int i = 1; i < nums.length; i++) {
            for(int j = i - 1; j >= 0; j--) {
                if(nums[i] % nums[j] == 0)
                    dp[i] = Math.max(dp[i], dp[j] + 1);
            }
        }
        int maxindex = 0;
        for(int i = 1; i < nums.length; i++)
            if(dp[i] > dp[maxindex])
                maxindex = i;
       while(dp[maxindex] > 0) {
            for(int j = maxindex - 1; j >= 0; j--) {
                if(nums[maxindex] % nums[j] == 0 && dp[j] == dp[maxindex] - 1) {
                    result.add(nums[maxindex]);
                    maxindex = j;
                    break;
                }
            }
        }
        result.add(nums[maxindex]);
        return result;
    }
}