package hackerrank;

import java.util.function.Function;
import java.util.function.Predicate;

public class DrawingBook {

    static int pageCount(int n, int p) {
        /*int c = 0;
        Function<Integer, Integer> f;
        Predicate<Integer> pred;
        int i;
        if(p-1>n-p){
            i=2;
            f = x->x+2;
            pred = x->(x==p) || (x-1==p);
        }
        else{
            i=n-1;
            f = x->x-2;
            pred = x->(x==p) || (x+1==p);
        }
        while (!pred.test(i)){
            i=f.apply(i);
            System.out.println(i+" "+c);
            c++;
        }
        return c;*/
        /*int c=0;
        int i;
        if(p==1 || p==n)
            return c;
        if(p-1<n-p){
            i=1;
            while(i!=p && i-1!=p){
                c++;
                i+=2;
            }
        }
        else {
            i = (n & 1) == 0 ? n - 1 : n;
            while (i != p && i - 1 != p) {
                c++;
                i -= 2;
            }
        }*/

        /*if(p<=n-p)
            return p/2;
        if((p&1)==0 && p==n-1)
            return 1;
        return (n-p)/2;*/
        return p<=n-p ? p/2 : ((p&1)==0 && p==n-1 ? 1 : (n-p)/2);
    }

    public static void main(String[] args) {
        System.out.println(pageCount(2,1));
    }
}
