class l55 {
    public boolean canJump(int[] nums) {
        int lastindex = nums.length - 1;
        for(int i = nums.length - 2; i >= 0; i--) {
            if(nums[i] + i >= lastindex) {
                lastindex = i;
            }
        }
        if(lastindex == 0) return true;
        return false;
    }
}