package hackerrank;

public class SequenceEquation {

    static  int []indOf(int []p){
        int n = p.length;
        int []rev = new int[n];
        for(int i=0;i<n;i++){
            rev[p[i]-1]=i;
        }
        return rev;
    }
    static int[] permutationEquation(int[] p) {
        int n=p.length;
        int []indOf = indOf(p);
        int []result = new int [n];
        for(int i=0;i<n;i++){
            int f = indOf[i];
            int s = indOf[f];
            result[i]=s+1;
        }
        return result;
    }
}
