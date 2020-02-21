import java.util.List;
import java.util.LinkedList;
class l111 {
    public int minDepth(TreeNode root) {
        List<TreeNode> list = new LinkedList<>();
        int count = 0, depth = 0, newcount;
        if(root == null) return depth;
        list.add(root); count++; depth++;
        while(true) {
            newcount = 0;
            for(int i = 0; i < count; i++) {
                TreeNode now = list.remove(0);
                if(now.left == null && now.right == null) return depth;
                if(now.left != null) {list.add(now.left); newcount++;}
                if(now.right != null) {list.add(now.right); newcount++;}
            }
            count = newcount; depth++;
        }
    }
}