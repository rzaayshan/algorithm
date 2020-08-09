package hackerrank;

import java.util.Arrays;

public class EqualStacks {
    static int equalStacks(int[] h1, int[] h2, int[] h3) {
        int s1 = Arrays.stream(h1).sum();
        int s2 = Arrays.stream(h2).sum();
        int s3 = Arrays.stream(h3).sum();
        int i=0, j=0, k=0;
        while (true){
            if(s1>s2 || s1>s3){
                s1-=h1[i++];
            }
            if(s2>s1 || s2>s3){
                s2-=h2[j++];
            }
            if(s3>s1 || s3>s2){
                s3-=h3[k++];
            }
            if(s1==s2 && s1==s3 && s2==s3)
                break;


        }

        return s1;

    }

    public static void main(String[] args) {
        System.out.println(equalStacks(new int[]{3, 2, 1, 1, 1}, new int[] {4, 3 ,2}, new int[]{1, 1, 4, 1}));
    }
}
