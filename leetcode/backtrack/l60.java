class Solution {
    public String getPermutation(int n, int k) {
        String result = new String();
        int[] list = new int[n];//用以保存阶乘
        
        List<Integer> nums = new LinkedList<>();
        for(int i = 0; i < n; i++) nums.add(i + 1);
        
        list[0] = 1;
        for(int i = 1; i < n; i++)
            list[i] = i * list[i - 1];
        int now; k--;
        for(int i = n - 1; i >= 0; i--) {
            now = k / list[i];
            result += String.valueOf(nums.remove(now));//这里要注意方法重载的问题。
            k = k % list[i];
        }
        return result;
    }
}