package hackerrank;

public class CounterGame {
    static String counterGame(long n) {
        int who=0;
        int pow;
        int a=1;//L2 1 A2 2 R1 3
        //132 0 L4 1 R2 2 L1 3
        //L2 1 R1 2
        while(true){
            if(n!=1 && (n&(n-1))==0){
                n>>=1;
            }
            else{
                pow=(int)(Math.log10(n)/Math.log10(2));
                a <<= pow;
                n-=a;
            }
            who++;
            if(n==1){
                if(who!=1&&(who&(who-1))==0)
                    return "Richard";
                else return "Louise";
            }
        }
    }

    public static void main(String[] args) {
        System.out.println(counterGame(6));
        int a=129;
        int b = 129&128;
        System.out.println((a&(a-1)));
        System.out.println(b);

        //System.out.println(1<<(int)Math.log(132));
        //System.out.println(Math.log10(132)/Math.log10(2));
    }

}
