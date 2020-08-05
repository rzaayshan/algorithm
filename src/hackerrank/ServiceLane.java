package hackerrank;

import java.util.Arrays;
import java.util.stream.IntStream;

public class ServiceLane {
    static int[] serviceLane(int []width, int[][] cases) {
        return Arrays.stream(cases).mapToInt(c->
            IntStream.rangeClosed(c[0],c[1]).map(i->
                    width[i]).min().orElse(0)
        ).toArray();
    }

    public static void main(String[] args) {
        System.out.println(
                Arrays.toString(serviceLane(new int[]{2, 3, 1, 2, 3, 2, 3, 3}, new int[][]{{0, 3}, {4, 6}})));
    }
}
