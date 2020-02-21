class Solution {
    public Node connect(Node root) {
        if(root == null) return root;
        if(root.left == null) {root.next = null; return root;}
        connect(root.left); connect(root.right);
        Node left = root.left, right = root.right;
        while(left != null) {
            left.next = right;
            left = left.right;
            right = right.left;
        }
        return root;
    }
}