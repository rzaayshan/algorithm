package leetcode;

public class RemoveDuplicates2 {
    public ListNode deleteDuplicates(ListNode head) {
        ListNode k = head;
        ListNode n = head.next.next;
        boolean flag;

        while (k!=null && k.val==k.next.val){
            k=k.next;
        }

        head=k;


        while (n!=null){
            flag=false;
            while (k.next.val==n.val){
                n=n.next;
                flag=true;
            }
        }


        return head;





    }
}
