package hackerrank;

import java.util.Arrays;
import java.util.stream.IntStream;

public class LeftRotation {
    static int[] rotLeft(int[] a, int d) {
        int []result=new int [a.length];
        int k=a.length-d;

        IntStream.range(0, k).forEach(i->result[i]=a[i+d]);
        IntStream.range(0,d).forEach(i->result[i+k]=a[i]);


        return result;



    }

    public static void main(String[] args) {
        Arrays.stream(rotLeft(new int[]{1, 2, 3, 4, 5}, 4)).forEach(x-> System.out.printf("%d ",x));
    }
}
