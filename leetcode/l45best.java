class l45best {
    public int jump(int[] nums) {
        int step_count = 0, last_jump_max = 0, current_jump_max = 0;
        for(int i = 0; i < nums.length - 1; i++) {
            current_jump_max = Math.max(current_jump_max, i + nums[i]);
            if(i == last_jump_max) {
                step_count++;
                last_jump_max = current_jump_max;
            }
        }
        return step_count;
    }
}