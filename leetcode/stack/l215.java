class l215 {
    class Solution {
        public int findKthLargest(int[] nums, int k) {
           return help(nums, 0, nums.length, k);
       }
       private int help(int[] nums, int low, int high, int k) {
           int num = nums[low]; int j = low + 1, temp;
           for(int i = low + 1; i < high; i++) {
               if(nums[i] >= num) {
                   temp = nums[i];
                   nums[i] = nums[j];
                   nums[j++] = temp;
               }
           }
           if(j - low == k) return num;
           else if(j - low < k) return help(nums, j, high, k - j + low);
           else return help(nums, ++low, j, k);
       }
   }
}