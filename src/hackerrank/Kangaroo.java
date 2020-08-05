package hackerrank;

public class Kangaroo {
    
    static String kangaroo(int x1, int v1, int x2, int v2) {
        return canBeSolved(x1,v1,x2,v2) && solve(x1,v1,x2,v2) ? "YES" : "NO";
    }

    private static boolean solve(int x1, int v1, int x2, int v2) {
        double n = (double)(x1-x2)/(v2-v1);
        return n==(int)n;
    }

    private static boolean canBeSolved(int x1, int v1, int x2, int v2) {
        return !((x1 > x2 && v1 > v2) || (x1 < x2 && v1 < v2));
    }


}
