package hackerrank;

import java.util.Arrays;
import java.util.Map;
import java.util.stream.Collectors;
import java.util.stream.IntStream;

public class BeautifulTriplets {

    static class Triple<A,B,C>{
        final A a;
        final B b;
        final C c;

        Triple(A a, B b, C c) {
            this.a = a;
            this.b = b;
            this.c = c;
        }
    }

    static int beautifulTriplets1(int d, int[] arr) {
        return (int)IntStream.range(0,arr.length).boxed().flatMap(i->
                IntStream.range(i+1,arr.length).boxed().flatMap(j->
                        IntStream.range(j+1,arr.length).boxed().map(k->
                                new Triple<>(arr[i],arr[j],arr[k]))))
                .filter(t->t.b-t.a==d && t.c-t.b==d).count();
    }

    static int beautifulTriplets2(int d, int[] arr) {
        int []count={0};
        IntStream.range(0,arr.length).boxed().forEach(i->
                IntStream.range(i+1,arr.length).boxed().forEach(j->
                        IntStream.range(j+1,arr.length).boxed().forEach(k->{
                                    if(arr[j]-arr[i]==d && arr[k]-arr[j]==d)
                                        count[0]++;
                                }
                        )));
        return count[0];

    }

    static int beautifulTriplets(int d, int[] arr) {
        Map<Integer, Long> count = Arrays.stream(arr).boxed()
                .collect(Collectors.groupingBy(x -> x, Collectors.counting()));
        return (int)count.entrySet().stream()
                .filter(m->count.containsKey(m.getKey()+d)&&count.containsKey(m.getKey()+2*d))
                .mapToLong(m->m.getValue()).sum();
    }



    public static void main(String[] args) {
        System.out.println(beautifulTriplets(3,new int[]{1, 2, 4, 5, 7, 8, 10}));
    }
}
