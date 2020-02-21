class l101 {
    public boolean isSymmetric(TreeNode root) {
        return root == null || help(root.left, root.right);
    }
    private boolean help(TreeNode left, TreeNode right) {
        if(left == null && right == null) return true;
        else if(left == null || right == null) return false;
        else return left.val == right.val && help(left.left, right.right) && help(left.right, right.left);
    }
}