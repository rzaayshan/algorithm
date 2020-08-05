package hackerrank;

public class CompareLinkedList {
    static boolean compareLists(SinglyLinkedListNode head1, SinglyLinkedListNode head2) {
        while (head1!=null && head2!=null){
            if(head1.data!=head2.data)
                return false;

            head1=head1.next;
            head2=head2.next;
        }
        return head1 == null && head2 == null;
    }

    public static void main(String[] args) {
        SinglyLinkedListNode h1 = new SinglyLinkedListNode(1);
        h1.next=new SinglyLinkedListNode(2);
        SinglyLinkedListNode h2 = new SinglyLinkedListNode(1);
        //h2.next=new SinglyLinkedListNode(2);
        System.out.println(compareLists(h1, h2));
    }
}
