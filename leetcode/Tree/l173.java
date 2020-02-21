class BSTIterator {
    List<TreeNode> stack;
    TreeNode now;
    public BSTIterator(TreeNode root) {
        stack = new LinkedList<>();
        now = root;
        while(now != null) {
            stack.add(now);
            now = now.left;
        }
    }
    
    /** @return the next smallest number */
    public int next() {
        TreeNode result = stack.remove(stack.size() - 1);
        now = result.right;
        while(now != null) {
            stack.add(now);
            now = now.left;
        }
        return result.val;
    }
    
    /** @return whether we have a next smallest number */
    public boolean hasNext() {
        return !stack.isEmpty();
    }
}