package hackerrank;

public class StrangeCounter {
    static long strangeCounter(long t) {
        int key=3;
        long i=3;
        while(t>1){
            if(t>i){
                t=t-i;
                System.out.println("t in if "+t);
            }
            else{
                while(i!=1 && t!=1){
                    i--;
                    t--;
                    System.out.println("t in while "+t);
                    System.out.println("i in while "+i);
                }
                t--;
            }
            key*=2;
            i=key;
        }
        return i;
    }

    public static void main(String[] args) {
        System.out.println(strangeCounter(17));
    }

}
