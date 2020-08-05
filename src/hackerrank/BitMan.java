package hackerrank;

import java.time.LocalDateTime;

public class BitMan {
    public static class ListNode {
      int val;
      ListNode next;
      ListNode(int x) { val = x; }
  }

    public static void main(String[] args) {
        ListNode head= new ListNode(1);
        ListNode next1 = new ListNode(0);
        head.next=next1;
        ListNode next2 = new ListNode(1);
        next1.next=next2;
        System.out.println(funk1(head));
        System.out.println(1<<2);
    }

    static int funk1(ListNode head){
        ListNode curr = head;
        int num=0;
        while(curr.next!=null){
            if(curr.val==1)
                num++;
            curr=curr.next;
            num<<=1;
        }
        if(curr.val==1)
            num++;
        return num;
    }



    static int funk(int n) {
        int i=0;
        while(n>0){
            i++;
            if((n&1)==0){
                n>>=1;
            }
            else{
                int m=1;
                while((n&m)==0){
                    n^=m;
                    m<<=1;
                }
                n^=m;
            }

        }
        return i;
    }
}
