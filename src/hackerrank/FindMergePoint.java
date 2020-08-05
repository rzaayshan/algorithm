package hackerrank;

public class FindMergePoint {
    static int findMergeNode(SinglyLinkedListNode head1, SinglyLinkedListNode head2) {
        SinglyLinkedListNode h1=head1;
        SinglyLinkedListNode h2;
        while (h1!=null){
            h2=head2.next;
            while (h2!=null){
                if(h2==h1){
                    return h1.data;
                }
                h2=h2.next;
            }
            h1=h1.next;
        }
        return 0;


    }
}
