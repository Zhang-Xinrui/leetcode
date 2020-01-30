class l26 {//本题可与l80对照一起看
    public int removeDuplicates(int[] nums) {
        if(nums.length <= 1) return nums.length;
        int j = 0;
        for(int i = 1; i < nums.length; i++) {
            if(nums[i] != nums[j]) {
                nums[++j] = nums[i];
            }
        }
        return j + 1;
    }
}