package hackerrank;

public class MergeSortedLink {
    static SinglyLinkedListNode mergeLists(SinglyLinkedListNode head1, SinglyLinkedListNode head2) {
        SinglyLinkedListNode merged;
        if(head1.data>head2.data){
            merged=head2;
            head2=head2.next;
        }
        else {
            merged=head1;
            head1=head1.next;
        }
        SinglyLinkedListNode result=merged;
        while (head1!=null && head2!=null){
            if(head1.data>head2.data){
                merged.next=head2;
                System.out.println("in if"+head2.data);
                head2=head2.next;

            }
            else {
                merged.next=head1;
                System.out.println("in else"+head1.data);
                head1=head1.next;
            }
            merged=merged.next;
        }
        while (head1!=null){
            merged.next=head1.next;
            head1=head1.next;
            merged=merged.next;
        }
        while (head2!=null){

            merged.next=head2;
            head2=head2.next;
            merged=merged.next;
        }

        return result;



    }

    public static void main(String[] args) {
        SinglyLinkedListNode h1 = new SinglyLinkedListNode(1);
        h1.next=new SinglyLinkedListNode(2);
        h1.next.next=new SinglyLinkedListNode(3);
        SinglyLinkedListNode h2 = new SinglyLinkedListNode(3);
        h2.next=new SinglyLinkedListNode(4);
        System.out.println(mergeLists(h1, h2));
    }

}
