//z这个回答利用了完全二叉树的性质
class Solution {
    public int countNodes(TreeNode root) {
        int h = height(root);
        if(h == -1) return 0;
        else if(height(root.right) == h - 1) 
            return (int)Math.pow(2, h) + countNodes(root.right); //可以看到，这个递归解法重复了子树高度的计算，仍显冗余
        return (int)Math.pow(2, h - 1) + countNodes(root.left);
    }
    private int height(TreeNode root) {
        if(root == null) return -1;
        return 1 + height(root.left);
    }
}
class Solution {
    public int countNodes(TreeNode root) {
        if(root == null) return 0;
        int h = height(root), newh = height(root.right), count = 0;
        while(newh != -1) {
            if(newh == h - 1) {
                count += Math.pow(2, h);
                root = root.right;
                h = newh; newh = height(root.right);
            }
            else {
                count += Math.pow(2, h - 1);
                root = root.left;
                h = height(root); newh = height(root.right);
            }
        }
       return count + h + 1;
    }
    private int height(TreeNode root) {
        if(root == null) return -1;
        return 1 + height(root.left);
    }
}