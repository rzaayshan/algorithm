package hackerrank;

public class ANDproduct {
    static long andProduct(long a, long b) {
        long result=a;
        for(long i=a+1;i<=b;i++){
            result&=i;
        }
        return result;



    }

}
