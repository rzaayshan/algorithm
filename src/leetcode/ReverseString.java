package leetcode;

import java.util.Arrays;

public class ReverseString {
    public void reverseString(char[] s) {
        System.out.println("{");
        for (int i=s.length-1;i>-1;i--) {
            System.out.print(s[i]);
            if(i<0)
                System.out.println(" ,");
        }
        System.out.println("}");

    }
}
