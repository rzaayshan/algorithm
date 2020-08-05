package hackerrank;

import java.util.ArrayList;
import java.util.List;

public class BeautifulDays {
    static long reverse(long n){
        long i=-1;
        long result=0;
        List<Integer> rems = new ArrayList<>();
        while(n>0){
            int rem = (int)n%10;
            rems.add(rem);
            n/=10;
            i++;
        }
        for(int r: rems){
            result+=r*Math.pow(10,i--);
        }
        return result;
    }
    static int beautifulDays(long i, long j, long k) {
        int c=0;
        for(long t=i;t<=j;t++){
            if(Math.abs(t-reverse(t))%k==0)
                c++;
        }
        return c;
    }
}
