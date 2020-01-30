class l41another {
    public int firstMissingPositive(int[] nums) {
        int j = 0, absnum, index;
        for(int i = 0; i < nums.length; i++) {
            if(nums[i] > 0 && nums[i] <= nums.length) {
                if(i != j) {    // never use XOR swap
                    index = nums[i];
                    nums[i] = nums[j];
                    nums[j] = index;
                }
                j++;
            }
        }
        for(int i = 0; i < j; i++) {
            absnum = Math.abs(nums[i]); index = absnum - 1;
            if(absnum <= j && nums[index] > 0 ) {
                nums[index] = -nums[index];
            }
        }
        for(int i = 0; i < j; i++) {
            if(nums[i] > 0) {
                return i + 1;
            }
        }
        return j + 1;
    }
}