package hackerrank;

import java.util.Arrays;

public class FillingJars {
    static int solve(int n, int[][] operations) {
        return (int) Math.floor((Arrays.stream(operations)
                .map(a->(a[1]-a[0]+1)*a[2]).mapToDouble(a->a)
                .sum())/(double) n);


    }

    public static void main(String[] args) {
        System.out.println(solve(4, new int[][]{
                {2, 3, 603},
                {1, 1, 286},
                {4, 4, 882}
        }));
    }
}
