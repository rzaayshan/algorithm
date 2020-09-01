package iba;

public class ReverseNumber {
    static int reverse(int n){
        boolean flag=false;
        if(n<0){
            n*=-1;
            flag=true;
        }
        int rev=0;
        int rem;
        while(n!=0){
            rem=n%10;
            rev=rev*10+rem;
            n=n/10;
        }
        return flag?rev*-1:rev;
    }

    public static void main(String[] args) {
        System.out.println(reverse(-123234));
    }
}
