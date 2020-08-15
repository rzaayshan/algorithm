package leetcode;

public class AddTwoNumbers {
    public static class ListNode {
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
            return String.format("ListNode{val=%d, next=%s}", val, next);
        }
    }

    public static long listToInt(ListNode l){
        if(l.next==null) return l.val;
        long r=listToInt(l.next);
        return r*10+l.val;
    }

    public static ListNode intToList(long n){
        if(n/10==0) return new ListNode((int) n);
        ListNode next = intToList(n/10);
        return new ListNode((int) (n%10), next);
    }



    public static ListNode addTwoNumbers(ListNode l1, ListNode l2) {
        long intL1=listToInt(l1);
        long intL2=listToInt(l2);
        System.out.println(intL1);
        System.out.println(intL2);
        return intToList(intL1+intL2);



    }

    public static ListNode add(ListNode l1, ListNode l2){
        if(l1.next==null && l2.next==null) return new ListNode(l1.val+l2.val);
        if(l1.next == null){
            ListNode next = add(l1, l2.next);
            return new ListNode(l2.val,next);
        }
        if(l2.next == null){
            ListNode next = add(l1.next,l2);
            return new ListNode(l1.val, next);
        }
        ListNode next = add(l1.next, l2.next);
        int val=l1.val+l2.val;
        if(next.val>=10){
            next.val=next.val-10;
            val+=1;
        }
        return new ListNode(val, next);


    }

    public static void main(String[] args) {
//        ListNode l1 = new ListNode(2);
//        l1.next=new ListNode(4);
//        l1.next.next=new ListNode(3);
        ListNode l1=new ListNode(9);
        ListNode l2 = new ListNode(1);
        l2.next=new ListNode(9);
        l2.next.next=new ListNode(9);
        System.out.println(addTwoNumbers(l1,l2));

    }
}
