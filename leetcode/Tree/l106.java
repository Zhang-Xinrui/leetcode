class Solution {
    public TreeNode buildTree(int[] inorder, int[] postorder) {
        return help(inorder, postorder, inorder.length - 1, 0, postorder.length - 1);
    }
    private TreeNode help(int[] in, int[] post, int inhigh, int postlow, int posthigh) {
        TreeNode newone = null;
        if(posthigh < postlow) return newone;
        newone = new TreeNode(post[posthigh--]);
        int i = inhigh;
        while(in[i] != newone.val) i--;
        newone.left = help(in, post, i - 1,postlow,posthigh - inhigh + i);
        newone.right = help(in,post,inhigh,posthigh - inhigh + i + 1,posthigh);
        return newone;
    }
}