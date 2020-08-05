package hackerrank;

public class GetNodeValue {
    static int getNode(SinglyLinkedListNode head, int positionFromTail) {
        SinglyLinkedListNode h1 = head;
        SinglyLinkedListNode h2 = head;
        int l=0;
        while(h1!=null){
            l++;
            h1=h1.next;
        }
        for(int i=0;i<l-positionFromTail;i++)
            h2=h2.next;

        return h2.data;



    }
}
