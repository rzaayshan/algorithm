package hackerrank;

public class StrangeCounter {
    static long strangeCounter(long t) {
        long c=3;
        long k=3;
        long i=t;
        while (i>1) {
            if(i>k){
                i-=k;
                k=0;
            }
            else{
                k--;
                i--;
            }
            if(k==0){
                c=c*2;
                k=c;
            }

        }
        return k;
    }

    public static void main(String[] args) {
        System.out.println(strangeCounter(4));
    }

}
