package leetcode;

import java.util.ArrayList;
import java.util.LinkedList;

public class LinkedListCycleII {
    public static ListNode detectCycle(ListNode head) {
        if(head==null)
            return null;
        ArrayList<ListNode> l = new ArrayList<>();
        ListNode node = head;

        while(node.next!=null){
            if(l.contains(node.next))
                return node.next;

            l.add(node);
            node=node.next;

        }
        return null;

    }

    public static void main(String[] args) {
        ListNode l1 = new ListNode(3);
        l1.next=new ListNode(2);
        l1.next.next=new ListNode(0);
        l1.next.next.next=new ListNode(4);
        l1.next.next.next.next=l1.next;
        System.out.println(detectCycle(l1));
    }
}
