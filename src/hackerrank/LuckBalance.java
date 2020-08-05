package hackerrank;

import java.util.Arrays;
import java.util.OptionalInt;

public class LuckBalance {
    static int luckBalance(int k, int[][] contests) {
        if(k==0)
            return Arrays.stream(contests).mapToInt(x->x[0]).sum();
        int min = Arrays.stream(contests).filter(x->x[1]!=0).mapToInt(x -> x[0]).min().orElse(0);
        return Arrays.stream(contests).mapToInt(x->x[0]).sum()-2*min;

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
