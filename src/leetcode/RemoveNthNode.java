package leetcode;

public class RemoveNthNode {
    public static int remove(ListNode head, ListNode node, int n){
        if(node.next==null)
            return n;
        n=remove(head,node.next,n);
        n--;
        if(n==1 && node==head)
            return 1;

        if(n==0)
            node.next=node.next.next;

        return n;

    }


    public static ListNode removeNthFromEnd(ListNode head, int n) {
        if(head.next==null)
            return null;
        if(remove(head,head,n)==1)
            head=head.next;
        return head;

    }

    public static void main(String[] args) {
        ListNode l1 = new ListNode(1);
        l1.next=new ListNode(2);
//        l1.next.next=new ListNode(3);
//        l1.next.next.next=new ListNode((4));
//        l1.next.next.next.next=new ListNode((5));
        System.out.println(removeNthFromEnd(l1,2));
    }
}
