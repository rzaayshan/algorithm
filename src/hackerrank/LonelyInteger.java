package hackerrank;

import java.util.Arrays;

public class LonelyInteger {
    static int lonelyinteger(int[] a) {
        int[] sum ={0};
        Arrays.stream(a).forEach(el->sum[0]=sum[0]^el);
        return sum[0];


    }
}
