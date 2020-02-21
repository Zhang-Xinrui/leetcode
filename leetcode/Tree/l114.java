class Solution {
    public void flatten(TreeNode root) {
        List<TreeNode> stack = new LinkedList<>();
        TreeNode nextone, cur = root;
        while(cur != null) {
            if(cur.left == null && cur.right == null) {
                if(stack.size() == 0) break;
                nextone = stack.remove(stack.size() - 1);
                cur.right = nextone;
            }  else if(cur.left != null) {
                if(cur.right != null) stack.add(cur.right);
                cur.right = cur.left;
                cur.left = null;
            }
            cur = cur.right;
        }
        return;
    }
}