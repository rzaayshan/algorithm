package hackerrank;

public class DeleteNode {
    static SinglyLinkedListNode deleteNode(SinglyLinkedListNode head, int position) {
        if(position==0) return head.next;
        SinglyLinkedListNode node = head;
        for(int i=0;i<position-1;i++)
            node=node.next;

        node.next=node.next.next;
        return head;



    }
}
