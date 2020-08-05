package hackerrank;

public class UtopianTree {
    static int utopianTree(int n) {
        int l = 1;
        for(int i=1;i<=n;i++){
            if((i&1)!=0){
                l*=2;
                continue;
            }
            l+=1;
        }
        return l;


    }
}
