package leetcode;

import java.util.Arrays;
import java.util.LinkedList;
import java.util.List;
import java.util.stream.Collectors;
import java.util.stream.IntStream;
import java.util.stream.Stream;

public class Sum3 {
    public List<List<Integer>> threeSum(int[] a) {
        int n = a.length;
        List<List<Integer>> r = new LinkedList<>();
        IntStream.range(0,n-2).forEach(i->
                IntStream.range(i+1,n-1).forEach(j->
                        IntStream.range(j+1,n).filter(k->(a[i]+a[j]+a[k])==0).forEach(k->
                                r.add(Stream.of(a[i],a[j],a[k]).sorted().collect(Collectors.toList())))));

        return r.stream().distinct().collect(Collectors.toList());

    }
}
