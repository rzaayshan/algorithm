package hackerrank;

class Node {
    int data;
    Node left;
    Node right;

    public Node() {
    }

    public Node(int data) {
        this.data=data;
    }

    @Override
    public String toString() {
        return String.format("Node{data=%d, left=%s, right=%s}", data, left, right);
    }
}

public class BinarySearchTree {
    public static Node insert(Node root,int data) {
//        Node d = new Node(data);
//        if(root==null) return d;
//        Node n = root;
//
//        while (true){
//            if(n.data>data){
//                if(n.left==null){
//                    n.left=d;
//                    break;
//                }
//                n=n.left;
//            }
//            else{
//                if(n.right==null){
//                    n.right=d;
//                    break;
//                }
//                n=n.right;
//            }
//        }
//        return root;
        if(root==null) return new Node(data);

        if(root.data<data)
            root.right=insert(root.right,data);
        else{
            root.left=insert(root.left,data);
        }




        return root;


    }

}
