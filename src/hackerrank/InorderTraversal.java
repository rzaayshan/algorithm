package hackerrank;

public class InorderTraversal {
    public static void inOrder(Node root) {
        if(root==null) return;

        inOrder(root.left);
        System.out.printf("%d ",root.data);
        inOrder(root.right);

    }
}
