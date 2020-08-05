package hackerrank;

import java.security.cert.CollectionCertStoreParameters;
import java.util.Arrays;
import java.util.List;
import java.util.stream.Collectors;

public class SockMerchant {
    static int sockMerchant(int n, int[] ar) {
        int max = max(ar);
        int []c=new int[max+1];
        int r=0;
        for(int el: ar){
            if(c[el]==0)
                c[el]++;
            else{
                r++;
                c[el]=0;
            }
        }
        return r;
    }

    static int max(int []ar){
        int[] max ={0};
        Arrays.stream(ar).forEach(el->{if(el>max[0]) max[0]=el;});
        return max[0];
    }
}
