package hackerrank;

import java.util.Arrays;

public class Encryption2 {
    static String encryption(String s) {
        int len = s.length();
        int row = (int) Math.sqrt(len);
        int col = (int) Math.ceil(Math.sqrt(len));
        row = row*col<len?row+1:row;
        int[][] a = new int [row][col];

        int k=0;
        StringBuilder r = new StringBuilder();

        FIRST: for(int i=0; i<row; i++){
            for(int j=0; j<col; j++){
                a[i][j]=s.charAt(k++);
                if(k>=len)
                    break FIRST;
            }
        }

        for(int j=0; j<col; j++){
            for(int i=0; i<row; i++){
                char c = (char) a[i][j];
                if(a[i][j]==0)
                    continue;
                r.append(c);

            }
            r.append(" ");
        }

        return r.toString();




    }

    public static void main(String[] args) {
        System.out.println((int) Math.sqrt(10));
        System.out.println((int) Math.ceil(Math.sqrt(10)));
        System.out.println(encryption("feedthedog"));
    }
}
