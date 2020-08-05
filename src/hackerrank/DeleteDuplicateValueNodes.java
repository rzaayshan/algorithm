package hackerrank;

public class DeleteDuplicateValueNodes {
    static SinglyLinkedListNode removeDuplicates(SinglyLinkedListNode head) {
        SinglyLinkedListNode curr = head;
        CHECK: while (curr.next!=null){
            while (curr.data==curr.next.data){
                curr.next=curr.next.next;
                if(curr.next==null)
                    break CHECK;
            }
            curr=curr.next;
        }
        return head;

    }
}
