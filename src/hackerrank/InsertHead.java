package hackerrank;


public class InsertHead {
    static SinglyLinkedListNode insertNodeAtHead(SinglyLinkedListNode llist, int data) {
        if(llist==null) return new SinglyLinkedListNode(data);
        SinglyLinkedListNode head = new SinglyLinkedListNode(data);
        head.next=llist;
        return head;


    }
}
