package hackerrank;

public class PostorderTraversal {
    public static void postOrder(Node root) {
        if(root==null) return;

        postOrder(root.left);
        postOrder(root.right);
        System.out.printf("%d ",root.data);

    }

}
