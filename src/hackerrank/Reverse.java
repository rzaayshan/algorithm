package hackerrank;

public class Reverse {
    static SinglyLinkedListNode reverse(SinglyLinkedListNode head) {

        SinglyLinkedListNode tail=null;
        while (head!=null){
            SinglyLinkedListNode t = head.next;
            head.next=tail;
            tail=head;
            head=t;
        }
        return tail;









    }
}
