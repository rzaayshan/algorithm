package leetcode;

import java.io.OutputStream;

public class ReverseInteger {
    public static int reverse(int x) {
        if(x<Math.pow(-2,31) || x>(Math.pow(2,31)-1))
            return 0;
        boolean isMin=false;
        if(x<0){
            x*=(-1);
            isMin=true;
        }
        int r;
        int rev=0;
        while(x>0){
            r = x%10;
            rev=rev*10+r;
            if (rev > Integer.MAX_VALUE/10 || (rev == Integer.MAX_VALUE / 10 && r > 7)) return 0;
            if (rev < Integer.MIN_VALUE/10 || (rev == Integer.MIN_VALUE / 10 && r < -8)) return 0;
            x=x/10;

        }

        return isMin?(rev*(-1)):rev;

    }

    public static void main(String[] args) {
        System.out.println(Integer.MAX_VALUE);
        System.out.println(Integer.MIN_VALUE);
        System.out.println(reverse(-2147483412));
    }
}
