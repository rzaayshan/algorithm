package hackerrank;

import java.util.Arrays;
import java.util.LinkedList;


public class ClosestNumbers {
    static class  Triple<A,B,C>{
        A a;
        B b;
        C c;

        public Triple(A a, B b, C c) {
            this.a = a;
            this.b = b;
            this.c = c;
        }
    }
    static int[] closestNumbers(int[] arr) {
        LinkedList<Triple> triples = new LinkedList<>();
        int[] a = Arrays.stream(arr).sorted().toArray();
        int min=a[1]-a[0];
        for(int i=0;i<a.length-1;i++){
            int dis=a[i+1]-a[i];
            triples.add(new Triple(a[i],a[i+1],dis));
            min=Math.min(min,dis);
        }
        int finalMin = min;
        LinkedList<Integer> res=new LinkedList<>();
        triples.stream().filter(t->(int)t.c==finalMin).forEach(t->{
            res.add((int)t.a);
            res.add((int)t.b);
        });
        return res.stream().mapToInt(x->x).toArray();
    }
}
