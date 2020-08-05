package hackerrank;

import java.util.Scanner;

public class MaximumElement {

    static class Node{
        int data;
        Node next;

        public Node(int data) {
            this.data = data;
        }
    }

    static class Stack{
        Node head;
        Node tail;
    }

    static void push(Stack s, int data){
        if(s.head==null){
            s.head=new Node(data);
            return;
        }
        if(s.tail==null){
            s.tail=new Node(data);
            s.head.next=s.tail;
        }
        s.tail.next=new Node(data);
        s.tail=s.tail.next;
    }

    static void delete(Stack s){
        if(s.head==null) return;
        s.head=s.head.next;
    }

    static int max(Stack s){
        Node h = s.head;
        if(h==null) return 0;
        int max=h.data;

        while (h.next!=null){
            max=Math.max(max,h.next.data);
        }
        return max;
    }
    public static void main(String[] args) {
        Stack s = new Stack();
        int command;
        Scanner scanner = new Scanner(System.in);
        int n = scanner.nextInt();
        int data;
        for (int i=0;i<n;i++){
            command = scanner.nextInt();
            switch (command){
                case 1:
                    data=scanner.nextInt();
                    push(s, data);
                    break;
                case 2:
                    delete(s);
                    break;
                case 3:
                    System.out.println(max(s));
                    break;
                default:
                    System.out.println("Wrong command");

            }
        }

    }
}
