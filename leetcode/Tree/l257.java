import java.util.List;
import java.util.ArrayList;
class l257 {
    List<String> resultlist;
    String result;
    public List<String> binaryTreePaths(TreeNode root) {
        resultlist = new ArrayList<>();
        result = new String();
        help(root);
        return resultlist;
    }
    private void help(TreeNode root){
        int addlength = result.length();
        if(root == null)
            {if(result.length() > 0) {
                resultlist.add(result.substring(0, result.length() - 2));
            }
            return;}
        result += String.valueOf(root.val) + "->";
        addlength = result.length() - addlength;
        if(root.left != null) help(root.left);
        if(root.right != null) help(root.right);
        if(root.left == null && root.right == null) help(null);
        result = result.substring(0, result.length() - addlength);
    }
}