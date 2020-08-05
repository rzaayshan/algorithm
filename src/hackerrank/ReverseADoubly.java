package hackerrank;

public class ReverseADoubly {
    static DoublyLinkedListNode reverse(DoublyLinkedListNode head) {
        if(head==null || head.next==null) return head;

        DoublyLinkedListNode curr = head;
        DoublyLinkedListNode p=null;
        DoublyLinkedListNode n;
        while (curr!=null){
            n = curr.next;
            p = curr.prev;
            curr.next=p;
            curr.prev=n;
            curr=n;
        }

        return p;




    }
}
