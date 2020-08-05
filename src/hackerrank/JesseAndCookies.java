package hackerrank;

public class JesseAndCookies {
    static int cookies(int k, int[] A) {
        int r=0;
        for(int i=0;i<A.length-1;i++){
            if(A[i]<k && A[i+1]>k)
                return -1;
            if(A[i]<k && A[i+1]<k){
                A[i+1]=A[i]+2*A[i+1];
                r++;
            }

        }
        if(A[A.length-1]<k)
            return -1;
        return r;

    }

    public static void main(String[] args) {
        System.out.println(cookies(10, new int[]{1,1,1}));
    }
}
