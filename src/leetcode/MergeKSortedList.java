package leetcode;

public class MergeKSortedList {
    public static ListNode mergeKLists(ListNode[] l) {
        if(l.length==0)
            return null;
        if(l.length==1)
            return l[0];
        int r=0;
        for (ListNode listNode : l) {
            if (listNode == null)
                r++;
        }
        if(r==l.length-1)
            return null;
        ListNode k, head;
        int min=0;
        int n = l.length;
        boolean flag=true;
        for(int i=0;i<n-1;i++){
            if(l[min]!=null)
                break;
            min++;
        }

        for(int i=0;i<n;i++){
            if(l[i]!=null && l[i].val<l[min].val){
                min=i;
            }
        }

        if(l[min]==null)
            return null;
        k=l[min];
        l[min]=l[min].next;
        head=k;


        while (flag){

            flag=false;
            min=0;
            for(int i=0;i<n;i++){
                if(l[min]!=null)
                    break;
                min++;

            }
            if(min>=l.length)
                break;
            for(int i=0;i<l.length;i++){
                if(l[min]!=null){
                    if(l[i]!=null && l[i].val<l[min].val){
                        min=i;
                    }
                    flag=true;

                }
            }
            k.next=l[min];
            k=k.next;
            l[min]=l[min].next;
        }

        return head;

    }

    public static void main(String[] args) {
        ListNode l1 = new ListNode(2);
        l1.next=new ListNode(3);
        l1.next.next=new ListNode(8);
//        ListNode l1=new ListNode(9);
        ListNode l2 = new ListNode(1);
        l2.next=new ListNode(6);
        l2.next.next=new ListNode(7);
        ListNode l3 = new ListNode(1);
        System.out.println(mergeKLists(new ListNode[]{l3}));
    }
}
