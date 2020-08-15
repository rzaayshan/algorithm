package hackerrank;

import java.util.Arrays;
import java.util.List;
import java.util.stream.Collectors;
import java.util.stream.IntStream;

public class LuckBalance {
    static int luckBalance(int k, int[][] contests) {
        int sum = Arrays.stream(contests).mapToInt(a->a[0]).sum();
        List<Integer> imp = Arrays.stream(contests).filter(a -> a[1] == 1)
                .map(a -> a[0])
                .sorted()
                .collect(Collectors.toList());
        int minus = IntStream.range(0, imp.size()-k).map(i -> imp.get(i)).sum();
        return (sum-2*minus);


    }

    public static void main(String[] args) {
        int s = 10+3+13+21+31+17+20+8+21;
        System.out.println(s);
        System.out.println(luckBalance(3,new int[][]{{3, 1},
                {13, 1},
                {21, 1},
                {31, 1},
                {17, 1},
                {20, 1},
                {8, 1},
                {12, 0},
                {14, 0},
                {21, 1}}));
    }
}
