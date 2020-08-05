package hackerrank;

public class CycleDetection {
    static boolean hasCycle(SinglyLinkedListNode head) {
//        if(head==null || head.next==null) return false;
//        SinglyLinkedListNode prev = head;
//        SinglyLinkedListNode curr=head.next;
//        while (curr!=null){
//            if(prev==curr.next)
//                return true;
//            prev=prev.next;
//            curr=curr.next;
//        }
//        return false;

        SinglyLinkedListNode fast = head;
        SinglyLinkedListNode slow = head;
        while (fast!=null && slow!=null && fast.next!=null){
            slow=slow.next;
            fast=fast.next.next;
            if(slow.data==fast.data)
                return true;
        }
        return false;


    }

}
