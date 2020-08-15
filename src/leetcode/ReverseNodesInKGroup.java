package leetcode;

public class ReverseNodesInKGroup {
    public ListNode reverseKGroup(ListNode head, int n) {
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
}
