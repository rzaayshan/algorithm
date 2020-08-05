package inter;

import java.util.ArrayList;
import java.util.Arrays;

public class InterRec {
    public static StringBuilder f(StringBuilder b, int n){
        if(n==10)
            return b.append(10);
        return f(b.append(n).append(", "),n+1);
    }
    public static void main(String[] args) {
        System.out.println(f(new StringBuilder(), 1));
        ArrayList<Object> s = new ArrayList<>();
        Object []a = new Object[5];
        int [] i = new int[5];
        s.add(23);
        s.add("fg");
        a[0]=25;
        a[1]="nh";
        System.out.println(s);
        System.out.println(Arrays.toString(a));

    }
    static class A{
        int a;


    }

}


