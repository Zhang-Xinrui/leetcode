class l45better {
    public int jump(int[] nums) {
        if(nums.length <= 2) return nums.length - 1;
        int[] steps = new int[nums.length];
        int i = 1; steps[1] = nums[0];
        while(steps[i] < nums.length - 1) {
            for(int j = steps[i - 1] + 1; j <= steps[i]; j++) {
                steps[i + 1] = Math.max(steps[i + 1], j + nums[j]);
            }
            i++;
        }
        return i;
    }
}