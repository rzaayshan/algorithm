package hackerrank;

import java.util.Scanner;

public class Staircase {

    static void staircase(int n) {
        StringBuilder a = new StringBuilder();
        for(int i=0;i<n;i++){
//            int k=n-i;
//            while(k>0){
//                a.append(" ");
//                k--;
//            }
//
            for(int k=0;k<n-i-1;k++)
                a.append(" ");
            for(int j=0;j<i+1;j++)
                a.append("#");
            System.out.println(a);
            a.delete(0,a.length());

        }


    }



    public static void main(String[] args) {
        staircase(6);
        for(int j=0;j<0;j++)
            System.out.println("g");
    }
}
