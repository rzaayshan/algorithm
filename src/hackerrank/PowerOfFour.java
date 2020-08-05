package hackerrank;

public class PowerOfFour {
    public static void main(String[] args) {
        System.out.println(funk(4));
        System.out.println(0x55);
    }

    static boolean funk(int n){
        Long x=Long.parseLong("1");
        while(n>x)
            x<<=2;
        return (n==x);
    }
}
