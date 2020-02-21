class Solution {
    public boolean search(int[] nums, int target) {
        if(nums.length == 0) return false;
        int low = 0, high = nums.length - 1, mid;
        while(low < high) {
            mid = low + (high - low) / 2;
            if(nums[mid] == target) return true;
            if(nums[mid] > nums[low]) {
                if(target > nums[mid] || target < nums[low]) low = mid + 1;
                else high = mid;
            } else if(nums[mid] < nums[low]) {
                if(target < nums[mid] || target > nums[high]) high = mid;
                else low = mid + 1;
            } else {
                low++;
            }
        }
        if(nums[low] == target) return true;
        return false;
    }
}