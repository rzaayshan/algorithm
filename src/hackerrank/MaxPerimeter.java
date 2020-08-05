package hackerrank;

import java.util.Arrays;
import java.util.HashMap;
import java.util.List;
import java.util.Map;
import java.util.stream.Collectors;
import java.util.stream.IntStream;

public class MaxPerimeter {
    static class Triplet<A,B,C>{
        final A a;
        final B b;
        final C c;

        Triplet(A a, B b, C c) {
            this.a = a;
            this.b = b;
            this.c = c;
        }
    }
    static int[] maximumPerimeterTriangle(int[] sticks) {
        int[] s = Arrays.stream(sticks).sorted().toArray();

        List<Triplet<Integer, Integer, Integer>> tri = IntStream.range(0, sticks.length - 2).boxed().flatMap(i ->
                IntStream.range(i + 1, s.length - 1).boxed().flatMap(j ->
                        IntStream.range(j + 1, s.length).filter(k -> s[i] + s[j] > s[k]).boxed().map(k ->
                                new Triplet<>(s[i],s[j], s[k]))
                )).collect(Collectors.toList());
        if(tri.size()==0) return new int[]{-1};
        Triplet<Integer,Integer, Integer> max= tri.get(tri.size()-1);
        return new int[]{max.a,max.b,max.c};
    }

    public static void main(String[] args) {
        System.out.println(Arrays.toString(maximumPerimeterTriangle(new int[]{3, 9, 2, 15, 3})));
    }

}
