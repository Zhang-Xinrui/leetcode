class l34{
    public int[] searchRange(int[] nums, int target) {
        int low = 0, high = nums.length - 1, mid;
            mid = low + (high - low) / 2;
        int[] result = new int[2]; result[0] = result[1] = -1;
        while(low < high) {
            
            if(nums[mid] < target) {low = mid + 1;mid = low + (high - low) / 2;}
        else if (nums[mid] > target) {high = mid - 1;mid = low + (high - low) / 2;}
            else if (nums[high] > target) mid++;
            else if (nums[low] < target) mid--;
            else {result[0] = low; result[1] = high; return result;}
        }
        if(low == high && nums[low] == target) {result[0] = result[1] = low;}
        return result;
    }
}