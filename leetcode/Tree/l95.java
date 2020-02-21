class Solution {
    public List<TreeNode> generateTrees(int n) {
        if(n == 0){
            List<TreeNode> list = new ArrayList<>();
            return list;
        }
        return help(1, n);
    }
    private List<TreeNode> help(int low, int high) {
        List<TreeNode> list = new ArrayList<>();
        if(low > high) {
            list.add(null);
        } else if(low == high) {
            list.add(new TreeNode(low));
        } else {
            for(int i = low; i <= high; i++) {
                List<TreeNode> leftlist = help(low, i - 1);
                List<TreeNode> rightlist = help(i + 1, high);
                for(TreeNode left: leftlist) {
                    for(TreeNode right: rightlist) {
                        TreeNode root = new TreeNode(i);
                        root.left = left;
                        root.right = right;
                        list.add(root);
                    }
                }
            }
        }
        return list;
    }
}
