package hackerrank;

import java.util.Arrays;
import java.util.OptionalInt;

public class TheHurdleRace {
    static int hurdleRace(int k, int[] height) {
        int result=Arrays.stream(height).max().getAsInt()-k;
        return Math.max(result, 0);


    }

}
