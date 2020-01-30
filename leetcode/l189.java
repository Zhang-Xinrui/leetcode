class l189 {    //本题有三种方法。使用三次数组翻转，或者开一个新数组都可以解决问题
    //还是三次翻转快一些，虽然平均每个元素swap次数更多。
    public void rotate (int[] nums, int k) {
        int N = nums.length, position, index;
        k = k % N;
        if(k == 0 || N < 2) {
            return;
        }
        N = gcd(N, k);
        //这里将两变量转作其它用途
       for(int i = 0; i < N; i++) {
           index = nums.length - i - 1;
            for(int j = 1; j <= nums.length / N; j++) {
                position = (index - k + nums.length) % nums.length;
                nums[index] ^= nums[position];
                nums[position] ^= nums[index];
                nums[index] ^= nums[position];
                index = position;
            }
       }
    }
    public int gcd(int big, int small) {
        if(small == 0) return big;
        else return gcd(small, big % small);
    }
}