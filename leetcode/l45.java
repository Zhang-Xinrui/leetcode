class l45 {
    public int jump(int[] nums) {
        if(nums.length <= 2) return nums.length - 1;
        int[] steps = new int[nums.length]; //steps[index]表示通过index次步最远可到达的位置
        int count = 0; steps[count] = nums.length - 1;
        for(int i = nums.length - 2; i >= 0; i--) {
            if(i + nums[i] < steps[count]) {
                if(i + 1 < steps[count] && i + 1 + nums[i + 1] >= steps[count])
                    steps[++count] = i + 1;
            } else if(count > 0 && i + nums[i] >= steps[count - 1]) {
                count--; i++;
            } 
        }
        return count + 1;
    }
}