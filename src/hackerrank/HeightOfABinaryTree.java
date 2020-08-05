package hackerrank;

public class HeightOfABinaryTree {
    public static int height(Node root) {
        if(root==null) return -1;
        int left_height=height(root.left)+1;
        int right_height=height(root.right)+1;
        return Math.max(left_height, right_height);
    }
}
