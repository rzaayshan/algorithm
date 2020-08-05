import java.util.*;
import java.sql.*;


public class Test {
    public static void main(String[] args) {
//        System.out.println(0101);
//        System.out.println(06);
//        System.out.println(01);
//        System.out.println(053);
//        System.out.println(0XDeadCafe);
//        System.out.println(1_458);
//        float f = .05f;
//        double d = 34e3;
//        System.out.println(f);
//        System.out.println(d);

//        boolean b1, b2, b3, b4;
//        b1= b2 = b3 = b4 = false;
//        boolean result = (b3 == true) && (b1 = true) || (b2 = true) && (b4=true)  ;
//        System.out.printf("b1:%b b2:%b b3:%b b4:%b result:%b", b1, b2, b3, b4, result);

//        boolean a = true;
//        boolean b = false;
//        boolean c = true;
//        if (a == true) {
//            if (b == true) {
//                if (c == true) {
//                    System.out.println(1);
//                } else {
//                    System.out.println(2);
//                }
//            } else if (a && (b = c)) {
//                System.out.println(3);
//            } else {
//                System.out.println(4);
//            }
//        }


        int[][] complexArray = {{1, 2, 3, 4}, {5, 6, 7, 8}, {9, 10, 11, 12}};
        OUTER_LOOP: for (int[] simpleArray : complexArray) {
            INNER_LOOP: for (int i = 0; i < simpleArray.length; i++) {
                System.out.print(simpleArray[i] + "\t");
            }
            System.out.println();
        }

//        while (true) {
//            if (false)
//                System.out.println("in loop");
//        }
//        System.out.println("after loop");

//        while (true) {
//            if (false) break;
//            System.out.println("in loop");
//        }
//        System.out.println("after loop");

//        while (true) {
//            if (false) break;
//            else continue;
//            System.out.println("in loop");
//        }
        System.out.println("after loop");

//        while (true) {
//            System.out.println("in loop");
//        }
//        int x = 5;
//        while(x >= 0){
//            int y = 3;
//            while(y > 0){
//                if(x < 2) continue;
//                x--; y--;
//                System.out.println(x*y + " ");
//            }
//        }







    }


}


enum Seasons { WINTER, SPRING, SUMMER, AUTUMN }
