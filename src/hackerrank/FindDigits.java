package hackerrank;

public class FindDigits {
    static int findDigits(int n) {
        int c=0;
        int k=n;
        while(k>0){
            int dig = k%10;
            System.out.println("dig"+dig);
            k/=10;
            System.out.println("k"+k);
            if(dig!=0 && n%dig==0)
                c++;
        }
        return c;

    }

    public static void main(String[] args) {
        System.out.println(findDigits(12));
    }

}
