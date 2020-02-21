class Solution {
    public TreeNode buildTree(int[] preorder, int[] inorder) {
        return help(preorder, inorder, 0, preorder.length, 0);
    }
    private TreeNode help(int[] pre, int[] in, int prelow, int prehigh, int inlow) {
        TreeNode newone = null;
        if(prelow >= prehigh) return newone;
        newone = new TreeNode(pre[prelow++]);
        int i = inlow;
        while(in[i] != newone.val) i++;
        
            newone.left = help(pre, in, prelow, prelow + i - inlow, inlow);
            newone.right = help(pre, in, prelow + i - inlow, prehigh, i + 1);
        return newone;
    }
}