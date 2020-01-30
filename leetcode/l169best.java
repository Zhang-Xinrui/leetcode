class l169best {
    public int majorityElement(final int[] nums) {
        //This is really a tricky solution to the problem.
        //Notice: if in the first 2n numbers, there is not a majority element,
        // then the answer must be the majority element of the last array.
        int count = 1, majority = nums[0];
        for(int i = 1; i < nums.length; i++) {
            if(count == 0) {    //no need to care about numbers before ith
                majority = nums[i];
                count++;
            } else if(nums[i] != majority) {
                count--;
            } else {
                count++;
            }
        }
        return majority;
    }
}