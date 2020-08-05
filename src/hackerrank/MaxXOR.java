package hackerrank;

import java.util.Comparator;
import java.util.Optional;
import java.util.OptionalInt;
import java.util.stream.IntStream;
import java.util.stream.Stream;

public class MaxXOR {
    static int maximizingXor(int l, int r) {

        /*Stream<OptionalInt> optionalIntStream = IntStream.rangeClosed(l, r)
                .mapToObj(el -> IntStream.rangeClosed(l, r).map(el2 -> el ^ el2));*/
        int max=0;
        for(int i=l;i<=r;i++)
            for(int j=l;j<=r;j++){
                max=Math.max(max,i^j);
            }
        return max;


    }
}
