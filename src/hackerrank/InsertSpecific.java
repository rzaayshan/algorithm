package hackerrank;

public class InsertSpecific {
    static SinglyLinkedListNode insertNodeAtPosition(SinglyLinkedListNode head, int data, int position) {
        if(head==null) return new SinglyLinkedListNode(data);
        SinglyLinkedListNode node = head;
        for(int i=0;i<position-1;i++)
            node=node.next;
        SinglyLinkedListNode temp=node.next;
        node.next=new SinglyLinkedListNode(data);
        node.next.next=temp;
        return head;
    }
}
