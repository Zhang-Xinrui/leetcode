/**
 * Definition for a binary tree node.
 * public class TreeNode {
 *     int val;
 *     TreeNode left;
 *     TreeNode right;
 *     TreeNode(int x) { val = x; }
 * }
 */
class Solution {
    public List<List<Integer>> zigzagLevelOrder(TreeNode root) {
        int count = 0, newcount; boolean lefttoright = true;
        List<List<Integer>> result = new ArrayList<>();
        List<TreeNode> stack = new LinkedList<>();
        if(root == null) return result;
        stack.add(root); count++; lefttoright = false;
        while(!stack.isEmpty()) {
            List<Integer> levelnum = new ArrayList<>();
            newcount = 0;
            if(lefttoright) {
                for(int i = count - 1; i >= 0; i--) {
                    TreeNode now = stack.remove(i);
                    levelnum.add(now.val);
                    if(now.right != null) {
                        newcount++;
                        stack.add(i, now.right);
                    }
                    if(now.left != null) {
                        newcount++;
                        stack.add(i, now.left);
                    }
                }
            } else {
                for(int i = 0; i < count; i++) {
                    TreeNode now = stack.remove(0);
                    levelnum.add(now.val);
                    if(now.left != null) {stack.add(now.left); newcount++;}
                    if(now.right != null) {stack.add(now.right); newcount++;}
                }
            }
            count = newcount; lefttoright = !lefttoright;
            result.add(levelnum);
        }
        return result;
    }
}