package hackerrank;

public class BreakingRecords {
    static int[] breakingRecords(int[] scores) {
        int [] result = {0,0};
        int min=scores[0];
        int max=scores[0];
        for (int s : scores) {
            if (s < min) {
                min = s;
                result[1]++;
            } else if (s > max) {
                max = s;
                result[0]++;
            }
        }
        return result;
    }
}
