package hackerrank;

public class SaveThePrisoner {
    static int saveThePrisoner(int n, int m, int s) {
        m%=n;
//        int r=s+m-1;
//        if(r>s)
//            r%=n;

        int r=0;
        for(int i=0;i<m;i++){
            r++;
            if(r==n-1){
                r=0;
            }
        }
        return r;


    }

    public static void main(String[] args) {
        System.out.println(saveThePrisoner(3,7,3));
    }
}
