package hackerrank;



public class InsertTail {
    static SinglyLinkedListNode insertNodeAtTail(SinglyLinkedListNode head, int data) {
        if(head==null) return new SinglyLinkedListNode(data);
        SinglyLinkedListNode node = head;
        while (node.next!=null)
            node=node.next;
        node.next=new SinglyLinkedListNode(data);
        return head;
    }

}
