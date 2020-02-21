class Solution {
    public int kthSmallest(TreeNode root, int k) {
        int count = 0;
        List<TreeNode> stack = new LinkedList<>();
        while(root != null || !stack.isEmpty()) {
            if(root != null) {
                stack.add(root);
                root = root.left;
            } else {
                root = stack.remove(stack.size() - 1);
                count++;
                if(count == k) return root.val;
                root = root.right;
            }
        }
        return 0;
    }
}