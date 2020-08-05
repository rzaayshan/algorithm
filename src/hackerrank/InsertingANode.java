package hackerrank;

class DoublyLinkedListNode {
        int data;
        DoublyLinkedListNode next;
        DoublyLinkedListNode prev;

    public DoublyLinkedListNode(int data) {
        this.data = data;
    }

    public DoublyLinkedListNode(){}


}

public class InsertingANode {
    static DoublyLinkedListNode sortedInsert(DoublyLinkedListNode head, int data) {
        if(head==null) return new DoublyLinkedListNode(data);

        DoublyLinkedListNode d = new DoublyLinkedListNode(data);

        if(head.data>data){
            head.prev=d;
            d.next=head;
            return d;
        }

        DoublyLinkedListNode curr = head;
        while(curr.next!=null){
            if(curr.next.data>data){
                curr.next.prev=d;
                d.next=curr.next;
                curr.next=d;
                d.prev=curr;
                break;
            }
            curr=curr.next;
        }



        if(curr.next==null){
            curr.next=d;
            d.prev=curr.next;
            d.next=null;
        }

        return head;


    }

}
