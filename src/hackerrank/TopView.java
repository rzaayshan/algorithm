package hackerrank;

import java.util.*;
import java.util.LinkedList;

class NodeX implements Comparable<NodeX>{
    Node node;
    int idx;

    public NodeX(Node node, int idx) {
        this.node = node;
        this.idx = idx;
    }

    @Override
    public String toString() {
        return String.format("NodeX{node=%s, idx=%d}", node, idx);
    }


    @Override
    public int compareTo(NodeX o) {
        return Integer.compare(this.idx,o.idx);
    }
}

public class TopView {
    public static void topView(Node root) {
        if(root==null) return;
        Queue<NodeX> q = new LinkedList<>();
        NodeX n = new NodeX(root, 0);
        Map<NodeX, Integer> m = new TreeMap<>();
        q.add(n);

        while (!q.isEmpty()){
            n=q.poll();
            if(!m.containsValue(n.idx))
                m.put(n, n.idx);
            if(n.node.left!=null){
                q.add(new NodeX(n.node.left, n.idx-1));
            }
            if(n.node.right!=null){
                q.add(new NodeX(n.node.right,n.idx+1));
            }
        }

        m.forEach((key, value) -> System.out.printf("%d ", key.node.data));


    }

    public static void main(String[] args) {
        Node root = new Node(1);
        root.right=new Node(2);
        root.right.right=new Node(5);
        root.right.right.left=new Node(3);
        root.right.right.right=new Node(6);
        root.right.right.left.left=new Node(4);
        topView(root);
    }



    }


