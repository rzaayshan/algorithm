package hackerrank;

public class PreorderTraversal {
    public static void preOrder(Node root) {
        if(root==null) return;

        System.out.printf("%d ", root.data);
        preOrder(root.left);
        preOrder(root.right);





    }
}
