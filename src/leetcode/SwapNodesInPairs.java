package leetcode;

public class SwapNodesInPairs {
    public static ListNode swapPairs(ListNode head) {
        if(head==null || head.next==null)
            return head;
        ListNode a,b;

        a=head;
        b=head.next;
        a.next=b.next;
        b.next=a;
        head=b;

        ListNode node = head.next.next;
        ListNode k = head.next;

        while (node!=null && node.next!=null){
            System.out.println(node);
            a=node;
            b=node.next;
            a.next=b.next;
            b.next=a;
            node=a.next;
            k.next=b;
            k=a;
        }

        return head;

    }

    public static void main(String[] args) {
        ListNode l1 = new ListNode(2);
        l1.next=new ListNode(4);
        l1.next.next=new ListNode(3);
        l1.next.next.next=new ListNode(5);
        System.out.println(swapPairs(l1));
    }
}
