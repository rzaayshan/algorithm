package hackerrank;

import java.util.Arrays;

public class MarcCakeWalk {
    static long marcsCakewalk(int[] calorie) {
        int[] j = {calorie.length - 1};
        return (long) Arrays.stream(calorie).sorted().mapToDouble(c->c*Math.pow(2,j[0]--)).sum();


    }
}
