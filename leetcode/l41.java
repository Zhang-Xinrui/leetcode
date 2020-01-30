class l41 {//核心思想是对正数进行哈希，最终按序找到最小缺失正数
    public int firstMissingPositive(int[] nums) {
        int k;
        for(int i = 0; i < nums.length; ) {
            if(nums[i] > 0 && nums[i] <= nums.length && nums[nums[i] - 1] != nums[i]) {
                k = nums[i] - 1;
                nums[i] = nums[k];
                nums[k] = k + 1;
            }
            else i++;
        }
        for(int i = 0; i < nums.length; i++) {
            if(nums[i] != i + 1) {
                return i + 1;
            }
        }
        return nums.length + 1;
    }
}