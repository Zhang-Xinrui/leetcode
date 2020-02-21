//z这个回答利用了完全二叉树的性质，是最好的答案
class Solution {
    public int countNodes(TreeNode root) {
        int h = height(root);
        if(h == -1) return 0;
        else if(height(root.right) == h - 1) 
            return (int)Math.pow(2, h) + countNodes(root.right);
        return (int)Math.pow(2, h - 1) + countNodes(root.left);
    }
    private int height(TreeNode root) {
        if(root == null) return -1;
        return 1 + height(root.left);
    }
}