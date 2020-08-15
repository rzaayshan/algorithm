package leetcode;


class ListNode {
    int val;
    ListNode next;

    ListNode() {
    }

    ListNode(int val) {
        this.val = val;
    }

    ListNode(int val, ListNode next) {
        this.val = val;
        this.next = next;
    }

    @Override
    public String toString() {
        return String.format("ListNode{val=%d}", val);
    }
}

public class AddTwoNumbers2 {

    public static ListNode add(ListNode l1, ListNode l2, int rem, String added){
        if(l1.next==null && l2.next==null){
            int val = added.equals("1")?l2.val+rem:added.equals("2")?l1.val+rem:l1.val+l2.val+rem;
            return val>=10 ?
                    new ListNode(val-10,new ListNode(1)):
                    new ListNode(val);
        }
        if(l1.next==null){
            int val = added.equals("0") ?l1.val+l2.val+rem:l2.val+rem;
            ListNode node;
            if(val<10){
                node=new ListNode(val, l2.next);
                return node;
            }
            node = new ListNode(val-10, add(l1,l2.next,1,"1"));
            return node;
        }
        if(l2.next==null){
            int val = added.equals("0") ?l1.val+l2.val+rem:l1.val+rem;
            ListNode node;
            if(val<10){
                node=new ListNode(val, l1.next);
                return node;
            }
            node = new ListNode(val-10, add(l1.next,l2,1,"2"));
            return node;
        }
        int val = l1.val+l2.val+rem;
        int r = val<10?0:1;
        val=val<10?val:val-10;
        return new ListNode(val, add(l1.next, l2.next,r,"0"));
    }
    public static ListNode addTwoNumbers(ListNode l1, ListNode l2) {
        return add(l1,l2,0,"0");
    }

    public static void main(String[] args) {
        ListNode l1 = new ListNode(2);
        l1.next=new ListNode(4);
        l1.next.next=new ListNode(3);
//        ListNode l1=new ListNode(9);
        ListNode l2 = new ListNode(5);
        l2.next=new ListNode(6);
        l2.next.next=new ListNode(4);
        System.out.println(addTwoNumbers(l1,l2));
    }

}
