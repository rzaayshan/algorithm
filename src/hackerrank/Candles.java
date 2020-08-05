package hackerrank;

import java.util.Arrays;
import java.util.OptionalInt;

public class Candles {
    static int birthdayCakeCandles(int[] ar) {
        /*int max = Arrays.stream(ar).max().getAsInt();
        return */
        int count=1;
        int max=ar[0];
        for(int i=1;i<ar.length;i++){
            if(ar[i]>max){
                count=1;
                max=ar[i];
            }
            else if(ar[i]==max){
                count++;
            }
        }
        return count;


    }

}
