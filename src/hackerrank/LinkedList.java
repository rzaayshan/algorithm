package hackerrank;





  class SinglyLinkedListNode {
      int data;
      SinglyLinkedListNode next;
      public SinglyLinkedListNode(){}
      public SinglyLinkedListNode(int data){
          this.data=data;
      }

      @Override
      public String toString() {
          return String.format("SinglyLinkedListNode{data=%d, next=%s}", data, next);
      }
  }






public class LinkedList {
    static void printLinkedList(SinglyLinkedListNode head) {
        while (head!=null){
            System.out.println(head.data);
            head=head.next;
        }

    }
}
