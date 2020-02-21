class Solution {
    public int search(int[] nums, int target) {
        if(nums.length == 0) return -1;
        int index = find_mid(nums);
        int low, high, mid;
        if(target > nums[nums.length - 1]) {
            low = 0; high = index;
        } else {
            low = index; high = nums.length;
        }
        while(low < high) {
            mid = low + (high - low) / 2;
            if(nums[mid] >= target) high = mid;
            else low = mid + 1;
        }
        if(nums[low] == target) return low;
        return -1;
    }
    private int find_mid(int[] nums) {
        int low = 0, high = nums.length - 1, mid;
        while(low < high) {
            mid = low + (high - low) / 2;
            if(nums[mid] < nums[high]) {
                high = mid;
            } else {
                low = mid + 1;
            }
        }
        return low;
    }
}