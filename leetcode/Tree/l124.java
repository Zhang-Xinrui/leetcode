class Solution { //这是一个时空效率很差的解法
    public int maxPathSum(TreeNode root) {
        
        if(root == null) return 0;
        int newsum = root.val + help(root.left) + help(root.right);
        if(root.left != null) newsum = Math.max(newsum, maxPathSum(root.left));
        if(root.right != null) newsum = Math.max(newsum, maxPathSum(root.right));
        return newsum;
    }
    private int help(TreeNode root) {
        //辅助函数用于求单边内的最大长度
        if(root == null) return 0;
        return Math.max(0, Math.max(help(root.left), help(root.right)) + root.val);
    }
}