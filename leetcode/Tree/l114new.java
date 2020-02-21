class Solution {
    public void flatten(TreeNode root) {
        TreeNode cur = root, last;
        while(cur != null) {
            if(cur.left != null) {
                if(cur.right != null) {
                    last = cur.left;
                    while(last.right != null) last = last.right;
                    last.right = cur.right; 
                }
                cur.right = cur.left;
                cur.left = null;
            }
            cur = cur.right;
        }
        return;
    }
}