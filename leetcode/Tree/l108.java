class Solution {
    public TreeNode sortedArrayToBST(int[] nums) {
        return help(nums, 0, nums.length);
    }
    private TreeNode help(int[] nums, int low, int high) {
        TreeNode root = null;
        if(low == high) return root;
        int mid = low + (high - low) / 2;
        root = new TreeNode(nums[mid]);
        root.left = help(nums, low, mid);
        root.right = help(nums, mid + 1, high);
        return root;
    }
}