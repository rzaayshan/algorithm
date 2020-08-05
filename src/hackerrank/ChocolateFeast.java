package hackerrank;

public class ChocolateFeast {
    static int chocolateFeast(int n, int c, int m) {
        n=n/c;
        int res=n;
        while(n>=m){
            int rem=n%m;
            n=n/m;
            res+=n;
            n+=rem;
        }
        return res;
    }

    public static void main(String[] args) {
        System.out.println(chocolateFeast(10, 2, 5));
        System.out.println(chocolateFeast(12, 4, 4));
    }
}
