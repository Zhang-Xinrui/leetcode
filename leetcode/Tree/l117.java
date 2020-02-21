class Solution {
    public Node connect(Node root) {
        if(root == null || root.left == null && root.right == null) 
            return root;
        if(root.right == null) {connect(root.left); return root;}
        if(root.left == null) {connect(root.right); return root;}
        connect(root.left); connect(root.right);
        Node left = root.left, right = root.right;
        Node leftone = left;
        while(true) {
            leftone.next = right;
            while(left.left == null && left.right == null) {
                if(left == leftone) return root;
                left = left.next;
            }
            while(right.left == null && right.right == null) {
                right = right.next;
                if(right == null) return root;
            }
            if(left.left != null) left = left.left;
            else left = left.right;
            if(right.left != null) right = right.left;
            else right = right.right;
            leftone = left;
            while(leftone.next != null) leftone = leftone.next;
        }
    }
}