import java.util.List;

import javax.swing.tree.TreeNode;

import java.util.ArrayList;
class l144 {
    public List<Integer> preorderTraversal(TreeNode root) {
        List<Integer> preorder = new ArrayList<>();
        List<TreeNode> stack = new ArrayList<>();
            while(root != null) {
                preorder.add(root.val);
                stack.add(root);
                root = root.left;
            }
            
            while(stack.size() != 0) {
                root = stack.remove(stack.size() - 1).right;
                while(root != null) {
                    preorder.add(root.val);
                    stack.add(root);
                    root = root.left;
                }
            }
        return preorder;
    }
}