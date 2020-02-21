class Solution {
    public void nextPermutation(int[] nums) {
        int i, j;
        for(i = nums.length - 2; i >= 0; i--)
            if(nums[i] < nums[i + 1])
                break;
        if(i < 0) { 
            reverse(nums, 0, nums.length - 1);
        } else {
            for(j = i + 2; j < nums.length; j++) 
                if(nums[j] <= nums[i]) break;
            j--;
            int temp = nums[j]; nums[j] = nums[i]; nums[i] = temp;
            reverse(nums, i + 1, nums.length - 1);
        }
        return;
    }
    private void reverse(int[] nums, int low, int high) {
        int temp;
        while(low < high) {
            temp = nums[low];
            nums[low] = nums[high];
            nums[high] = temp;
            high--;low++;
        }
        return;
    }
}