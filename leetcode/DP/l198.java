class Solution {
    public int rob(int[] nums) {
        if(nums.length == 0) return 0;
        if(nums.length == 1) return nums[0];
        if(nums.length == 2) return Math.max(nums[0], nums[1]);
        int num1 = nums[0], num2 = nums[1], num3 = nums[0] + nums[2], num4;
        int index = 3, temp;
        while(index < nums.length) {
            num4 = nums[index] + Math.max(num1, num2);
            num1 = num2; num2 = num3; num3 = num4;
            index++;
        }
        return Math.max(num2, num3);
    }
}