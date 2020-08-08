package hackerrank;


public class TreeHuffmanDecoding2 {
    void decode(String s, NodeY root) {
        NodeY curr = root;
        StringBuilder builder = new StringBuilder();
        StringBuilder result = new StringBuilder();
        for(int i=0;i<s.length();i++){

            if(s.charAt(i)=='0' && curr.left!=null)
                curr=curr.left;
            else if(s.charAt(i)=='1' && curr.right!=null)
                curr=curr.right;

            builder.append(s.charAt(i));
            if(curr.left==null && curr.right==null){
                result.append(curr.data);
                curr=root;
                builder.delete(0, builder.length());
            }


        }
        System.out.println(result.toString());


        StringBuilder sb = new StringBuilder();
        NodeY c = root;
        for (int i = 0; i < s.length(); i++) {
            c = s.charAt(i) == '1' ? c.right : c.left;
            if (c.left == null && c.right == null) {
                sb.append(c.data);
                c = root;
            }
        }
        System.out.print(sb);
    }

    public static void main(String[] args) {

    }
}
