package hackerrank;

import java.util.List;
import java.util.Scanner;
import java.util.Stack;

public class QueueUsingTwoStacks {

    public static void main(String[] args) {
        Stack<Integer> s1 = new Stack<>();
        Stack<Integer> s2 = new Stack<>();

        Scanner s = new Scanner(System.in);

        int c,x;
        c=s.nextInt();
        x=s.nextInt();


        while (true){
            if(c==1){
                s1.push(x);
                while (!s1.isEmpty())
                    s2.push(s1.pop());
            }


        }


    }
}
