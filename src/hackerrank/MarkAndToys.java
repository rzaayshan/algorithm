package hackerrank;

import java.util.Arrays;

public class MarkAndToys {
    static int maximumToys(int[] prices, int k) {
        int count =0;
        int sum=0;
        int[] ps = Arrays.stream(prices).filter(p -> p < k).sorted().toArray();
        for (int p : ps) {
            sum = sum + p;
            if (sum >= k)
                break;
            count++;
        }
        return count;

    }
}
