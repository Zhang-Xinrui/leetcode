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
    public List<List<Integer>> levelOrderBottom(TreeNode root) {
        int count = 0, newcount;
        List<List<Integer>> result = new LinkedList<>();
        List<TreeNode> queue = new LinkedList<>();
        if(root == null) return result;
        queue.add(root); count++;
        while(!queue.isEmpty()) {
            newcount = 0;
            List<Integer> now = new ArrayList<>();
            for(int i = 0; i < count; i++) {
                TreeNode last = queue.remove(0);
                now.add(last.val);
                if(last.left != null) {queue.add(last.left); newcount++;}
                if(last.right != null) {queue.add(last.right); newcount++;}
            }
            count = newcount; 
            result.add(0, now);
        }
        return result;
    }
}

