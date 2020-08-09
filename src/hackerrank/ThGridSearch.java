package hackerrank;

public class ThGridSearch {
    static String gridSearch(String[] G, String[] P) {
        for(int i=0;i<G.length;i++){
            int j=0;
            int k=i;
            while (k<G.length && G[k].equals(P[j])){
                j++;
                k++;
                if(j==P.length){
                    return "YES";
                }
            }
        }
        return "NO";


    }
}
