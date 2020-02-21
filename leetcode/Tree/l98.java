class Solution {
    int maxone, minone;
    public boolean isValidBST(TreeNode root) {
        if(root == null) return true;
        return help(root);
    }
    private boolean help(TreeNode root) {
        //除了判断是不是合格的BST外，还要返回子树中的最大最小元素
        int temp = maxone = minone = root.val;
        if(root.left == null && root.right == null) {
            return true;
        }
        if(root.left != null) {
            if(!help(root.left) || maxone >= root.val) {
                return false;
            }
            temp = minone;
        }
        if(root.right != null) {
            if(!help(root.right) || minone <= root.val)
                return false;
        }
        maxone = Math.max(maxone, root.val);
        minone = temp;
        return true;
    }
}