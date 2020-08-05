package hackerrank;

import java.util.Arrays;
import java.util.Scanner;
import java.util.concurrent.atomic.AtomicInteger;

public class PlusMinus {

    static void plusMinus(int[] arr) {
        double []sPlus= {0};
        double []sMinus={0};
        double []sZero={0};
        int len = arr.length;

        Arrays.stream(arr).forEach(x->{
            if(x>0) sPlus[0]+=1;
            else if(x<0) sMinus[0]+=1;
            else sZero[0]+=1;
        });

        sPlus[0]=sPlus[0]/len;
        sMinus[0]=sMinus[0]/len;
        sZero[0]=sZero[0]/len;
        System.out.printf("%f\n%f\n%f",sPlus[0],sMinus[0],sZero[0]);


    }

    private static final Scanner scanner = new Scanner(System.in);

    public static void main(String[] args) {
        int n = scanner.nextInt();
        scanner.skip("(\r\n|[\n\r\u2028\u2029\u0085])?");

        int[] arr = new int[n];

        String[] arrItems = scanner.nextLine().split(" ");
        scanner.skip("(\r\n|[\n\r\u2028\u2029\u0085])?");

        for (int i = 0; i < n; i++) {
            int arrItem = Integer.parseInt(arrItems[i]);
            arr[i] = arrItem;
        }

        plusMinus(arr);

        scanner.close();
    }
}
