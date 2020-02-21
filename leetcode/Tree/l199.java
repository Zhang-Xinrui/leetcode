class Solution {
    public List<Integer> rightSideView(TreeNode root) {
        List<Integer> list = new ArrayList<>();
        if(root == null) return list;
        List<TreeNode> stack = new LinkedList<>();
        stack.add(root);
        int count = 1, newcount; TreeNode now = null;
        while(!stack.isEmpty()) {
            newcount = 0;
            for(int i = 0; i < count; i++) {
                now = stack.remove(0);
                if(now.left != null) {stack.add(now.left); newcount++;}
                if(now.right != null) {stack.add(now.right); newcount++;}
            }
            list.add(now.val); count = newcount;
        }
        return list;
    }
}