class Solution {
    public int countNodes(TreeNode root) {
        if(root == null) return 0; //注意，没有用到完全二叉树性质
        if(root.left == null && root.right == null) return 1;
        return 1 + countNodes(root.left) + countNodes(root.right);
    }
}