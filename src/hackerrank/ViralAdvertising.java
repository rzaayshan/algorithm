package hackerrank;

public class ViralAdvertising {
    static int func(int n, int sum,int day){
        if(day==0) return sum;

        int share = n/2;
        return func(3*share,sum+share,--day);
    }
    static int viralAdvertising(int n) {
        return func(5,0,n);
    }

    public static void main(String[] args) {
        System.out.println(viralAdvertising(3));
    }
}
