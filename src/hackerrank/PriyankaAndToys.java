package hackerrank;

import java.util.Arrays;
import java.util.stream.Collectors;
import java.util.stream.IntStream;

public class PriyankaAndToys {
    static int toys1(int[] w) {
        int k=0;
        for(int i=0;i<w.length-1;i++){
            int min=w[i];
            while (i<w.length-1&&w[i+1]<min+4)
                i++;
            k++;
        }
        return k;


    }

    static int toys(int[] w) {
        int[] sorted = Arrays.stream(w).sorted().toArray();
        int k=0;
        for(int i=0;i<sorted.length;){
            int less = sorted[i];
            System.out.println(sorted[i]);
            while (i<sorted.length&&sorted[i]<=less+4)
                i++;
            k++;
        }
        return k;
    }
    public static void main(String[] args) {
        System.out.println(toys(new int[]{1, 2, 3, 21, 7, 12, 14, 21}));

    }
}
