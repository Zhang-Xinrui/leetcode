class l27better {   //其实依赖于测试数据，并不一定会更快。
    public int removeElement(int[] nums, int val) {
        int i = 0, j = nums.length - 1;
        while(i <= j) { 
            if(nums[i] == val) {
                nums[i] = nums[j--];
            } else {
                i++;
            }
        }
        return j + 1;
    }
}